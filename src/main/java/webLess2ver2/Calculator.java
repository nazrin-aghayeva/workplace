package webLess2ver2;

import java.util.function.BiFunction;

public class Calculator {

  class Result {
    int res;
    String errorMessage;
  }

  // NumberFormatException
  private int toInt(String orig) {
    return Integer.parseInt(orig);
  }

  public String doOperation(String xs, String ys, String ops) {
    String res;
    try {
      int x = toInt(xs);
      int y = toInt(ys);
      int r = doParse(x,y, ops);
      res = String.valueOf(r);
    } catch (NumberFormatException ex) {
      res = "Number is in wrong format";
    } catch (IllegalArgumentException ex) {
      res = ex.getMessage();
    } catch (ArithmeticException ex) {
      res = "Division by zero caught";
    } catch (Exception x) {
      res = String.format("Smth went wrong %s", x.getMessage());
    }
    return res;
  }

  private int doOpCore(int x, int y, BiFunction<Integer, Integer, Integer> f) {
    return f.apply(x, y);
  }

  public int doParse(int x, int y, String ops) {
    switch (ops) {
      case "add": return doOpCore(x, y, (a, b) -> a + b);
      case "sub": return doOpCore(x, y, (a, b) -> a - b);
      case "mul": return doOpCore(x, y, (a, b) -> a * b);
      case "div": return doOpCore(x, y, (a, b) -> a / b);
      default: throw new IllegalArgumentException("Wrong Operation");
    }
  }
}

package webLesson2;

import com.sun.codemodel.internal.JCase;

public class Calculator {
  public String doOperation(String x, String y, String op) {
    if (op.equals("multiply")) {
      int result = Integer.parseInt(x) * Integer.parseInt(y);
      return String.valueOf(result);
    }
    else if(op.equals("divide")) {
      int result1 = Integer.parseInt(x) / Integer.parseInt(y);
      return String.valueOf(result1);
    }
    else if(op.equals("subtract")) {
      int result2 = Integer.parseInt(x) - Integer.parseInt(y);
      return String.valueOf(result2);
    }
    else if(op.equals("add")) {
      int result3 = Integer.parseInt(x) + Integer.parseInt(y);
      return String.valueOf(result3);
    }
    else if(y.equals("0")) {
      return "division by zero";
    }
    else{
      return "can't converted";
    }
  }
}

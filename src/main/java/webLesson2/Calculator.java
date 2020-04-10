package webLesson2;

import com.sun.codemodel.internal.JCase;

public class Calculator {
  public String doOperation(String x, String y, String op) {
    if (op == "multiply") {
      int result = Integer.parseInt(x) * Integer.parseInt(y);
      return String.valueOf(result);

    }
    else if(op=="divide") {
      int result1 = Integer.parseInt(x) / Integer.parseInt(y);
      return String.valueOf(result1);
    }
    else if(op=="subtract") {
      int result2 = Integer.parseInt(x) - Integer.parseInt(y);
      return String.valueOf(result2);
    }
    else if(op=="add") {
      int result3 = Integer.parseInt(x) + Integer.parseInt(y);
      return String.valueOf(result3);
    }
    else if(y=="0") {
      return "division by zero";
    }
    else{
      return "can't converted";
    }
  }
}

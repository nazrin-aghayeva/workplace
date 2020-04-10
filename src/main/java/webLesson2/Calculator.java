package webLesson2;

import com.sun.codemodel.internal.JCase;

public class Calculator {
  public String doOperation(String x, String y, String op) {
   int a= Integer.parseInt(x);
   int b= Integer.parseInt(y);
    if (op.equals("multiply")) {
      return String.valueOf(a*b);
    }
    else if(op.equals("divide")) {
      return String.valueOf(a/b);
    }
    else if(op.equals("subtract")) {
      return String.valueOf(a-b);
    }
    else if(op.equals("add")) {
      return String.valueOf(a+b);
    }
    else if(y.equals("0")) {
      return "division by zero";
    }
    else{
      return "can't converted";
    }
  }
}

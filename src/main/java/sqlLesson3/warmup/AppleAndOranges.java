package sqlLesson3.warmup;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;

public class AppleAndOranges {

  static void countApplesAndOranges1(int s, int t, int a, int b, int[] apples, int[] oranges) {
    long ac = Arrays.stream(apples).map(x -> x + a).filter(x -> x >= s && x <= t).count();
    long oc = Arrays.stream(oranges).map(x -> x + b).filter(x -> x >= s && x <= t).count();
    System.out.printf("%d\n%d", ac, oc);
  }

  static void countApplesAndOranges2(int s, int t, int a, int b, int[] apples, int[] oranges) {
//    IntPredicate p = new IntPredicate() {
//      @Override
//      public boolean test(int x) {
//        return x >= s && x <= t;
//      }
//    };
    IntPredicate p = x -> x >= s && x <= t;
    long ac = Arrays.stream(apples).map(x -> x + a).filter(p).count();
    long oc = Arrays.stream(oranges).map(x -> x + b).filter(p).count();
    System.out.printf("%d\n%d", ac, oc);
  }

  static void countApplesAndOranges3(int s, int t, int a, int b, int[] apples, int[] oranges) {
    IntUnaryOperator plus5 = new IntUnaryOperator() {
      @Override
      public int applyAsInt(int operand) {
        return operand + 5;
      }
    };
    IntPredicate p = x -> x >= s && x <= t;
    Function<Integer, IntUnaryOperator> plus = y -> x -> x + y;
    long ac = Arrays.stream(apples).map(plus.apply(a)).filter(p).count();
    long oc = Arrays.stream(oranges).map(plus.apply(b)).filter(p).count();
    System.out.printf("%d\n%d", ac, oc);
  }

  static void countApplesAndOranges4(int s, int t, int a, int b, int[] apples, int[] oranges) {
    IntPredicate p = x -> x >= s && x <= t;
    Function<Integer, IntUnaryOperator> plus = y -> x -> x + y;
    IntUnaryOperator plusa = plus.apply(a);
    IntUnaryOperator plusb = plus.apply(b);
    BiFunction<int[], IntUnaryOperator, Long> count = (array, f) ->
        Arrays.stream(array).map(f).filter(p).count();

//    Scala ;)
//    long ac = count(apples,  plus(a));
//    long oc = count(oranges, plus(b));
    long ac = count.apply(apples, plusa);
    long oc = count.apply(oranges, plusb);
    System.out.printf("%d\n%d", ac, oc);
  }

}

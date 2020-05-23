package stepProject2.predicate;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class PredicatesApp {

  // all match
  static boolean isAllPositive(int[] data, IntPredicate cond) {
    boolean r = true;
    for (int item: data) {
      r = r && cond.test(item);
    }
    return r;
  }

  // any match
  static boolean isAtLeastOnePositive(int[] data, IntPredicate cond) {
    for (int item: data) {
      if (cond.test(item)) return true;
    }
    return false;
  }

  static boolean isAtLeastOnePositive2(int[] data, IntPredicate cond) {
    return Arrays.stream(data).anyMatch(cond);
  }

  static boolean isAllPositive2(int[] data, IntPredicate cond) {
    return Arrays.stream(data).allMatch(cond);
  }

  static boolean isNonePositive2(int[] data, IntPredicate cond) {
    return Arrays.stream(data).noneMatch(cond);
  }

  public static void main(String[] args) {
    int[] data = {1,2,3,-10};
    isAllPositive(data, x -> x >0);
  }

}

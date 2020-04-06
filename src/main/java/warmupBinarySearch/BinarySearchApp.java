package warmupBinarySearch;

import java.util.Arrays;
import java.util.Random;

public class BinarySearchApp {
  static int[] data = new Random().ints(0, 10000).limit(1000).toArray();
  static int[] sorted = data.clone();

  // count number of `if` statements
  // executed to find the given element
  // we need to return `boolean` and `index` and `count`
  static int find_conventional(int[] origin, int number) {
    int counter = 0;
    for (int el: origin) {
      counter++;
      if (el == number) break;
    }
    return counter;
  }

  // count number of `if` statements
  // executed to find the given element
  // we need to return `boolean` and `index` and `count`
  static int find_binary(int[] origin, int number) {
    int counter = 0;
    int l = 0;
    int r = origin.length - 1;
    while (l < r) {
      counter++;
      int m = (l + r) / 2;
      if (number == origin[m])
       break;
      if (number > origin[m]) l = m + 1;
      else r = m - 1;

    }
    return counter;
  }
  static boolean find_binary_bool(int[] origin, int number) {
    int counter = 0;
    int l = 0;
    int r = origin.length - 1;
    boolean flag=false;
    while (l < r) {
      counter++;
      int m = (l + r) / 2;
      if (number == origin[m]) {
        flag = true;
      }
      if (number > origin[m]) l = m + 1;
      else r = m - 1;

    }
    return flag;
  }

  static int find_binary_ind(int[] origin, int number) {
    int id=0;
    int l = 0;
    int r = origin.length - 1;
    while (l < r) {
      int m = (l + r) / 2;
      if (number == origin[m]){
        id = m;
      break;
    }
      if (number > origin[m]) l = m + 1;
      else r = m - 1;

    }
    return id;
  }




  public static void main(String[] args) {
    Arrays.sort(sorted);
//    System.out.println(Arrays.toString(data));
//    System.out.println(Arrays.toString(sorted));
//    int rnd_idx = 249+500; // it means index == m on particular iteration
    int rnd_idx = (int) (Math.random()*1000);
    int rnd = sorted[rnd_idx];
    int count1 = find_conventional(data, rnd);
    int count2 = find_binary(sorted, rnd);
    boolean bool = find_binary_bool(sorted, rnd);
    int index = find_binary_ind(sorted, rnd);

    System.out.println(count1);
    System.out.println(count2);
    System.out.println(bool);
    System.out.println(index);
  }
}

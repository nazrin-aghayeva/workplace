package arrayPrintFormats;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrintMatrixV {
  private static String dataOrderedV(int R, int C, int[][] a) {
    return IntStream.range(0, R * C).map(idx -> {
      int col_r = idx / R;
      int shift = idx % R;
      int row = (col_r&1)==0 ? shift : R-1-shift;
      int col = C-1-col_r;
      return a[row][col];
    }).mapToObj(String::valueOf)
        .collect(Collectors.joining(" "));
  }

  public static void main(String[] args) {

    int[][]a =
        {
            {  1,  2,  3 },
            {  5,  6,  7 },
            {  9, 10, 11 },
            { 13, 14, 15 },
            { 17, 18, 19 },
            { 21, 22, 23 },
        };

    System.out.println(dataOrderedV(a.length, a[0].length, a));
  }

}

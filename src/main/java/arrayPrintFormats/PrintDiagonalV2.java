package arrayPrintFormats;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;


public class PrintDiagonalV2 {

  private static String traverse(int R, int C, int[][] a) {

    final List<Integer> result = new LinkedList<>();

    class Track {
      final int r;
      final int c;
      final int dir;

      Track() {
        this(0,0,0);
      }

      Track(int r, int c, int dir) {
        this.r = r;
        this.c = c;
        this.dir = dir;
      }

      Track c(int delta) {
        return new Track(r, c+delta, dir);
      }

      Track r(int delta) {
        return new Track(r+delta, c, dir);
      }

      Track dir(int newDir) {
        return new Track(r, c, newDir);
      }

      boolean isRowFirst() {
        return r == 0;
      }

      boolean isRowLast() {
        return r == R-1;
      }

      boolean isColFirst() {
        return c == 0;
      }

      boolean isColLast() {
        return c == C-1;
      }

      void add(int value) {
        result.add(value);
      }

      Track nextStep() {
        add(a[r][c]);
        switch (dir) {
          case 1:
            if      (isRowLast() ) return c(1).dir(2);
            else if (isColFirst()) return r(1).dir(2);
            else                   return r(1).c(-1);
          case 2:
            if      (isColLast() ) return r(1).dir(1);
            else if (isRowFirst()) return c(1).dir(1);
            else                   return r(-1).c(1);
          default:                 return c(1).dir(1);
        }
      }

    }

    class Iterate {
      Track step(int n, Track t) {
        if (n==0) return t;
        return step(n-1, t.nextStep());
      }
    }

    // we need just R * C iteration for step
    new Iterate().step(R * C, new Track());

    return result.stream()
        .map(String::valueOf)
        .collect(Collectors.joining(" "));
  }

  public static void main(String[] args) {
    int[][]a = {
        {  1,  2,  3,  4, },
        {  5,  6,  7,  8, },
        {  9, 10, 11, 12, },
        { 13, 14, 15, 16, },
        { 17, 18, 19, 20, },
        { 21, 22, 23, 24, },
        { 25, 26, 27, 28, },
    };
    System.out.println("1 2 5 9 6 3 4 7 10 13 17 14 11 8 12 15 18 21 25 22 19 16 20 23 26 27 24 28");
    System.out.println(traverse(a.length, a[0].length, a));
  }

}

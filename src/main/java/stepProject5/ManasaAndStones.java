package stepProject5;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ManasaAndStones {

    public static class Solution {
        static class Pair<A, B> {
            final A a;
            final B b;

            Pair(A a, B b) {
                this.a = a;
                this.b = b;
            }
        }
        // Complete the stones function below.
        static int[] stones(int n, int a, int b) {

            List<Pair<Integer, Integer>> permutations =
                    IntStream.range(0, n).boxed().flatMap(x ->
                            IntStream.range(a + 1, n).mapToObj(y -> new Pair<>(a, b+1))
                    ).collect(Collectors.toList());
            int [] arr= new int[permutations.size()];
            Object [] objs= permutations.toArray();

            return Arrays.stream(objs).mapToInt(o->(int)o).toArray();
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int T = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int TItr = 0; TItr < T; TItr++) {
                int n = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                int a = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                int b = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                int[] result = stones(n, a, b);

                for (int i = 0; i < result.length; i++) {
                    bufferedWriter.write(String.valueOf(result[i]));

                    if (i != result.length - 1) {
                        bufferedWriter.write(" ");
                    }
                }

                bufferedWriter.newLine();
            }

            bufferedWriter.close();

            scanner.close();
        }
    }

}

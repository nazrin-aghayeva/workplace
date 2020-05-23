//package stepProject2;
//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
//
//public class HappyLadybugs {
//
//
//    public static class Solution {
//        static class Pair<A, B> {
//            final A a;
//            final B b;
//
//            Pair(A a, B b) {
//                this.a = a;
//                this.b = b;
//            }
//        }
//
//
//        // Complete the happyLadybugs function below.
//        static String happyLadybugs(String b) {
//            int len= b.length();
//           List<Pair<String,String>> permutations= IntStream.range(0, len).boxed().flatMap(a ->
//                   IntStream.range(a + 1, len).mapToObj(d->new Pair<>(a,d))).collect(Collectors.toList());
//        }
//
//        private static final Scanner scanner = new Scanner(System.in);
//
//        public static void main(String[] args) throws IOException {
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//            int g = scanner.nextInt();
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//            for (int gItr = 0; gItr < g; gItr++) {
//                int n = scanner.nextInt();
//                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//                String b = scanner.nextLine();
//
//                String result = happyLadybugs(b);
//
//                bufferedWriter.write(result);
//                bufferedWriter.newLine();
//            }
//
//            bufferedWriter.close();
//
//            scanner.close();
//        }
//    }
//
//}

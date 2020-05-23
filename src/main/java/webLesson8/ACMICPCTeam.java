package webLesson8;
import java.io.*;
import java.util.*;


public class ACMICPCTeam {


    public static class Solution {

        // Complete the acmTeam function below.
//        static int[] acmTeam(String[] topic) {
//            int count=0;
//            for (int i=0;i<topic.length;i++){
//                for (int j=i++; j<topic.length;i++){
////                    if ((topic[i] | topic[j])==1){
////                        count++;
////                    }
//                }
//            }
//        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            String[] nm = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nm[0]);

            int m = Integer.parseInt(nm[1]);

            String[] topic = new String[n];

            for (int i = 0; i < n; i++) {
                String topicItem = scanner.nextLine();
                topic[i] = topicItem;
            }

//            int[] result = acmTeam(topic);

//            for (int i = 0; i < result.length; i++) {
//                bufferedWriter.write(String.valueOf(result[i]));
//
//                if (i != result.length - 1) {
//                    bufferedWriter.write("\n");
//                }
//            }

            bufferedWriter.newLine();

            bufferedWriter.close();

            scanner.close();
        }
    }

}

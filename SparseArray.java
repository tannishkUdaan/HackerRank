import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the findSuffix function below.
     */
    static int findSuffix(String[] collections, String queryString) {
        /*
         * Write your code here.
         */
        int count = 0;
        for(int i=0;i<collections.length;i++){
            if(collections[i].equals(queryString))
                count++;
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scanner.nextLine().trim());

        String[] strings = new String[n];

        for (int stringsItr = 0; stringsItr < n; stringsItr++) {
            String stringsItem = scanner.nextLine();
            strings[stringsItr] = stringsItem;
        }

        int q = Integer.parseInt(scanner.nextLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String queryString = scanner.nextLine();

            int res = findSuffix(strings, queryString);

            bufferedWriter.write(String.valueOf(res));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}


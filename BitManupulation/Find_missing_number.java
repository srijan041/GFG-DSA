import java.util.*;
import java.io.*;

public class Find_missing_number {
    // For fast input output
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            try {
                br = new BufferedReader(
                        new FileReader("input.txt"));
                PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
                System.setOut(out);
            } catch (Exception e) {
                br = new BufferedReader(new InputStreamReader(System.in));
            }
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static int getMissing(int arr[]) {
        int res = 0;
        int i = 0;
        for (; i < arr.length; i++) {
            res = res ^ arr[i];
            res = res ^ i + 1;

        }
        return res ^ i + 1;
    }

    // end of fast i/o code
    public static void main(String[] args) {
        FastReader reader = new FastReader();
        int[] arr = { 1, 5, 3, 2 };

        System.out.println(getMissing(arr));

    }
}
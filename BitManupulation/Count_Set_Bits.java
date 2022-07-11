import java.util.*;
import java.io.*;

public class Count_Set_Bits {
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

    static int countSetBits(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {          //O(1)
            if (((n >>> i) & 1) == 1)
                count++;
        }

        /*
         * while (n > 0) { O(logn)
         * count += n & 1;
         * n = n >> 1;
         * }
         */
        return count;
    }

    // end of fast i/o code
    public static void main(String[] args) {
        FastReader reader = new FastReader();
        System.out.println(countSetBits(7));
    }
}
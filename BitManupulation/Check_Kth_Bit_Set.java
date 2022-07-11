import java.util.*;
import java.io.*;

public class Check_Kth_Bit_Set {
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

    boolean is_kth_bit_set(int n, int k) {
        // using left shift, (n & (1 << (k-1))) which is same as 2^k-1.
        // if above expression gives non-0, true, else false
        // using right shift, ((n>>(k-1)) & 1) here we move kth bit of n to right most
        // if above expression gives 1, true, else false

        return ((n & (int) Math.pow(2, k - 1)) == Math.pow(2, k - 1));
    }

    // end of fast i/o code
    public static void main(String[] args) {
        FastReader reader = new FastReader();
        int n = reader.nextInt();
        int k = reader.nextInt();

        Check_Kth_Bit_Set ckb = new Check_Kth_Bit_Set();
        if (ckb.is_kth_bit_set(n, k))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}





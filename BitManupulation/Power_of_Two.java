
import java.util.*;
import java.io.*;

public class Power_of_Two {
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

    static boolean isPowerOfTwo(int n) {

        // can use Brian Kerningam's algo. logic = there is only 1 set bit in 2's power
        // return(n!=0) && (n & (n-1) == 0)) this unsets the right most set bit
        double d = (Math.log(n) / Math.log(2));
        int i = (int) (Math.log(n) / Math.log(2));
        return (d == i);
    }

    // end of fast i/o code
    public static void main(String[] args) {
        FastReader reader = new FastReader();
        // int n = reader.nextInt();
        System.out.println(isPowerOfTwo(4));

    }
}
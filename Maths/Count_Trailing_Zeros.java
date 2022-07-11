import java.util.*;

public class Count_Trailing_Zeros {
    /*
     * long getFactorial(int n) {
     * long res = 1;
     * for (int i = 2; i <= n; i++) {
     * res *= i;
     * }
     * return res;
     * }
     * 
     * int getZeroCount(long num) {
     * int numOfZeros = 0;
     * while (num % 10 == 0) {
     * numOfZeros++;
     * num /= 10;
     * }
     * return numOfZeros;
     * }
     * 
     * public static void main(String[] args) {
     * Count_Trailing_Zeros ctz = new Count_Trailing_Zeros();
     * Scanner sc = new Scanner(System.in);
     * 
     * int n = sc.nextInt();
     * int res = ctz.getZeroCount(ctz.getFactorial(n));
     * System.out.println(res);
     * }
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int countOfZero = 0;

        // int maxPowerOfFive = (int) (Math.log(n) / Math.log(5.0));
        // System.out.println(maxPowerOfFive);

        // for (int i = 1; i <= maxPowerOfFive; i++) {
        // countOfZero += (n / Math.pow(5, i));
        // }

        for (int i = 5; i <= n; i = i * 5) {
            countOfZero += n / i;
        }

        System.out.println(countOfZero);
    }
}
import java.util.*;

public class PrimeFactors {

    boolean isPrime(int n) {

        // if (n == 2 || n == 3)
        // return true;

        // return ((n + 1) / 6.0 == (n + 1) / 6 || (n - 1) / 6.0 == (n - 1) / 6);

        if (n == 1)
            return false;
        if (n == 2 || n == 3)
            return true;

        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    void getPrimeFactors(int n, int k) {
        // n = number whose prime factor we need
        // k = the prime divisor
        if (k > n)
            return;
        else {
            if (n % k == 0 && isPrime((k))) {
                System.out.print(k + " ");
                getPrimeFactors(n / k, k);
            } else {
                getPrimeFactors(n, k + 1);
            }

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrimeFactors pf = new PrimeFactors();

        int n = sc.nextInt();
        pf.getPrimeFactors(n, 2);
    }
}


import java.util.*;

public class PrimeNo {

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrimeNo pn = new PrimeNo();
        int n = sc.nextInt();

        System.out.println(pn.isPrime(n));

    }
}

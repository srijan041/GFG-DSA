import java.util.*;

public class SeiveOfErastothenes {

    boolean isPrime(int n) {
        if (n == 1)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i < n; i += 2) {
            if (n / i == 0)
                return false;
        }
        return true;
    }

    void seive(int n) {
        boolean[] arr = new boolean[n + 1];
        Arrays.fill(arr, true);
        for (int i = 2; i <= n; i++) {
            if (arr[i]) {
                System.out.print(i + " ");
                for (int j = i * i; j <= n; j += i)
                    arr[j] = false;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        SeiveOfErastothenes soe = new SeiveOfErastothenes();
        soe.seive(n);
    }
}

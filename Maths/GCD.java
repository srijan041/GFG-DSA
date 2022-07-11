
import java.util.*;

public class GCD {
    int getGCD(int A, int B) {
        int gcd = 1;
        for (int i = 1; i <= A; i++) {
            if (A % i == 0 && B % i == 0)
                gcd = i;
        }
        return gcd;
    }

    public static void main(String[] args) {
        GCD g = new GCD();
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(g.getGCD(A, B));
    }
}

public class SumOfN {
    static int getSumOfN(int n) {
        if (n == 0)
            return n;

        return (n + getSumOfN(n - 1));
    }

    public static void main(String[] args) {
        System.out.println(getSumOfN(100));
    }
}

public class SumOfDigits {
    static int getSum(int n) {
        if (n <= 9)
            return n;
        return n % 10 + getSum(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(getSum(10));
    }
}

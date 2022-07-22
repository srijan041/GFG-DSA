public class CuttingRopeProblem {
    static int maxRopePieces(int n, int a, int b, int c) {
        if (n == 0)
            return 0;
        if (n < 0)
            return -1;

        int res = Math.max(maxRopePieces(n - a, a, b, c),
                Math.max(maxRopePieces(n - b, a, b, c), maxRopePieces(n - c, a, b, c)));

        if (res == -1)
            return -1;
        return res + 1;
    } // T.S = O(3^n) tho DP gives better solution

    public static void main(String[] args) {
        // get the max number of rope cuts possible where each cut is either of length
        // a, b or c.
        // n = 5, a = 2, b = 5, c = 1 op = 5
        // n = 23, a = 12, b = 9, c = 11 op = 2
        // n = 5, a = 4, b = 2, c = 6 op = -1 (invalid)
        System.out.println(maxRopePieces(5, 2, 5, 1));

    }
}

public class SubsetOfString {
    static void printSubsets(String str, String curr, int i) {
        if (i == str.length()) {
            System.out.println(curr);
            return;
        }
        printSubsets(str, curr, i + 1);
        printSubsets(str, curr + str.charAt(i), i + 1);

    }

    public static void main(String[] args) {
        printSubsets("abc", "", 0);
    }
}

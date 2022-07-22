public class PalindromeString {
    static boolean isPalindrome(String str) {
        if (str.length() == 1)
            return true;

        if (str.length() == 2)
            return (str.charAt(0) == str.charAt(str.length() - 1));

        return (str.charAt(0) == str.charAt(str.length() - 1))
                && isPalindrome(str.substring(1, str.length() - 1));

    } // w e l l e w
      // 0 1 2 3 4 5 len = 6

    /*
     * static boolean palindrome(String str, int start, int end) { // start = 0, end
     * = len - 1 initially
     * if (start >= end)
     * return true;
     * 
     * return (str.charAt(start) == str.charAt(end)) && palindrome(str, start + 1,
     * end - 1);
     * } T.C = O(N) A.S = O(N)
     */

    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
    }
}

public class Check_Ascending_Sorted {
    static boolean is_Ascending_Sorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] < arr[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 2, 12 };
        System.out.println(is_Ascending_Sorted(arr));
    }
}

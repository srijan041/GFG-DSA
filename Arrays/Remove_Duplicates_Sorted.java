public class Remove_Duplicates_Sorted {
    // remove duplicates from sorted array and bring distinct elements to beginning
    // in order and return new size;
    static int removeDuplicates(int[] arr) {
        int res = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[res - 1]) {
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }

    static void display(int[] arr) {
        System.out.println();
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 20, 30, 30, 30, 30 };
        // int[] arr = { 10, 10, 10 };
        System.out.println(removeDuplicates(arr));
        display(arr);
    }
}

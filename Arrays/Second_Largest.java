public class Second_Largest {
    static int secondLargest(int[] arr) {
        int sl = -1;
        int l = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[l]) {
                sl = l;
                l = i;
            }

            else if (arr[i] != arr[l]) {
                if (sl == -1 || arr[i] > arr[sl])
                    sl = i;
            }

        }

        return sl;
    }

    public static void main(String[] args) {
        int arr[] = { 20, 10, 20, 8, 12 };
        System.out.println(secondLargest(arr));
    }
}

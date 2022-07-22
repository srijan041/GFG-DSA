public class DeleteArray {

    static int search(int[] arr, int n, int key) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    static int deleteElement(int[] arr, int n, int key, int cap) {
        int pos = search(arr, n, key);
        if (pos == -1)
            return -1;
        for (int i = pos + 1; i < n; i++) {
            arr[i - 1] = arr[i];

        }
        arr[n - 1] = 0;
        return n - 1;
    }

    static void display(int[] arr, int n) {
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 8, 12, 5, 6 };
        int n = arr.length;
        display(arr, n);
        deleteElement(arr, n, 12, 5);
        display(arr, n);

    }
}

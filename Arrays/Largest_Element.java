
public class Largest_Element {

    static int getLargestIndex(int[] arr) {
        int largest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[largest]) {
                largest = i;
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 8, 20, 10 };
        System.out.println(getLargestIndex(arr));
    }
}

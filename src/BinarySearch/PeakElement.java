package BinarySearch;

public class PeakElement {
    static int findPeakElement(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if ((i == 0 || arr[i] > arr[i - 1]) && (i == n - 1 || arr[i] > arr[i + 1])) {
                return i;  // return index of the Peak
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 3, 2, 1};
        System.out.println(findPeakElement(arr));
    }
}

package BinarySearch;

public class SearchInRotatedArray2 {
    static boolean search(int[] arr, int target) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return true;
            }
            if (arr[mid] == arr[low] && arr[mid] == arr[high]) {
                low = low + 1;
                high = high - 1;
            } else if (arr[low] <= arr[mid]) {
                if (target >= arr[low] && target <= arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (target >= arr[mid] && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 3, 3, 3, 3};
        int target = 1;
        System.out.println(search(arr, target));
    }
}

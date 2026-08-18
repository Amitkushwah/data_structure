package BinarySearch;

public class FindKRotation {
    static int findKRotation(int[] arr) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int mini = Integer.MAX_VALUE;
        int index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low++;
                high--;
                continue;
            }
            if (arr[low] <= arr[high]) {
                if (arr[low] < mini) {
                    mini = arr[low];
                    index = low;
                }
                break;
            }
            if (arr[low] <= arr[mid]) {
                if (arr[low] < mini) {
                    mini = arr[low];
                    index = low;
                }
                low = mid + 1;
            } else {
                if (arr[mid] < mini) {
                    mini = arr[mid];
                    index = mid;
                }
                high = mid - 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 1, 2};
        System.out.println(findKRotation(arr));
    }
}

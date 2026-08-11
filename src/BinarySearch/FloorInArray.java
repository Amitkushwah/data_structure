package BinarySearch;

public class FloorInArray {
    static int floorInArray(int[] arr, int target) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= target) {
                ans = arr[mid];
                low = mid + 1;
            } else high = mid - 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 5, 8, 8, 10, 10, 11};
        System.out.println(floorInArray(arr, 4));
    }
}

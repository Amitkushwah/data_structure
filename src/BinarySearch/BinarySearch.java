package BinarySearch;

public class BinarySearch {
    static int search(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target)
                return mid;
            else if (target > arr[mid])
                low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    static int searchRecursive(int[] arr, int low, int high, int target) {
        if (low > high)
            return -1;
        int mid = low + (high - low) / 2;
        if (arr[mid] == target)
            return mid;
        else if (target > arr[mid])
            return searchRecursive(arr, mid + 1, high, target);
        return searchRecursive(arr, low, mid - 1, target);
    }

    static int callSearchRecursive(int[] arr, int target) {
        return searchRecursive(arr, 0, arr.length - 1, target);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 8, 9};
        int target = 9;
        System.out.println(search(arr, target));
        System.out.println("------------------");
        System.out.println(callSearchRecursive(arr, 9));
    }
}

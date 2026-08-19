package BinarySearch;

public class SingleElementInSortedArray {
    public static int findOptimal(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        if (nums[n - 1] != nums[n - 2]) return nums[n - 1];
        int low = 1;
        int high = n - 2;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1])
                return nums[mid];
            else if ((mid % 2 == 1 && nums[mid] == nums[mid - 1]) || (mid % 2 == 0) && nums[mid] == nums[mid + 1])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    static int find(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                if (arr[i] != arr[i + 1])
                    return arr[i];
            } else if (i == n - 1) {
                if (arr[n - 1] != arr[n - 2])
                    return arr[n - 1];
            } else {
                if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1])
                    return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7};
        System.out.println(findOptimal(arr));
        System.out.println("--------------");
        System.out.println(find(arr));
    }
}

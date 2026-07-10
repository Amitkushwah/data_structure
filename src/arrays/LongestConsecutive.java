package arrays;

public class LongestConsecutive {
    static int longestConsecutive(int[] arr) {
        int n = arr.length;
        int longest = 1;

        for (int i = 0; i < n; i++) {
            int count = 1;
            int value = arr[i];
            while (linearSearch(arr, value + 1)) {
                count++;
                value += 1;
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }

    static boolean linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == target)
                return true;
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 3, 7, 9, 10, 4, 11};
        System.out.println(longestConsecutive(arr));
    }
}

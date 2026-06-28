package arrays;

public class LinearSearch {
    static int linearSearch(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++)
            if (arr[i] == target)
                return i;
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 7, 1, 2, 9};
        int target = 9;
        System.out.println(linearSearch(arr, target));
    }
}

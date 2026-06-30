package arrays;

public class FindConsecutiveOnes {
    static int consecutiveOnes(int arr[]) {
        int n = arr.length;
        int maxi = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
                maxi = Math.max(maxi, count);
            } else count = 0;
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1};
        System.out.println(consecutiveOnes(arr));
    }
}

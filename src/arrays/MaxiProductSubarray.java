package arrays;

public class MaxiProductSubarray {
    static int maxiProductSubarray(int[] arr) {
        int n = arr.length;
        int ans = arr[0];
        for (int i = 0; i < n; i++) {
            int prod = 1;
            for (int j = i; j < n; j++) {
                prod *= arr[j];
                ans = Math.max(ans, prod);
            }
        }
        return ans;
    }

    static int maxiProductSubarrayOptimal1(int[] arr) {
        int n = arr.length;
        int ans = Integer.MIN_VALUE;
        int pre = 1;
        int suf = 1;
        for (int i = 0; i < n; i++) {
            if (pre == 0)
                pre = 1;

            if (suf == 0)
                suf = 1;

            pre *= arr[i];
            suf *= arr[n - i - 1];

            ans = Math.max(ans, Math.max(pre, suf));
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};
        System.out.println(maxiProductSubarray(arr));
        System.out.println("------------------");
        System.out.println(maxiProductSubarrayOptimal1(arr));
    }
}

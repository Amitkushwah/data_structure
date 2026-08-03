package arrays;

public class MaxiProductSubarray {
    static int maxiProductSubarray(int[] arr){
        int n = arr.length;
        int ans = arr[0];
        for(int i = 0; i < n; i++){
            int prod = 1;
            for(int j = i; j < n; j++){
                prod *= arr[j];
                ans = Math.max(ans, prod);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};
        System.out.println(maxiProductSubarray(arr));
    }
}

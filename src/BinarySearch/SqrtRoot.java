package BinarySearch;

public class SqrtRoot {
    static int sqrtRoot(int n) {
        int ans = -1;
        for (int i = 1; i <= n; i++) {
            if (i * i <= n)
                ans = i;
            else
                break;
        }
        return ans;
    }

    static int sqrtRootOptimal(int n){
        if(n < 2) return n;

        int ans = -1;
        int low = 1;
        int high = n/2;
        while(low <= high){
            int mid = (low + high) / 2;
            if(mid * mid <= n){
                low = mid + 1;
                ans = mid;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 50;
        System.out.println(sqrtRoot(n));
        System.out.println("-----------------");
        System.out.println(sqrtRootOptimal(n));
    }
}

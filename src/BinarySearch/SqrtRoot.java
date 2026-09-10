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

    public static void main(String[] args) {
        int n = 37;
        System.out.println(sqrtRoot(n));
    }
}

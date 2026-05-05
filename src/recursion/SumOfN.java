package recursion;

public class SumOfN {
    static int ans = 0;
    public static void fun(int n, int sum){
        while(n < 1){
            System.out.println(sum);
            return;
        }
        fun(n-1, sum+n);
    }
    public static void main(String[] args) {
        int n = 5;
        fun(n, 0);
    }
}

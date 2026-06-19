package recursion;

public class FibonacciOptimizedWithAB {
    static int fibonacci(int n){
        int f[] = new int[]{-1,-1,-1,-1,-1,-1,-1};
        if(n <= 1){
            f[n] = n;
            return n;
        }
        else {
            if(f[n-2] == -1)
                f[n-2] = fibonacci(n-2);
            if(f[n-1] == -1)
                f[n-1] = fibonacci(n-1);
            return f[n-2] + f[n-1];
        }
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }
}

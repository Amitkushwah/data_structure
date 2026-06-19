package recursion;

public class FibonacciWithAB {
    static int fibonacci(int n){
        int s = 1, t0 = 0, t1 = 1;
        if(n <= 1)
            return n;
        for(int i = 2; i <= n; i++){
            s = t0 + t1;
            t0 = t1;
            t1 = s;
        }
        return s;
    }

    static int fibonacciRecursion(int n){
        if(n <= 1)
            return n;
        return fibonacciRecursion(n - 2) + (n - 1);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(7));
        System.out.println(fibonacciRecursion(7));
    }
}

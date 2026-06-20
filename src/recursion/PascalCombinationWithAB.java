package recursion;

public class PascalCombinationWithAB {
    static int fact(int n){
        if(n == 0)
            return 1;
        return fact(n-1) * n;
    }
    static int NCR(int n, int r){
        int num = fact(n);
        int den = fact(r) * fact(n-r);
        return num/den;
    }

    static int c(int n, int r){
        if(r == 0 || n == r)
            return 1;
        return c(n-1, r-1) + c(n-1, r);
    }

    public static void main(String[] args) {
        System.out.println(c(5,3));
        System.out.println(NCR(5,3));
    }
}

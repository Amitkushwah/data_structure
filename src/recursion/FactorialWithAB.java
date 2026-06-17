package recursion;

public class FactorialWithAB {
    static int fact(int n){
        if(n < 0)
            return 0;
        if (n == 0)
            return 1;
        return fact(n-1) * n;
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}

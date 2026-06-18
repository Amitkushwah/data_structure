package recursion;

public class PowerWithAB {
    static int pow(int m, int n){
        if(n==0)
            return 1;
        return pow(m, n-1) * m;
    }

    static int pow2(int m, int n){
        int result = 1;
        for(int i = 1; i <= n; i++){
            result = result * m;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(pow(2, 5));
        System.out.println(pow2(2, 5));
    }
}

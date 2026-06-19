package recursion;

public class TaylorHornerWithAB {
    static double e(int x, int n){
        double s = 1;
        double num = 1;
        double den = 1;
        for(int i = 1; i <= n; i++){
            num *= x;
            den *= i;
            s += num/den;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(e(3, 7));
    }
}

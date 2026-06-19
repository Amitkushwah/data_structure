package recursion;

public class TaylorHornerRecursion {
    static double s = 1;
    double e(int x, int n){
        if(n == 0)
            return 1;
        s = 1 + x * s / n;
        return e(x, n-1);
    }
}

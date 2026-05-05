package patterns;

public class PatternTwenty {
    public static void main(String[] args) {
        int n = 10;
        n /= 2;
        for(int i = 1; i < n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            for(int j = 1; j <= 2*n-(2*i); j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i+1; j++){
                System.out.print("* ");
            }
            for(int j = 1; j <= 2*i-2; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

package patterns;

public class PatternSeventeen {
//    print alphabet
    public static void main(String[] args) {
        int n = 4;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i-1; j++){
                System.out.print("  ");
            }
            char c = 'A';
            for(int k = 0; k < i+1; k++){
                System.out.print(c +  " ");
                c++;
            }
            c--;
            for(int m = 0; m < i; m++){
                c--;
                System.out.print(c + " ");
            }
            for(int l = 0; l < n-i-1; l++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}

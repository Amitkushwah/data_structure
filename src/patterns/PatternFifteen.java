package patterns;

public class PatternFifteen {
    public static void main(String[] args) {
        int n = 5;
        for(int i = n-1; i >= 0; i--){
            for(char j = 'A'; j <= 'A' + i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

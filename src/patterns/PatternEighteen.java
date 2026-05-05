package patterns;

public class PatternEighteen {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < n; i++){
            char ch = (char)(('A' + n - 1) - i);
            for(int j = 0; j <= i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}

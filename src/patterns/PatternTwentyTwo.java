package patterns;

public class PatternTwentyTwo {
    public static void main(String[] args) {
        int n = 4;
        int loopEnd = 2*n-1;
        for(int i = 0; i < loopEnd; i++){
            for(int j = 0; j < loopEnd; j++){
                int top = i;
                int left = j;
                int bottom = (2*n -2) - i;
                int right = (2*n -2) - j;
                System.out.print(n - Math.min(Math.min(top, bottom), Math.min(left, right)) + " ");
            }
            System.out.println();
        }
    }
}

package basic_maths;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int input = 234;
        int n = input;
        int ans = 0;

        while(n > 0){
            int a = n % 10;
            ans = a * a * a + ans;
            n = n / 10;
        }
        System.out.println(ans);
    }
}

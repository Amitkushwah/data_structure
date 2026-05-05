package basic_maths;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 234;
        int ans = 0;
        while(n > 0){
            int a = n % 10;
            ans = ans * 10 + a;
            n = n / 10;
        }
        System.out.println(ans);
    }
}

package basic_maths;

public class Palindrome {
    public static void main(String[] args) {
        int input = 23432;
        int ans = 0;
        int n = input;

        while (n > 0){
            int a = n % 10;
            ans = ans * 10 + a;
            n = n / 10;
        }
        System.out.println(input == ans);
    }
}

package basic_maths;

public class CountDigit {
    public static void main(String[] args) {
        int input = 356567;
        int n = input;
        int count = 0;
        while (n > 0){
            n = n / 10;
            count++;
        }
        System.out.println(count);

        int ans = (int)(Math.log10(input) + 1);
        System.out.println(ans);
    }
}

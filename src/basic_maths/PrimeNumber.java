package basic_maths;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 7;
        int count = 0;
        for(int i = 1; i*i <= n; i++){
            if(n%i == 0) {
                count++;
                if (n / i != i)
                    count++;
            }
        }
        System.out.println(count == 2);
    }
}

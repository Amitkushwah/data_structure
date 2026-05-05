package basic_maths;

public class HCF {
    public static void main(String[] args) {
        int n1 = 20, n2 = 40;
        int a;

        for(int i = Math.min(n1, n2); i >= 1; i--){
            if(n1%i == 0 && n2%i == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}

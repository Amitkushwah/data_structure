package patterns;

public class PatternEleven {
    public static void main(String[] args) {
        int n=5;
        int binary = 0;
        for(int i=0; i<n; i++){
            if(i%2==0) binary = 1;
            for(int j=0; j<=i; j++){
                if(binary==1) {
                    System.out.print(binary);
                    binary--;
                }
                else {
                    System.out.print(binary);
                    binary++;
                }
            }
            System.out.println();
        }

        for(int i=0; i<n; i++){
            if(i%2==0) binary = 1;
            else binary = 0;
            for(int j=0; j<=i; j++){
                System.out.print(binary);
                binary = 1 - binary;
            }
            System.out.println();
        }
    }
}

package patterns;

public class ButterflyPattern {
    public static void main(String[] args) {
        int n = 12;
        // length of the butterfly
        for(int i = 0; i < n; i++) {
            // boundary of the butterfly
            System.out.print("*");
            // space just after boundary
            for(int j = 0; j < 6; j++){
                System.out.print(" ");
            }
            // face should be the length of 3
            if(i < 3) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("* ");
                }
            }
            // stomach
            else {
                if(i < 9) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print(" *");
                    }
                }
            }
            // space inside 1st boundary
            if(i < 3) {
                for (int j = 0; j < 7; j++) {
                    System.out.print(" ");
                }
            }
            // space inside 2nd boundary
            else {
                if(i < 9) {
                    for (int j = 0; j < 9; j++) {
                        System.out.print(" ");
                    }
                }
                else {
                    for (int j = 0; j <= 12; j++) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("*");
        }
    }
}

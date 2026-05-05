package recursion;

public class PrintNTo1 {
    static int n = 5;
    public static void fun(){
        if(n > 0){
            System.out.println(n);
            n--;
            fun();
        }
        return;
    }
    public static void main(String[] args) {
        fun();
    }
}

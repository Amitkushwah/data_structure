package recursion;

public class PrintName {
    static int n = 5,count = 0;
    public static void fun(){
        if(count == n){
            return;
        }
        System.out.println("Recursion");
        count++;
        fun();
    }
    public static void main(String[] args) {
        fun();
    }
}

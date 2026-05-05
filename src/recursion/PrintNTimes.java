package recursion;

public class PrintNTimes {
    static int count = 0;
    public static void fun(){
        if(count == 4){
            return;
        }
        System.out.println(count);
        count++;
        fun();
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Recursion");
        fun();
    }
}

package recursion;

public class PalindromeString {
    static String s = "malayalam";
    static int n = s.length();
    static char[] ch = s.toCharArray();

    public static void palindromeWithStringReverse(int i) {
        if(i >= n/2) {
            String result = new String(ch);
            if(s.equals(result))
                System.out.println("String is a palindrome");
            else
                System.out.println("String is not a palindrome");
            return;
        }
        swap(i, n-i-1);
        palindromeWithStringReverse(i+1);
    }

    public static boolean palindrome(int i){
        if(i >= n/2){
            return true;
        }
        if(s.charAt(i) != s.charAt(n-i-1)){
            return false;
        }
        return palindrome(i+1);
    }

    public static void swap(int a, int b){
        char temp = ch[a];
        ch[a] = ch[b];
        ch[b] = temp;
    }

    public static void main(String[] args) {
        palindromeWithStringReverse(0);
        System.out.println(palindrome(0));
    }
}

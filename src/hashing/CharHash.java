package hashing;

public class CharHash {
    public static void main(String[] args) {
        int[] a = new int[256];
        String s = "Hello";
        char ch = 'o';

        for(int i = 0; i < s.length(); i++){
            a[s.charAt(i)]++;
        }

        System.out.println(a[ch]);
    }
}

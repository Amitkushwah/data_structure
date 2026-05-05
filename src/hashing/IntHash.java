package hashing;

public class IntHash {
    public static void main(String[] args) {
        int[] a = new int[]{3,5,1,2,4,3,2};
        int[] f = new int[]{3,1};
        int[] s = new int[10];

        for (int i = 0; i < a.length; i++){
            s[a[i]]++;
        }

        for (int i = 0; i < f.length; i++){
            System.out.println(s[f[i]]);
        }

    }
}

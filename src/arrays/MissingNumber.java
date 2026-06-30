package arrays;

public class MissingNumber {
    static int missingNo(int[] arr) {
        int n = arr.length + 1;

        for (int i = 1; i <= n; i++) {
            boolean found = false;
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found)
                return i;
        }
        return -1;
    }

    static int missingNoBetter(int[] arr) {
        int n = arr.length+1;
        int[] freq = new int[n + 1];

        for (int j : arr) freq[j]++;

        for (int i = 1; i <= n + 1; i++)
            if (freq[i] == 0)
                return i;

        return -1;
    }

    static int missingNoOptimal(int[] arr){
        int n = arr.length+1;
        int realSum = 0;
        int expectedSum = 0;

        for(int i: arr)
            realSum += i;

        expectedSum = n * (n + 1) / 2;

        return expectedSum - realSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6};
        System.out.println(missingNo(arr));
        System.out.println(missingNoBetter(arr));
        System.out.println(missingNoOptimal(arr));
    }
}

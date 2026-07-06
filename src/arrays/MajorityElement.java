package arrays;

public class MajorityElement {
    static int majorityElement(int[] arr) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count >= n / 2)
                return arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5, 5};
        System.out.println(majorityElement(arr));
    }
}

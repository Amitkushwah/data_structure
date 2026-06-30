package arrays;

public class ElementOnce {
    static int findElementAppearsOnce(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int count = 0;
            for (int j = 0; j < n; j++)
                if (arr[j] == num)
                    count++;
            if (count == 1)
                return num;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4};
        System.out.println(findElementAppearsOnce(arr));
    }
}

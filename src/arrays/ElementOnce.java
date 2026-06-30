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

    static int findElementAppearsOnceBetter(int[] arr) {
        int n = arr.length;
        int maxi = 0;
        for (int i : arr) {
            maxi = Math.max(maxi, i);
        }
        int[] hash = new int[maxi + 1];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        for (int i = 0; i < n; i++) {
            if (hash[arr[i]] == 1)
                return arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4};
        System.out.println(findElementAppearsOnce(arr));
        System.out.println(findElementAppearsOnceBetter(arr));

    }
}

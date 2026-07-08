package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlternateNumbers {
    static void alternateNo(int[] arr) { // if an array only contains same number of positive and negative elements
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int i = 0; i < arr.length; i++)
            if (arr[i] < 0)
                neg.add(arr[i]);
            else
                pos.add(arr[i]);
        for (int i = 0; i < arr.length / 2; i++) {
            arr[2 * i] = pos.get(i);
            arr[2 * i + 1] = neg.get(i);
        }
    }

    static int[] alternateNoBetter(int[] arr) { // if an array only contains same number of positive and negative elements
        int n = arr.length;
        int posIndex = 0;
        int negIndex = 1;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                ans[negIndex] = arr[i];
                negIndex += 2;
            } else {
                ans[posIndex] = arr[i];
                posIndex += 2;
            }
        }
        return ans;
    }

    static void alternateNoOptimal(int[] arr) { // if an array contains uneven positive and negative elements
        int n = arr.length;
        List<Integer> pos = new ArrayList<>(), neg = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0)
                pos.add(arr[i]);
            else
                neg.add(arr[i]);
        }
        if (pos.size() > neg.size()) {
            for (int i = 0; i < neg.size(); i++) {
                arr[2 * i] = pos.get(i);
                arr[2 * i + 1] = neg.get(i);
            }
            int index = 2 * neg.size();
            for (int i = neg.size(); i < pos.size(); i++) {
                arr[index] = pos.get(i);
                index++;
            }
        } else {
            for (int i = 0; i < pos.size(); i++) {
                arr[2 * i] = pos.get(i);
                arr[2 * i + 1] = neg.get(i);
            }
            int index = 2 * pos.size();
            for (int i = pos.size(); i < neg.size(); i++) {
                arr[index] = neg.get(i);
                index++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, -3, 4, 5, -2, 6, -7, -4};
        alternateNo(arr);
        Arrays.stream(arr).forEach(System.out::println);
        System.out.println("--------------------------");
        int[] ans = alternateNoBetter(arr);
        Arrays.stream(ans).forEach(System.out::println);
        System.out.println("--------------------------");
        alternateNoOptimal(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}

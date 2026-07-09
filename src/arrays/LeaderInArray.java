package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeaderInArray {
    static List<Integer> leader(int[] arr) {
        int n = arr.length;
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            boolean leader = true;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    leader = false;
                    break;
                }
            }
            if (leader)
                ans.add(arr[i]);
        }
        return ans;
    }

    static List<Integer> leaderOptimal(int[] arr) {
        int n = arr.length;
        int max = arr[n - 1];
        List<Integer> ans = new ArrayList<>();
        ans.add(arr[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                ans.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 3, 56, 4, 5, 6};
        List<Integer> ans = leader(arr);
        ans.forEach(System.out::println);
        System.out.println("--------------");
        List<Integer> ans2 = leaderOptimal(arr);
        ans2.forEach(System.out::println);
    }
}

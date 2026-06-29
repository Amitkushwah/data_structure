package arrays;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfArray {
    static List<Integer> intersection(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] visit = new int[n2];
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (arr1[i] == arr2[j] && visit[j] == 0) {
                    ans.add(arr1[i]);
                    visit[j] = 1;
                    break;
                }
                if (arr1[i] < arr2[j])
                    break;
            }
        }
        return ans;
    }

    static List<Integer> intersectionOptimal(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            } else {
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 5, 7, 8};
//        List<Integer> ans = intersection(arr1, arr2);
        List<Integer> ans = intersectionOptimal(arr1, arr2);
        ans.forEach(System.out::println);

    }
}

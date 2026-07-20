package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElements2 { // class finds the elements which are more than n/3
    static List<Integer> majorityElements(int[] arr) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (ans.isEmpty() || ans.get(0) != arr[i]) {
                int count = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == arr[i]) {
                        count++;
                    }
                }
                if (count > arr.length / 3) {
                    ans.add(arr[i]);
                }
            }
            if (ans.size() == 2) {
                break;
            }
        }
        return ans;
    }

    static List<Integer> majorityElementBetter(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int min = arr.length / 3 + 1;

        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            if (map.get(i) == min) {
                ans.add(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 3, 2, 2, 2};
        List<Integer> result = majorityElements(arr);
        result.forEach(System.out::println);
        System.out.println("--------------");
        List<Integer> resultBetter = majorityElementBetter(arr);
        resultBetter.forEach(System.out::println);
    }
}

package arrays;

import java.util.*;

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
            if (ans.size() == 2)
                break;
        }
        return ans;
    }

    static List<Integer> majorityElementOptimal(int[] arr) {
        int count1 = 0, count2 = 0;
        int el1 = Integer.MIN_VALUE, el2 = Integer.MIN_VALUE;
        List<Integer> ans = new ArrayList<>();

        for (int i : arr) {
            if (count1 == 0 && i != el2) {
                count1 = 1;
                el1 = i;
            } else if (count2 == 0 && i != el1) {
                count2 = 1;
                el2 = i;
            } else if (el1 == i) {
                count1++;
            } else if (el2 == i) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int i : arr) {
            if (i == el1) {
                count1++;
            } else if (i == el2) {
                count2++;
            }
        }
        int min = arr.length / 3 + 1;
        if (count1 >= min) ans.add(el1);
        if (count2 >= min) ans.add(el2);
        Collections.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 3, 2, 2, 2};
        List<Integer> result = majorityElements(arr);
        result.forEach(System.out::println);
        System.out.println("--------------");
        List<Integer> resultBetter = majorityElementBetter(arr);
        resultBetter.forEach(System.out::println);
        System.out.println("--------------");
        List<Integer> resultOptimal = majorityElementOptimal(arr);
        resultOptimal.forEach(System.out::println);
    }
}

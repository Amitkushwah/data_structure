package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingInterval {
    static List<List<Integer>> mergeOverlappingInterval(int[][] arr) {
        int n = arr.length;
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        List<List<Integer>> ans = new ArrayList<>();
        int i = 0;
        while (i < n) {
            int start = arr[i][0];
            int end = arr[i][1];
            int j = i + 1;
            while (j < n && arr[j][0] <= end) {
                end = Math.max(end, arr[j][1]);
                j++;
            }
            ans.add(Arrays.asList(start, end));
            i = j;
        }
        return ans;
    }

    static List<List<Integer>> mergeOverlappingIntervalOptimal(int[][] arr){
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        List<List<Integer>> ans = new ArrayList<>();
        for(int[] i: arr){
            if(ans.isEmpty() || ans.get(ans.size() - 1).get(1) < i[0]){
                ans.add(Arrays.asList(i[0], i[1]));
            }
            else{
                int last = ans.size() - 1;
                int maxi = Math.max(ans.get(last).get(1), i[1]);
                ans.get(last).set(1, maxi);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        List<List<Integer>> result = mergeOverlappingInterval(arr);
        result.forEach(System.out::println);
        System.out.println("---------------");
        List<List<Integer>> resultOptimized = mergeOverlappingIntervalOptimal(arr);
        resultOptimized.forEach(System.out::println);
    }
}

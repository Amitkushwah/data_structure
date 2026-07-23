package arrays;

import java.util.*;

public class FourSum {
    static List<List<Integer>> fourSum(int[] arr, int target){
        Set<List<Integer>> set = new HashSet<>();
        int n = arr.length;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                Set<Integer> temp = new HashSet<>();
                for(int k = j+1; k < n; k++){
                    int sum = arr[i] + arr[j];
                    sum += arr[k];
                    int forth = target - sum;
                    if(temp.contains(forth)){
                        List<Integer> l = new ArrayList<>();
                        l.add(arr[i]);
                        l.add(arr[j]);
                        l.add(arr[k]);
                        l.add(arr[forth]);
                        Collections.sort(l);
                        set.add(l);
                    }
                    temp.add(k);
                }
            }
        }
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,-1,-2,2,0,-1};
        int target = 0;
        List<List<Integer>> result = fourSum(arr, target);
        result.forEach(System.out::println);
    }
}

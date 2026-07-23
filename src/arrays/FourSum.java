package arrays;

import java.util.*;

public class FourSum {
    static List<List<Integer>> fourSumBetter(int[] arr, int target){
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
                        l.add(forth);
                        Collections.sort(l);
                        set.add(l);
                    }
                    temp.add(arr[k]);
                }
            }
        }
        return new ArrayList<>(set);
    }

    public static List<List<Integer>> fourSumOptimal(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for(int j = i + 1; j < n; j++){
                if(j != i + 1 && nums[j] == nums[j-1]) continue;
                int k = j + 1;
                int l = n - 1;
                while(k < l){
                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[k];
                    sum += nums[l];
                    if(sum < target)
                        k++;
                    else if(sum > target)
                        l--;
                    else {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        ans.add(temp);
                        k++;
                        l--;
                        while(k < l && nums[k] == nums[k-1]) k++;
                        while(k < l && nums[l] == nums[l + 1]) l--;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,-1,-2,2,0,-1};
        int target = 0;
        List<List<Integer>> result = fourSumBetter(arr, target);
        result.forEach(System.out::println);
        System.out.println("------------------");
        List<List<Integer>> result2 = fourSumOptimal(arr,target);
        result2.forEach(System.out::println);
    }
}

package BinarySearch;

public class MinimumInRotatedArray {
    static int findMinimum(int[] arr){
        int n = arr.length;
        int low = 0, high = n - 1;
        int mini = Integer.MAX_VALUE;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[low] <= arr[high]){
                mini = Math.min(mini, arr[low]);
                break;
            }
            if(arr[low] <= arr[mid]){
                mini = Math.min(mini, arr[low]);
                low = mid + 1;
            }
            else {
                mini = Math.min(mini, arr[mid]);
                high = mid - 1;
            }
        }
        return mini;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,1,2,3};
        System.out.println(findMinimum(arr));
    }
}

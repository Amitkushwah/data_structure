package BinarySearch;

public class BinarySearch {
    static int search(int[] arr, int target){
        int low = 0, high = arr.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == target)
                return mid;
            else if(target > arr[mid])
                low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,6,8,9};
        System.out.println(search(arr, 9));
    }
}

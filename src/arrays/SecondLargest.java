package arrays;

public class SecondLargest {
    static int secondLargestBetter(int[] arr){
        int n = arr.length;
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++)
            if(arr[i] > firstLargest)
                firstLargest = arr[i];

        for(int i = 0; i < n; i++)
            if(arr[i] > secondLargest && arr[i] != firstLargest)
                secondLargest = arr[i];

        return secondLargest;

    }
    static int secondLargestOptimal(int[] arr){
        int n = arr.length;
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(arr[i] > firstLargest){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            if(arr[i] < firstLargest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,2,8,7,6,8,4};
        System.out.println(secondLargestOptimal(arr));
        System.out.println(secondLargestBetter(arr));
    }
}

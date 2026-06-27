package arrays;

public class LargestElement {
    static int largestElement(int[] arr){
        int largest = arr[0];
        int n = arr.length;

        for(int i = 0; i < n; i++)
            if(arr[i] > largest)
                largest = arr[i];

        return largest;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,2,7,9,4,6};
        System.out.println(largestElement(arr));
    }
}

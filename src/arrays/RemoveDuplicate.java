package arrays;

public class RemoveDuplicate {
    static int sizeOfUniqueArray(int[] arr){
        int n = arr.length;
        int i = 0;
        for(int j = 1; j < n; j++){
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3,4,4};
        System.out.println(sizeOfUniqueArray(arr));
    }
}

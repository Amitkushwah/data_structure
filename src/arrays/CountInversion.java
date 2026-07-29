package arrays;

public class CountInversion {
    static int countInversion(int[] arr){
        int n = arr.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] > arr[j])
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 4, 1};
        System.out.println(countInversion(arr));
    }
}

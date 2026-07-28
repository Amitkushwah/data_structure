package arrays;

import java.util.Arrays;

public class MissingAndRepeatingNo {
    static int[] missingAnsRepeatingNo(int[] arr, int n){
        int repeating = -1;
        int missing = -1;
        for(int i = 1; i <= n; i++){
            int count = 0;
            for(int j = 0; j < n; j++){
                if(i == arr[j]){
                    count++;
                }
            }
            if(count == 2) repeating = i;
            if(count == 0) missing = i;
            if(repeating != -1 && missing != -1)
                break;
        }
        return new int[]{repeating, missing};
    }

    public static void main(String[] args) {
        int[] arr = {6,3,1,4,2,1};
        int n = 6;
        int[] result = missingAnsRepeatingNo(arr,n);
        Arrays.stream(result).forEach(System.out::println);
    }
}

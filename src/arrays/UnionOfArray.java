package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnionOfArray {
    static List<Integer> union(int[] a, int[] b){
        int n1 = a.length;
        int n2 = b.length;
        int i = 0;
        int j = 0;
        List<Integer> result = new ArrayList<>();

        while (i < n1 && j < n2){
            if(a[i] <= b[j]){
                if(result.isEmpty() || result.get(result.size() - 1) != a[i] )
                    result.add(a[i]);
                i++;
            }
            else {
                if(result.isEmpty() || result.get(result.size() - 1) != b[j])
                    result.add(b[j]);
                j++;
            }
        }
        while (i < n1){
            if(result.isEmpty() || result.get(result.size() - 1) != a[i])
                result.add(a[i]);
            i++;
        }
        while (j < n2){
            if(result.isEmpty() || result.get(result.size() - 1) != b[j])
                result.add(b[j]);
            j++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        int[] b = {1,2,3,4,5,7,8};
        List<Integer> l = union(a, b);
        l.stream().forEach(System.out::println);
    }
}

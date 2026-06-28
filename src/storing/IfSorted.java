package storing;

public class IfSorted {
    static boolean ifSorted(int[] arr){
        for(int i = 0; i < arr.length-1; i++)
            if(arr[i] <= arr[i+1])
                continue;
            else return false;
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,6,4,5};
        System.out.println(ifSorted(arr));
    }

}

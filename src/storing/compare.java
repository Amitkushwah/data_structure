package storing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class compare {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(4);
        l.add(5);
        l.add(3);
        l.add(1);

        Collections.sort(l, new Comparator<Integer>(){
            @Override
            public int compare(Integer num1, Integer num2) {
                if(num1 < num2){
                    return 1;
                }
                else if(num1 > num2){
                    return -1;
                }
                return 0;
            }
        });
        System.out.println(l);

        Collections.sort(l, (num1, num2) -> num2 - num1 );
        System.out.println(l);
    }
}

package storing;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueSort {
    public static Comparator<Integer> getCompare(){
        return new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 < o2){
                    return 1;
                } else if (o1 > o2){
                    return -1;
                }
                return 0;
            }
        };
    }
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(getCompare());
        pq.offer(1);
        pq.offer(6);
        pq.offer(4);
        pq.offer(5);
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}

import java.util.LinkedList;
import java.util.Queue;

public class linkedQueue {
    public static void main(String[] args) {
        Queue<Integer> number = new LinkedList<>();
        //offer - data insert , enqueue(concept)
        number.offer(234);
        number.offer(563);
        number.offer(831);
        number.add(675);
        number.add(19087);
        System.out.println("Enqueue :- " + number);
        System.out.println("Top Element :- " + number.peek());
        //poll - data remove ,deque(concept)
        System.out.println("Dequeue :- " + number.poll());
        System.out.println("Updated Queue :- " + number);
    

    }
}

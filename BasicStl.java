import java.util.ArrayDeque;
import java.util.Queue;

public class BasicStl{
    public static void main(String[] args) {
        Queue<Integer> q= new ArrayDeque<>();
        System.out.println(q.isEmpty());
        q.add(1);
        System.out.println(q.isEmpty());
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q);
        q.remove();

        System.out.println(q);
        System.out.println(q.peek());
    }
}
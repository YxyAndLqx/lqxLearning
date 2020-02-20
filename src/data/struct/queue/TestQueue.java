package data.struct.queue;

/**
 * @author: LiJie
 * @Date: 2020/2/21 1:55
 */
public class TestQueue {
    public static void main(String[] args) {
        Queue queue = new Queue();
        System.out.println(queue.toString());
        queue.addQueue(10);
        queue.addQueue(12);
        queue.addQueue(14);
        queue.addQueue(16);
        queue.addQueue(18);
        System.out.println(queue.toString());
        System.out.println(queue.removeQueue());
        System.out.println(queue.removeQueue());
        System.out.println(queue.removeQueue());
        System.out.println(queue.toString());
        System.out.println(queue.getLength());
    }
}

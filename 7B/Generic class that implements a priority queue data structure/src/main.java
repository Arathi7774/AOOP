import java.util.Comparator;

public class main {
    public static void main(String[] args) {
        // Testing with Integer (Min-Heap)
        GenericPriorityQueue<Integer> intQueue = new GenericPriorityQueue<>(Comparator.naturalOrder());
        intQueue.enqueue(10);
        intQueue.enqueue(5);
        intQueue.enqueue(30);
        intQueue.enqueue(3);
        System.out.println("Integer Priority Queue (Min-Heap):");
        while (!intQueue.isEmpty()) {
            System.out.println(intQueue.dequeue());
        }

        // Testing with Double (Min-Heap)
        GenericPriorityQueue<Double> doubleQueue = new GenericPriorityQueue<>(Comparator.naturalOrder());
        doubleQueue.enqueue(4.5);
        doubleQueue.enqueue(2.3);
        doubleQueue.enqueue(7.8);
        doubleQueue.enqueue(1.1);
        System.out.println("\nDouble Priority Queue (Min-Heap):");
        while (!doubleQueue.isEmpty()) {
            System.out.println(doubleQueue.dequeue());
        }

        // Testing with String (Max-Heap)
        GenericPriorityQueue<String> stringQueue = new GenericPriorityQueue<>(Comparator.reverseOrder());
        stringQueue.enqueue("apple");
        stringQueue.enqueue("orange");
        stringQueue.enqueue("banana");
        stringQueue.enqueue("grape");
        System.out.println("\nString Priority Queue (Max-Heap):");
        while (!stringQueue.isEmpty()) {
            System.out.println(stringQueue.dequeue());
        }
    }
}

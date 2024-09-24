import java.util.ArrayList;
import java.util.Comparator;

// Generic class for Priority Queue using a binary heap
public class GenericPriorityQueue<T> {
    private ArrayList<T> heap;
    private Comparator<? super T> comparator;

    // Constructor with a custom comparator
    public GenericPriorityQueue(Comparator<? super T> comparator) {
        this.heap = new ArrayList<>();
        this.comparator = comparator;
    }

    // Method to add an element to the priority queue
    public void enqueue(T item) {
        heap.add(item);
        heapifyUp(heap.size() - 1);
    }

    // Method to remove and return the highest priority element
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Priority Queue is empty");
        }
        T root = heap.get(0);
        T lastItem = heap.remove(heap.size() - 1);
        if (!isEmpty()) {
            heap.set(0, lastItem);
            heapifyDown(0);
        }
        return root;
    }

    // Method to peek at the highest priority element without removing it
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Priority Queue is empty");
        }
        return heap.get(0);
    }

    // Method to check if the priority queue is empty
    public boolean isEmpty() {
        return heap.isEmpty();
    }

    // Method to return the size of the priority queue
    public int size() {
        return heap.size();
    }

    // Helper method to maintain heap order after adding a new element
    private void heapifyUp(int index) {
        T item = heap.get(index);
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            T parent = heap.get(parentIndex);
            if (comparator.compare(item, parent) >= 0) {
                break;
            }
            heap.set(index, parent);
            index = parentIndex;
        }
        heap.set(index, item);
    }

    // Helper method to maintain heap order after removing the root element
    private void heapifyDown(int index) {
        int size = heap.size();
        T item = heap.get(index);
        while (index < size / 2) { // Node has at least one child
            int leftChildIndex = 2 * index + 1;
            int rightChildIndex = 2 * index + 2;

            int smallestChildIndex = leftChildIndex;
            if (rightChildIndex < size && comparator.compare(heap.get(rightChildIndex), heap.get(leftChildIndex)) < 0) {
                smallestChildIndex = rightChildIndex;
            }

            if (comparator.compare(item, heap.get(smallestChildIndex)) <= 0) {
                break;
            }

            heap.set(index, heap.get(smallestChildIndex));
            index = smallestChildIndex;
        }
        heap.set(index, item);
    }
}

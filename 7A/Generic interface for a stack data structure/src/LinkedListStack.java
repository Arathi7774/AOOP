import java.util.LinkedList;
// Implementation of GenericStack using LinkedList
class LinkedListStack<T> implements GenericStack<T> {
    private LinkedList<T> stack;

    public LinkedListStack() {
        stack = new LinkedList<>();
    }

    @Override
    public void push(T item) {
        stack.addFirst(item); // Add item to the top of the stack
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.removeFirst(); // Remove and return the top item
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.getFirst(); // Return the top item without removing it
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty(); // Check if the stack is empty
    }

    @Override
    public int size() {
        return stack.size(); // Return the number of items in the stack
    }
}

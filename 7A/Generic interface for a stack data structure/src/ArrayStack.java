// Implementation of GenericStack using an Array
class ArrayStack<T> implements GenericStack<T> {
    private T[] stack;
    private int top;
    private int capacity;

    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity) {
        this.capacity = capacity;
        stack = (T[]) new Object[capacity];
        top = -1; // Indicates the stack is empty
    }

    @Override
    public void push(T item) {
        if (top == capacity - 1) {
            throw new IllegalStateException("Stack overflow");
        }
        stack[++top] = item; // Add item to the top of the stack
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top--]; // Remove and return the top item
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top]; // Return the top item without removing it
    }

    @Override
    public boolean isEmpty() {
        return top == -1; // Check if the stack is empty
    }

    @Override
    public int size() {
        return top + 1; // Return the number of items in the stack
    }
}

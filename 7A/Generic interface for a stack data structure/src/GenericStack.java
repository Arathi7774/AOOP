// Generic interface for a stack data structure
interface GenericStack<T> {
    void push(T item);     // Add an item to the top of the stack
    T pop();               // Remove and return the top item of the stack
    T peek();              // Return the top item of the stack without removing it
    boolean isEmpty();     // Check if the stack is empty
    int size();            // Return the number of items in the stack
}

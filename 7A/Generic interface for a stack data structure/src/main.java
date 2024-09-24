public class main {
    public static void main(String[] args) {
        // Testing LinkedListStack with Integer type
        GenericStack<Integer> linkedListStack = new LinkedListStack<>();
        linkedListStack.push(10);
        linkedListStack.push(20);
        linkedListStack.push(30);
        System.out.println("LinkedListStack (Integer) - Top element: " + linkedListStack.peek());
        System.out.println("LinkedListStack (Integer) - Size: " + linkedListStack.size());
        linkedListStack.pop();
        System.out.println("LinkedListStack (Integer) - Top element after pop: " + linkedListStack.peek());

        // Testing ArrayStack with String type
        GenericStack<String> arrayStack = new ArrayStack<>(5);
        arrayStack.push("Hello");
        arrayStack.push("World");
        arrayStack.push("Java");
        System.out.println("ArrayStack (String) - Top element: " + arrayStack.peek());
        System.out.println("ArrayStack (String) - Size: " + arrayStack.size());
        arrayStack.pop();
        System.out.println("ArrayStack (String) - Top element after pop: " + arrayStack.peek());

        // Testing LinkedListStack with Character type
        GenericStack<Character> charStack = new LinkedListStack<>();
        charStack.push('A');
        charStack.push('B');
        charStack.push('C');
        System.out.println("LinkedListStack (Character) - Top element: " + charStack.peek());
        System.out.println("LinkedListStack (Character) - Size: " + charStack.size());
        charStack.pop();
        System.out.println("LinkedListStack (Character) - Top element after pop: " + charStack.peek());

        // Testing ArrayStack with Float type
        GenericStack<Float> floatStack = new ArrayStack<>(5);
        floatStack.push(1.5f);
        floatStack.push(2.5f);
        floatStack.push(3.5f);
        System.out.println("ArrayStack (Float) - Top element: " + floatStack.peek());
        System.out.println("ArrayStack (Float) - Size: " + floatStack.size());
        floatStack.pop();
        System.out.println("ArrayStack (Float) - Top element after pop: " + floatStack.peek());
    }
}

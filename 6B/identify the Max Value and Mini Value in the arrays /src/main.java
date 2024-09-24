public class main {
    public static void main(String[] args) {
        // Integer array
        Integer[] intArray = {3, 5, 7, 2, 8};
        ArrayProcessor<Integer> intProcessor = new ArrayProcessor<>();
        System.out.println("Integer Array - Min: " + intProcessor.findMin(intArray) + ", Max: " + intProcessor.findMax(intArray));

        // String array
        String[] stringArray = {"apple", "orange", "banana", "grape"};
        ArrayProcessor<String> stringProcessor = new ArrayProcessor<>();
        System.out.println("String Array - Min: " + stringProcessor.findMin(stringArray) + ", Max: " + stringProcessor.findMax(stringArray));

        // Character array
        Character[] charArray = {'a', 'z', 'm', 'b'};
        ArrayProcessor<Character> charProcessor = new ArrayProcessor<>();
        System.out.println("Character Array - Min: " + charProcessor.findMin(charArray) + ", Max: " + charProcessor.findMax(charArray));

        // Float array
        Float[] floatArray = {3.5f, 5.7f, 1.2f, 9.8f};
        ArrayProcessor<Float> floatProcessor = new ArrayProcessor<>();
        System.out.println("Float Array - Min: " + floatProcessor.findMin(floatArray) + ", Max: " + floatProcessor.findMax(floatArray));
    }
}

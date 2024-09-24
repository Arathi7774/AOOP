// Generic interface to find minimum and maximum values
interface MinMax<T extends Comparable<T>> {
    T findMin(T[] array);
    T findMax(T[] array);
}

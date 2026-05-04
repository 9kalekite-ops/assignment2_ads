public class HeapSort {
    public static int[] sortDescending(int[] arr) {
        MinHeap heap = new MinHeap();
        for (int value : arr) heap.insert(value);
        int[] result = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            result[i] = heap.extractMin();
        }
        return result;
    }
}
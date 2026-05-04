public class MinHeap {
    private IntArray heap = new IntArray();

    public void insert(int value) {
        heap.add(value);
        heapifyUp(heap.size() - 1);
    }

    public int extractMin() {
        if (heap.size() == 0) throw new RuntimeException("Heap empty");
        int min = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.removeLast();
        heapifyDown(0);
        return min;
    }

    public int peekMin() {
        if (heap.size() == 0) throw new RuntimeException("Heap empty");
        return heap.get(0);
    }

    public boolean isEmpty() {
        return heap.size() == 0;
    }

    public int size() {
        return heap.size();
    }

    private void heapifyUp(int i) {
        while (i > 0) {
            int parent = (i - 1) / 2;
            if (heap.get(i) < heap.get(parent)) {
                swap(i, parent);
                i = parent;
            } else break;
        }
    }

    private void heapifyDown(int i) {
        int size = heap.size();
        while (true) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int smallest = i;
            if (left < size && heap.get(left) < heap.get(smallest)) smallest = left;
            if (right < size && heap.get(right) < heap.get(smallest)) smallest = right;
            if (smallest != i) { swap(i, smallest); i = smallest; }
            else break;
        }
    }

    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
}
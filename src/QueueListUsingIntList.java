public class QueueListUsingIntList {
    private IntList list = new IntList();
    public void enqueue(int value) {
        list.add(value);
    }
    public int dequeue() {
        return list.removeFirst();
    }
    public boolean isEmpty() {
        return list.isEmpty();
    }
}

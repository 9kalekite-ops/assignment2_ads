public class QueueList implements IntQueue {
    private IntList list = new IntList();

    @Override
    public void add(int value) {
        list.add(value);
    }

    @Override
    public int remove() {
        if (list.isEmpty()) throw new RuntimeException("Queue is empty");
        return list.removeFirst();
    }

    @Override
    public int peek() {
        if (list.isEmpty()) throw new RuntimeException("Queue is empty");
        return list.peekFirst();
    }

    @Override
    public boolean empty() {
        return list.isEmpty();
    }
}
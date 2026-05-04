public class QueueListUsingIntList implements IntQueue {
    private IntList list = new IntList();

    @Override
    public void add(int value) {
        list.add(value);
    }

    @Override
    public int remove() {
        return list.removeFirst();
    }

    @Override
    public int peek() {
        return list.peekFirst();
    }

    @Override
    public boolean empty() {
        return list.isEmpty();
    }
}

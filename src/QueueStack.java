public class QueueStack implements IntQueue {
    private StackArray s1 = new StackArray();
    private StackArray s2 = new StackArray();

    @Override
    public void add(int value) {
        s1.push(value);
    }

    @Override
    public int remove() {
        shiftIfNeeded();
        if (s2.empty()) throw new RuntimeException("Queue is empty");
        return s2.pop();
    }

    @Override
    public int peek() {
        shiftIfNeeded();
        if (s2.empty()) throw new RuntimeException("Queue is empty");
        return s2.peek();
    }

    @Override
    public boolean empty() {
        return s1.empty() && s2.empty();
    }

    private void shiftIfNeeded() {
        if (s2.empty()) {
            while (!s1.empty()) {
                s2.push(s1.pop());
            }
        }
    }
}
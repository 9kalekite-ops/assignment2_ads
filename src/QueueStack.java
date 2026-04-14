public class QueueStack {
    private StackArray s1 = new StackArray();
    private StackArray s2 = new StackArray();
    public void enqueue(int value) {
        s1.push(value);
    }
    public int dequeue() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        if (s2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return s2.pop();
    }
    public boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}
public class StackQueue {
    private QueueList q1 = new QueueList();
    private QueueList q2 = new QueueList();
    public void push(int x) {
        q2.enqueue(x);
        while (!q1.isEmpty()) {
            q2.enqueue(q1.dequeue());
        }
        QueueList temp = q1;
        q1 = q2;
        q2 = temp;
    }
    public int pop() {
        if (q1.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return q1.dequeue();
    }
    public boolean isEmpty() {
        return q1.isEmpty();
    }
}
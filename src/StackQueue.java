public class StackQueue implements IntStack {
    private QueueList q1 = new QueueList();
    private QueueList q2 = new QueueList();

    @Override
    public void push(int x) {

        q2.add(x);
        while (!q1.empty()) {
            q2.add(q1.remove());
        }

        QueueList temp = q1;
        q1 = q2;
        q2 = temp;
    }

    @Override
    public int pop() {
        if (q1.empty()) throw new RuntimeException("Stack is empty");
        return q1.remove();
    }

    @Override
    public int peek() {
        if (q1.empty()) throw new RuntimeException("Stack is empty");
        return q1.peek();
    }

    @Override
    public boolean empty() {
        return q1.empty();
    }
}
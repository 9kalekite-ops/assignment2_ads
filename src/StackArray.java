public class StackArray implements IntStack {
    private IntArray data;

    public StackArray() {
        data = new IntArray();
    }

    @Override
    public void push(int value) {
        data.add(value);
    }

    @Override
    public int pop() {
        if (data.size() == 0) throw new RuntimeException("Stack is empty");
        int value = data.get(data.size() - 1);
        data.removeLast();
        return value;
    }

    @Override
    public int peek() {
        if (data.size() == 0) throw new RuntimeException("Stack is empty");
        return data.get(data.size() - 1);
    }

    @Override
    public boolean empty() {
        return data.size() == 0;
    }
}
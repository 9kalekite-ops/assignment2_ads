public class StackArray {
    private IntArray data;
    public StackArray() {
        data = new IntArray();
    }
    public void push(int value) {
        data.add(value);
    }
    public int pop() {
        if (data.size() == 0) {
            throw new RuntimeException("Stack is empty");
        }
        int topIndex = data.size() - 1;
        int value = data.get(topIndex);
        for (int i = topIndex; i < data.size() - 1; i++) {
        }
        return removeLast();
    }
    private int removeLast() {
        int topIndex = data.size() - 1;
        int value = data.get(topIndex);
        int[] arr = data.toArray();
        IntArray newData = new IntArray();
        for (int i = 0; i < arr.length - 1; i++) {
            newData.add(arr[i]);
        }
        data = newData;
        return value;
    }
    public int peek() {
        if (data.size() == 0) {
            throw new RuntimeException("Stack is empty");
        }
        return data.get(data.size() - 1);
    }
    public boolean isEmpty() {
        return data.size() == 0;
    }
}
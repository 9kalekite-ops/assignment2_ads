public class QueueList {
    private static class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }
    private Node front;
    private Node rear;
    public QueueList() {
        front = null;
        rear = null;
    }
    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }
    public int dequeue() {
        if (front == null) {
            throw new RuntimeException("Queue is empty");
        }
        int value = front.value;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return value;
    }
    public boolean isEmpty() {
        return front == null;
    }
}

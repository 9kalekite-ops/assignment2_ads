public class IntList {
    public void print() {
    }
    public void reverse() {
    }
    private static class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }
    private Node head;
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    public int removeFirst() {
        if (head == null) {
            throw new RuntimeException("Empty");
        }
        int value = head.value;
        head = head.next;
        return value;
    }
    public boolean isEmpty() {
        return head == null;
    }
}

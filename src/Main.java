public class Main {
    public static void main(String[] args) {
        // ARRAY INTERSECTION
        int[] A = {1, 2, 2, 3, 4};
        int[] B = {2, 3, 5};
        int[] result = ArrayIntersection.intersect(A, B);
        for (int x : result) {
            System.out.print(x + " ");
        }
        System.out.println();
        // LINKED LIST
        IntList list = new IntList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.print();
        list.reverse();
        list.print();
        //STACK
        StackArray sa = new StackArray();
        sa.push(10);
        sa.push(20);
        System.out.print(sa.pop() + " ");
        System.out.println();
        StackQueue sq = new StackQueue();
        sq.push(1);
        sq.push(2);
        System.out.print(sq.pop() + " ");
        System.out.println();
        //QUEUE
        QueueList q1 = new QueueList();
        q1.enqueue(5);
        q1.enqueue(6);
        System.out.print(q1.dequeue() + " ");
        System.out.println();
        QueueListUsingIntList q2 = new QueueListUsingIntList();
        q2.enqueue(7);
        q2.enqueue(8);
        System.out.print(q2.dequeue() + " "); // 7
        System.out.println();
        int[] arr = {5, 1, 9, 3, 7};
        int[] sorted = HeapSort.sortDescending(arr);
        for (int x : sorted) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
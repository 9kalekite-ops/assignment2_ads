public class Main {
    public static void main(String[] args) {
        // Array intersection
        int[] A = {1, 2, 2, 3, 4};
        int[] B = {2, 3, 5};
        int[] result = ArrayIntersection.intersect(A, B);
        for (int x : result) System.out.print(x + " ");
        System.out.println();

        // LinkedList
        IntList list = new IntList();
        list.add(1); list.add(2); list.add(3); list.add(4);
        list.print();
        list.reverse();
        list.print();

        // Stack (array-based)
        IntStack sa = new StackArray();
        sa.push(10); sa.push(20);
        System.out.println(sa.pop());

        // Stack (queue-based)
        IntStack sq = new StackQueue();
        sq.push(1); sq.push(2);
        System.out.println(sq.pop());

        // Queue (list-based)
        IntQueue q1 = new QueueList();
        q1.add(5); q1.add(6);
        System.out.println(q1.remove());

        // Queue (IntList-based)
        IntQueue q2 = new QueueListUsingIntList();
        q2.add(7); q2.add(8);
        System.out.println(q2.remove());

        // HeapSort
        int[] arr = {5, 1, 9, 3, 7};
        int[] sorted = HeapSort.sortDescending(arr);
        for (int x : sorted) System.out.print(x + " ");
        System.out.println();
    }
}
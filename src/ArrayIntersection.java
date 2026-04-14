public class ArrayIntersection {
    public static int[] intersect(int[] A, int[] B) {
        IntArray result = new IntArray();
        for (int i = 0; i < A.length; i++) {
            int value = A[i];
            if (contains(B, value) && !contains(result.toArray(), value)) {
                result.add(value);
            }
        }
        return result.toArray();
    }
    private static boolean contains(int[] arr, int value) {
        for (int j : arr) {
            if (j == value) {
                return true;
            }
        }
        return false;
    }
}
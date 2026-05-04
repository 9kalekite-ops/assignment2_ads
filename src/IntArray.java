public class IntArray {
    private int[] data;
    private int size;

    public IntArray() {
        data = new int[4];
        size = 0;
    }

    public int size() {
        return size;
    }

    public int get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        return data[index];
    }

    public void add(int value) {
        if (size == data.length) resize();
        data[size++] = value;
    }

    public void set(int index, int value) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        data[index] = value;
    }

    public void removeLast() {
        if (size == 0) throw new RuntimeException("Empty array");
        size--;
    }

    public int[] toArray() {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) result[i] = data[i];
        return result;
    }

    private void resize() {
        int[] newData = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) newData[i] = data[i];
        data = newData;
    }
}
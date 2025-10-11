// Custom implementation of an ArrayList class
public class ArrayList<T> {
    private static final int INITIAL_CAPACITY = 10;
    private Object[] arr;
    private int count;

    public ArrayList() {
        arr = (T[]) new Object[INITIAL_CAPACITY];
        count = 0;
    }

    // Method to resize the array when it reaches capacity
    private void resize() {
        int newSize = arr.length * 2;
        Object[] newArr = (T[]) new Object[newSize];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        arr = newArr;
    }

    // Method to add an element in the ArrayList
    public void add(T element) {
        if (count == arr.length) {
            resize();
        }
        arr[count++] = element;
    }

    // Method to get an element in the ArrayList
    public T get(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + count);
        }
        return (T) arr[index];
    }

    // Method to set an element in the ArrayList
    public void set(int index, T element) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + count);
        }
        arr[index] = element;
    }

    // Method to remove an element in the ArrayList
    public void remove(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + count);
        }
        System.arraycopy(arr, index + 1, arr, index, count - index - 1);
        arr[--count] = null; // Clear the last element
    }

    // Method to get all elements in the ArrayList
    public T[] toArray() {
        T[] result = (T[]) new Object[count];
        System.arraycopy(arr, 0, result, 0, count);
        return result;
    }

    // Method to get the current size of the ArrayList
    public int size() {
        return count;
    }

    // Method to check if the ArrayList is empty
    public boolean isEmpty() {
        return count == 0;
    }

    // Method to clear the ArrayList
    public void clear() {
        for (int i = 0; i < count; i++) {
            arr[i] = null;
        }
        count = 0;
    }

    // Method to check if the ArrayList contains an element
    public boolean contains(T element) {
        for (int i = 0; i < count; i++) {
            if (arr[i].equals(element)) {
                return true;
            }
        }
        return false;
    }
}

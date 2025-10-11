import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);
        list.add(66);
        list.add(77);
        list.add(88);
        list.add(99);
        list.set(0, 0);

        System.err.println("Element at index 1: " + list.get(1));
        System.err.println("Size of list: " + list.size());
        System.err.println("Show all elements in array list:" + Arrays.toString(list.toArray()));
    }
}

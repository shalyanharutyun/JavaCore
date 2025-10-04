package homework.dynamicarray;

public class DynamicArrayDemo {

    public static void main(String[] args) {
        DynamicArray arrays = new DynamicArray();
        for (int i = 0; i < 25; i++) {
            arrays.add(i + 1);
        }

        arrays.print();

        System.out.println("Index 5 -> " + arrays.getByIndex(5));
        System.out.println("Index 100 -> " + arrays.getByIndex(100));
    }
}



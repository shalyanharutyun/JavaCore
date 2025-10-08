package homework.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {

        DynamicArray arrays = new DynamicArray();
        for (int i = 0; i < 25; i++) {
            arrays.add(i + 1);
        }

        System.out.println("arrays ->");
        arrays.print();

        System.out.println("Index 5 -> " + arrays.getByIndex(5));
        System.out.println("Index 100 -> " + arrays.getByIndex(100));

        System.out.println("\n----------------------------\n");

        System.out.println("delete index[3]");
        arrays.deleteByIndex(3);
        arrays.print();

        System.out.println("index[2] ");
        arrays.set(2, 99);
        arrays.print();

        System.out.println("index[6]");
        arrays.add(6, 321);
        arrays.print();

        System.out.println("87 -> " + arrays.exists(87));
        System.out.println("1234 -> " + arrays.exists(1234));

        System.out.println("87 -> " + arrays.getIndexByValue(87));
        System.out.println("777 -> " + arrays.getIndexByValue(777));
        System.out.println("555 -> " + arrays.getIndexByValue(555));
    }
}


package bracechecker;

public class Stack {
    private int[] array = new int[10];
    int size;

    public Stack() {
        size = -1;
    }

    public void push(int value) {
        if (size == array.length - 1) {
            System.out.println("Stack is over");
        } else {
            array[++size] = value;
        }
    }

    public int pop() {
        if (size < 0) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return array[size--];
        }
    }

    public boolean isEmpty() {
        return size < 0;
    }
}

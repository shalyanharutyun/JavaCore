package homework.homework1;


public class ArrayUtil {
    public static void main(String[] args) {
        System.out.println("_____________________");
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("_____________________");
        System.out.println(numbers[0]);
        System.out.println("_____________________");
        System.out.println(numbers[numbers.length - 1]);
        System.out.println("_____________________");
        System.out.println(numbers.length);
        System.out.println("_____________________");
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                System.out.println(min);
            }

        }
        System.out.println("_____________________");
        if (numbers.length <= 2) {
            System.out.println("can't print middle values");
        }
        if (numbers.length % 2 == 0) {
            System.out.println(numbers[numbers.length / 2 - 1]);
            System.out.println(numbers[numbers.length / 2]);
        }
        if (numbers.length % 2 != 0) {
            System.out.println(numbers[numbers.length / 2]);
        }
        System.out.println("_____________________");
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                counter++;

            }

        }
        System.out.println(counter);
        System.out.println("_____________________");
        int counter2 = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                counter2++;

            }

        }
        System.out.println(counter2);
        System.out.println("_____________________");
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(sum);
        System.out.println("_____________________");
        int average = 0;
        average = sum / numbers.length;
        System.out.println(average);


    }
}

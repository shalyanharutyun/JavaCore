package homework.homework1;

public class ArrayHomework {
    public static void main(String[] args) {
        // 1
        int[] numbers = {1, 2, 2, 7, 3, 87, 41, 32, 16, 11};
        int n = 6;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == n) {
                count++;
            } else {
            }
        }
        System.out.println(count);
        System.out.println("_____________");
        // 2
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("_____________");
        //3
        int a = numbers.length;
        int count1 = 0;
        for (int i = 0; i < a; i++) {
            for (int j = i + 1; j < a; j++) {
                if (numbers[i] == numbers[j]) {
                    count1++;
                }
            }
        }
        System.out.println(count1);
        System.out.println("_____________");
        //4
        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};
        char[] vowels = {'ա', 'ե', 'ը', 'ի', 'ո', 'ւ', 'օ', 'յ'};
        int vowelCount = 0;

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (chars[i] == vowels[j]) {
                    vowelCount++;
                    break;
                }
            }
        }
System.out.println(vowelCount);
    }
}

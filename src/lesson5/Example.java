package lesson5;

public class Example {
    public static void main(String[] args) {
        int x = 7;
        if (x == 1 || x == 3) {
            System.out.println("x < 5 and = " + x);
        } else if (x == 2 || x == 4) {
            System.out.println("x < 5 and = " + x);
        }else{
            System.out.println("x >= 5 and = " + x);
        }


        for (int i = 0; i < 6; i++) {
            switch(i) {
                case 0:
                    System.out.println("i равно нулю.");
                    break;
            }
        }
    }
}

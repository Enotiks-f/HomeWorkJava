public class Main {
    public static void main(String[] args) {
        // TASK 1
        System.out.println("TASK 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // TASK 2
        System.out.println("TASK 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // TASK 3
        System.out.println("TASK 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }

        // TASK 4
        System.out.println("TASK 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        // TASK 5
        System.out.println("TASK 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        // TASK 6
        System.out.println("TASK 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        // TASK 7
        System.out.println("TASK 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        // TASK 8
        System.out.println("TASK 8");
        int accumulation = 29000;
        int total = 0;
        for (int i = 0; i <= 12; i++ ) {
            total = total + accumulation;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + "рублей");
        }

        // TASK 9
        System.out.println("TASK 9");
        for (int i = 0; i <= 12; i++ ) {
            total = total + total/100;
            total = total + accumulation;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + "рублей");
        }

        // TASK 10

        System.out.println("TASK 10");
        int  count = 0;
        for (int i = 1; i <= 10; i++) {
            count = i * 2;
            System.out.println("2*" + i + "=" + count);
        }
        }
    }

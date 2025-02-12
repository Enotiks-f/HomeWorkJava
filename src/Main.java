public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        byte age = 24;
        if (18 >= age) {
            System.out.println("Он совершеннолетний");
        }else {
            System.out.println("Он не достиг совершеннолетия");
        }

        System.out.println("задача 2");
        int temperature = 7;
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        }else if (temperature >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        System.out.println("Задача 3");
        int speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно.");
        }

        System.out.println("Задача 4");

        if (age >= 2 && 6 >= age) {
            System.out.println("Ему нужно ходить в детский сад.");
        }else if (age >= 7 && 17 >= age) {
            System.out.println("Ему нужно ходить в школу");
        }else if (age <= 18 && age < 24) {
            System.out.println("его место в университете.");
        }else if (age >= 24)
            System.out.println("пора ходить на работу.");

        System.out.println("Задача 5");
        int baby_age = 5;
        if (baby_age < 5) {
            System.out.println("Если возраст ребенка равен " + baby_age + " то он не может кататься на аттракционе.");
        }else if (baby_age >= 5 && baby_age < 14) {
            System.out.println("Если возраст ребенка равен " + baby_age + " то он может кататься только в сопровождении взрослого");
        }else {
            System.out.println("Если возраст ребенка равен " + baby_age + " то он может кататься без сопровождения взрослого.");
        }

        System.out.println("Задача 6");
        int seats = 65;
        if (seats <= 60 ) {
            System.out.println("Есть стоячие и седячее места");
        }else if (seats > 60 && seats <= 102) {
            System.out.println("Свободны только стоячее");
        }else {
            System.out.println("Вагон полностью забит");
        }
        System.out.println("Задача 7");
        int one = 22;
        int two = 50;
        int three = 32;
        int max;
        if (one >= two && one >= three) {
            max = one;
        } else if (two >= one && two >= three) {
            max = two;
        } else {
            max = three;
        }

        System.out.println("Наибольшее число: " + max);
    }
}
public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        byte clientOC = 0;
        if (clientOC == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задача 2");
        short clientDeviceYear = 2015;
        if (clientOC == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }else {
                System.out.println("Установите версию приложения для Android по ссылке");}
        }

        System.out.println("Задача 3");
        int year = 2021;
        if (year < 1584) {
            System.out.println(year + " год не является високосным");
        } else if (year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

        System.out.println("Задача 4");

        short deliveryDistance = 95;
        if (deliveryDistance <= 20){
            System.out.println("Потребуеться дней: 1");
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуеться дней: 2");
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуеться дней: 3");
        } else {
            System.out.println("Свыше 100 км доставки нет.");
        }

        System.out.println("Задача 5");
        byte monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}

public class Main {
    public static void main(String[] args) {
    //TASK 1
        System.out.println("\nTASK1\n");
        task1(900);
    //TASK 2
        System.out.println("\nTASK2\n");
        short clientDeviceYear = 2004;
        task2(0, clientDeviceYear);
    //TASK 3
        System.out.println("\nTASK3\n");
        task3(40);
    }
    public static void task1(int year) {
        if (year % 4 == 0 && year % 400 == 0) {
            System.out.println(year + " год является високосным");
        }else if (year % 100 != 0) {
            System.out.println(year + " год является високосным");
        }else {
            System.out.println(year + " год не являеться високосным");
        }
    }

    public static void  task2(int typeOs, short clientDeviceYear) {
        if (clientDeviceYear == 2015) {
            if (typeOs == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }else {
            if (typeOs == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void task3(int deliveryDistance) {
        if (deliveryDistance <= 20){
            System.out.println("Потребуеться дней: 1");
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуеться дней: 2");
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуеться дней: 3");
        } else {
            System.out.println("Свыше 100 км доставки нет.");
        };
    }
}

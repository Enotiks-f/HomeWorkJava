public class Main {
    public static void main(String[] args) {
        System.out.println("\nTASK1\n");
        int[] salary = {20, 30, 15, 21, 89};
        int totalSalary = 0;
        for (int i = 0; i < salary.length; i++) {
            totalSalary += salary[i];
        }
        System.out.println("Сумма трат за месяц составила " +  totalSalary + " рублей");

        //TASK2
        System.out.println("\nTASK2\n");
        int minSalary = salary[0];
        int maxSalary = salary[0];
        for (int salarys: salary) {
            if (minSalary < salarys) {
                minSalary = salarys;
            }
            if (maxSalary > salarys) {
                maxSalary = salarys;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minSalary + " рублей");
        System.out.println("Максимальная сумма тран за неделю составила " + maxSalary + " рублей");

        //TASK3
        System.out.println("\nTASK3\n");
        int totalSalarys = 0;
        float age;
        for (int salarys : salary) {
            totalSalarys += salarys;
        }
        age = (float) (totalSalarys / salary.length);
        System.out.println("Средняя сумма трат за месяц составила " + age + " рублей");

        //TASK4
        System.out.println("\nTASK4\n");
        String name = "";
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            name += reverseFullName[i];
        }
        System.out.println(name);
    }
}
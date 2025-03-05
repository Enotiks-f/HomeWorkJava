public class Main {
    public static void main(String[] args) {
        //TASK1
        System.out.println("\nTASK1\n");
        int saving = 0;
        int month = 0;
        int salary = 15_000;
        while (saving <= 2_459_000) {
            month++;
            saving = saving + salary;
            System.out.println("Месяц " + month + " сумма накоплений равна " + saving + " рублей");
        }
        //TASK2
        System.out.println("\nTASK2\n");
        int n = 0;
        while (n < 10) {
            System.out.print(++n + " ");
            ;
        }
        System.out.println();
        for (; n != 0; n--) {
            System.out.print(n + " ");
        }
        //TASK3
        System.out.println("\nTASK3\n");
        int countryY = 12_000_000;
        byte birth = 17;
        byte death = 8;
        byte year = 0;

        while (year != 10) {
            year++;
            int loc = countryY / 1000;
            int birthYear = birth * loc;
            int deathYear = death * loc;
            countryY -= deathYear;
            countryY += birthYear;
            System.out.println("Год " + year + ", численость населения состовляет " + countryY);
        }
        //TASK4 AND TASK5
        System.out.println("\nTASK4 and TASK5\n");
        int deposit = 15_000;
        int percentageMonth = 7;
        int totalSum = 12_000_000;
        int monthDeposit = 0;

        while (deposit <= totalSum) {
            monthDeposit++;
            deposit += (deposit / 100) * percentageMonth;
            if (monthDeposit % 6 == 0) {
                System.out.println("Месяц " + monthDeposit + " накопил " + deposit);
            }
        }

        //TASK6
        System.out.println("\nTASK6\n");
        int saveYear = 9;
        int depositVasiliy = 15_000;
        int monthTotal = 0;

        while (monthTotal != (saveYear*12)) {
            monthTotal++;
            depositVasiliy += (depositVasiliy / 100) * percentageMonth;
            if (monthTotal % 6 == 0) {
                System.out.println("Полугодие: " + monthTotal + " Сумма:" + depositVasiliy);
            }
        }
        //TASK7
        System.out.println("\nTASK7\n");
        int firstFriday = 5;
        int totalDayInMonth = 31;
        for (; firstFriday< totalDayInMonth; firstFriday+=7) {
            System.out.println("Сегодня пятница, " + firstFriday + "-е" + " число. Необходимо подготовить отчет");
        }

        //TASK8
        System.out.println("\nTASK8\n");
        short startYear = 2025-200;
        short endYear = 2025+100;

        while (startYear<=endYear) {
            startYear++;
            if (startYear % 79 == 0) {
                System.out.println(startYear);
            }
        }


    }
}
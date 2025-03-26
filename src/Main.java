public class Main {
    public static void main(String[] args) {
        //TASK1
        System.out.println("\nTASK1\n");
        String firstName = "Ivan";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov";
        String fullname = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О. сотрудника - " + fullname);

        //TASK2
        System.out.println("\nTASK2\n");
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - " + fullname.toUpperCase());

        //TASK2
        System.out.println("\nTASK3\n");
        fullname = "Иванов Семён Семёнович";
        System.out.println("Данные Ф.И.О. сотрудника - " + fullname.replace('ё', 'е'));
    }
}
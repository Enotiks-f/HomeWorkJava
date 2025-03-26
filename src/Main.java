public class Main {
    public static void main(String[] args) {
        //TASK1
        System.out.println("\nTASK1\n");
        String firstName = " Ivan";
        String midelName = "Ivanov ";
        String lastName = " Ivanovich";
        String fullname = midelName + " " + firstName + " " + lastName;
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
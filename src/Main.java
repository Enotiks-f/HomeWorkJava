public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper + "\n");

        System.out.println("Задача 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper + "\n");

        System.out.println("Задача 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7636;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper + "\n");


        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend + "\n");

        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog + "\n");

        System.out.println("Задача 6");
        var boxerFirst = 78.2;
        var boxerSecond = 82.7;
        var totalWeight = boxerFirst + boxerSecond;
        var difference = boxerSecond - boxerFirst;
        System.out.println("Общая масса боксеро: " + totalWeight);
        System.out.println("Разница масс бойцов: " + difference + "\n");

        System.out.println("Задача 7");
        var remains = boxerSecond % boxerFirst;
        System.out.println("Остаток от деления: " + remains + "\n");

        System.out.println("Задача 8");
        var totalHours = 640;
        var personHours = 8;
        var totalPerson = totalHours / personHours;
        System.out.println("Всего работников в компании — " + totalPerson + " Человек");
        totalPerson = totalPerson + 94;
        var allHours = totalPerson * 8;
        System.out.println("Если в компании работает " + totalPerson + " то всего " + allHours + " работы может быть поделено между сотрудниками.");

    }
}
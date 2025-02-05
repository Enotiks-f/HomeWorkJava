public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        byte a = 124;
        short b = 2000;
        int c = 40000;
        long d = 3000000;
        float e = 3.65465f;
        double i = 3.6546545d;
        System.out.println("a byte = " + a);
        System.out.println("b byte = " + b);
        System.out.println("c byte = " + c);
        System.out.println("d byte = " + d);
        System.out.println("e byte = " + e);
        System.out.println("i byte = " + i);

        System.out.println("Задание 2");
        float banan = 27.12f;
        long bigBanan = 987678965549L;
        float cucumber = 2.786f;
        short paper = 569;
        short paperS = -159;
        short paperBig = 27897;
        byte cat = 67;
        System.out.println(banan);
        System.out.println(bigBanan);
        System.out.println(cucumber);
        System.out.println(paper);
        System.out.println(paperS);
        System.out.println(paperBig);
        System.out.println(cat);

        System.out.println("Задание 3");
        byte LyudmilaPavlovna = 23;
        byte AnnaSergeevna = 27;
        byte EkaterinaAndreevna = 30;
        short paperAll = 480;
        int paperStudent = paperAll / (LyudmilaPavlovna + AnnaSergeevna+ EkaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " + paperStudent + " листов бумаги");

        System.out.println("Задание 4");
        byte buttle = 16;
        byte twoMin = 2;
        int twentyMin = buttle * ( 20 / twoMin );
        int oneDay = buttle * ( ( 24 * 60 ) / twoMin);
        int threedDay = buttle * ( oneDay * 3 );
        int oneMonth = buttle * (threedDay * 10 );
        System.out.println("За 20 минут"+ " машина произвела" + twentyMin + "штук бутылок");
        System.out.println("За сутки"+ " машина произвела" + oneDay + "штук бутылок");
        System.out.println("За 3 дня"+ " машина произвела" + threedDay + "штук бутылок");
        System.out.println("За 1 месяц"+ " машина произвела" + oneMonth + "штук бутылок");

        System.out.println("Задание 5");
        byte allPaint = 120;
        byte whiteClass = 2;
        byte brownClass = 4;
        int allClass = allPaint / ( whiteClass + brownClass);
        int whitePaint = allClass * whiteClass;
        int brownPaint = allClass * brownClass;
        System.out.println("В школе, где " + allClass + " классов, нужно " + whitePaint +
                            " банок белой краски и " + brownPaint + " банок коричневой краски");

        System.out.println("Задача 6");
        int bananas = 5 * 80;
        int milk = 200 * 105 / 100;
        int iceCream = 2 * 100;
        int egg = 4 * 70;
        int totalG = bananas + milk + iceCream + egg;
        double totalKilograms = totalG / 1000.0;
        System.out.println("Вес завтрака: " + totalG+ " грамм");
        System.out.println("Вес завтрака: " + totalKilograms + " кг");

        System.out.println("Задача 7");
        short targetWeightLoss = 7 * 1000;
        int minDays = targetWeightLoss / 500;
        int maxDays = targetWeightLoss / 250;
        int averageDays = (minDays + maxDays) / 2;
        System.out.println("Если терять по 250 г в день, понадобится: " + maxDays + " дней");
        System.out.println("Если терять по 500 г в день, понадобится: " + minDays + " дней");
        System.out.println("В среднем потребуется: " + averageDays + " дней");

        System.out.println("Задача 8");
        double salaryMasha = 67760;
        double salaryDenis = 83690;
        double salaryKristina = 76230;
        double raiseFactor = 1.1;
        double newSalaryMasha = salaryMasha * raiseFactor;
        double newSalaryDenis = salaryDenis * raiseFactor;
        double newSalaryKristina = salaryKristina * raiseFactor;
        double yearlyIncreaseMasha = (newSalaryMasha - salaryMasha) * 12;
        double yearlyIncreaseDenis = (newSalaryDenis - salaryDenis) * 12;
        double yearlyIncreaseKristina = (newSalaryKristina - salaryKristina) * 12;
        System.out.println("Маша теперь получает " + (int) newSalaryMasha + " рублей. Годовой доход вырос на " + (int) yearlyIncreaseMasha + " рублей.");
        System.out.println("Денис теперь получает " + (int) newSalaryDenis + " рублей. Годовой доход вырос на " + (int) yearlyIncreaseDenis + " рублей.");
        System.out.println("Кристина теперь получает " + (int) newSalaryKristina + " рублей. Годовой доход вырос на " + (int) yearlyIncreaseKristina + " рублей.");
            }
        }

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        // Все еще не понимаю, как сдать домашку мастер-веткой, без слияния с новой. Коммент тут поэтому :)
    }

    public static void task1 () {
        System.out.println("Задача 1");

        int catsInTheWorld = 600000000;
        byte tail = 1;
        short paws = 4;
        long speedOfLight = 299792458L;
        float pi = 3.14f;
        double e = 2.7182818284590452;

        System.out.println("Значение переменной catsInTheWorld с типом int равно " + catsInTheWorld + ".");
        System.out.println("Значение переменной tail с типом byte равно " + tail + ".");
        System.out.println("Значение переменной paws с типом short равно " + paws + ".");
        System.out.println("Значение переменной speedOfLight с типом long равно " + speedOfLight + ".");
        System.out.println("Значение переменной pi с типом float равно " + pi + ".");
        System.out.println("Значение переменной e с типом double равно " + e + ".");

    }

    public static void task2 () {
        System.out.println("Задача 2");

        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 589;
        short e = -159;
        short f = 27897;
        byte g = 67;


    }

    public static void task3 () {
        System.out.println("Задача 3");

        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;
        short list = 480;
        int amountOfPupils = teacher1 + teacher2 + teacher3;
        int listOnPupil = list / amountOfPupils;


        System.out.println("На каждого ученика рассчитано " + listOnPupil + " листов бумаги.");

    }

    public static void task4 () {
        System.out.println("Задача 4");

        byte productivity = 16;
        byte time = 2;
        int productivity1 = productivity / time;

        byte time20 = 20;
        int productivity20 = productivity1 * time20;

        short timeDay1 = 24 * 60;
        int productivityDay1 = productivity1 * timeDay1;
        int timeDay3 = timeDay1 * 3;
        int productivityDay3 = productivity1 * timeDay3;
        int timeMonth = timeDay1 * 30;
        int productivityMonth = productivity1 * timeMonth;

        System.out.println("За " + time20 + " минут машина произвела " + productivity20 + " штук бутылок.");
        System.out.println("За сутки машина произвела " + productivityDay1 + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + productivityDay3 + " штук бутылок.");
        System.out.println("За месяц машина произвела " + productivityMonth + " штук бутылок.");

    }

    public static void task5 () {
        System.out.println("Задача 5");

        byte totalAmount = 120;
        byte brownPerClass = 4;
        byte whitePerClass = 2;
        int oneClassUses = brownPerClass + whitePerClass;
        int amountOfClasses = totalAmount / oneClassUses;
        int brown = amountOfClasses * brownPerClass;
        int white = amountOfClasses * whitePerClass;


        System.out.println("В школе, где " + amountOfClasses + " классов, нужно " + white + " банок белой краски и " + brown + " банок коричневой краски.");


    }

    public static void task6 () {
        System.out.println("Задача 6");

        byte bananasAmount = 5;
        byte bananaWeight = 80;
        int totalBananasW = bananasAmount * bananaWeight;
        short milkAmount = 200;
        byte milkPortion = 100;
        byte milkPortionWeight = 105;
        int totalMilkW = milkAmount / milkPortion * milkPortionWeight;
        byte icecreamAmount = 2;
        byte icecreamWeight = 100;
        int totalIcecreamW = icecreamAmount * icecreamWeight;
        byte eggsAmount = 4;
        byte eggWeight = 70;
        int totaleggsW = eggsAmount * eggWeight;

        int breakfastGr = totalBananasW + totalMilkW + totalIcecreamW + totaleggsW;
        float breakfastKg = breakfastGr / 1000f;



        System.out.println("Завтрак спортсмена весит " + breakfastGr + " грамм или  " + breakfastKg + " кг.");


    }

    public static void task7 () {
        System.out.println("Задача 7");

        byte loseKg = 7;
        int loseGr = loseKg * 1000;
        short losePerDay1 = 250;
        short losePerDay2 = 500;
        int days1 = loseGr / losePerDay1;
        int days2 = loseGr / losePerDay2;
        int averageDays = (days1 + days2) / 2;




        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, он похудеет за " + days1 + " дней.");
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм, он похудеет за " + days2 + " дней.");
        System.out.println("В среднем на похудение потребуется " + averageDays + " день.");
    }

    public static void task8 () {
        System.out.println("Задача 8");

        byte month = 12;
        int salaryM = 67760;
        int salaryD = 83690;
        int salaryK = 76230;
        float rate = 1.1f;
        float salaryM1 = salaryM * rate;
        float salaryD1 = salaryD * rate;
        float salaryK1 = salaryK * rate;
        float annualIncomeDifferenceM = (salaryM1 - salaryM) * month;
        float annualIncomeDifferenceD = (salaryD1 - salaryD) * month;
        float annualIncomeDifferenceK = (salaryK1 - salaryK) * month;


        System.out.println("Маша теперь получает " + salaryM1 + " рублей. Годовой доход вырос на " + annualIncomeDifferenceM +" рублей.");
        System.out.println("Денис теперь получает " + salaryD1 + " рублей. Годовой доход вырос на " + annualIncomeDifferenceD +" рублей.");
        System.out.println("Кристина теперь получает " + salaryK1 + " рублей. Годовой доход вырос на " + annualIncomeDifferenceK +" рублей.");
    }
}



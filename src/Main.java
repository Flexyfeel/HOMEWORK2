public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("=== Задача 1 ===");
        int age = 29;
        byte numberOfStudents = 127;
        short kilograms = 300;
        long averageKilograms = 100000L;
        float averageScore = 4.7f;
        double exactValue = 123.456789;

        System.out.println("Значение переменной age с типом int равно " + age);
        System.out.println("Значение переменной numberOfStudents с типом byte равно " + numberOfStudents);
        System.out.println("Значение переменной kilograms с типом short равно " + kilograms);
        System.out.println("Значение переменной averageKilograms с типом long равно " + averageKilograms);
        System.out.println("Значение переменной averageScore с типом float равно " + averageScore);
        System.out.println("Значение переменной exactValue с типом double равно " + exactValue);

        // Задача 2
        System.out.println("\n=== Задача 2 ===");
        double value1 = 27.12;
        long value2 = 987678965549L;
        float value3 = 2.786f;
        int value4 = 569;
        int value5 = -159;
        int value6 = 27897;
        byte value7 = 67;

        System.out.println("Значение переменной value1 с типом double равно " + value1);
        System.out.println("Значение переменной value2 с типом long равно " + value2);
        System.out.println("Значение переменной value3 с типом float равно " + value3);
        System.out.println("Значение переменной value4 с типом int равно " + value4);
        System.out.println("Значение переменной value5 с типом int равно " + value5);
        System.out.println("Значение переменной value6 с типом int равно " + value6);
        System.out.println("Значение переменной value7 с типом byte равно " + value7);

        // Задача 3
        System.out.println("\n=== Задача 3 ===");
        byte ludmilaStudents = 23;
        byte annaStudents = 27;
        byte ekaterinaStudents = 30;
        int totalPaper = 480;
        int totalStudents = ludmilaStudents + annaStudents + ekaterinaStudents;
        int paperPerStudent = totalPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги");

        // Задача 4
        System.out.println("\n=== Задача 4 ===");
        byte bottlesPer2Minutes = 16;
        byte bottlesPerMinute = (byte)(bottlesPer2Minutes / 2);
        int twentyMinutesProduction = bottlesPerMinute * 20;
        int dailyProduction = bottlesPerMinute * 1440;
        int threeDaysProduction = dailyProduction * 3;
        int monthlyProduction = dailyProduction * 30;

        System.out.println("За 20 минут машина произвела " + twentyMinutesProduction + " штук бутылок");
        System.out.println("За сутки машина произвела " + dailyProduction + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + threeDaysProduction + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + monthlyProduction + " штук бутылок");

        // Задача 5
        System.out.println("\n=== Задача 5 ===");
        byte numberOfCans = 120;
        byte whitePaintPerClass = 2;
        byte brownPaintPerClass = 4;
        byte paintPerClass = (byte)(whitePaintPerClass + brownPaintPerClass);
        byte numberOfClasses = (byte)(numberOfCans / paintPerClass);
        byte totalWhitePaintCans = (byte)(numberOfClasses * whitePaintPerClass);
        byte totalBrownPaintCans = (byte)(numberOfClasses * brownPaintPerClass);

        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " +
                totalWhitePaintCans + " банок белой краски и " +
                totalBrownPaintCans + " банок коричневой краски");

        // Задача 6
        System.out.println("\n=== Задача 6 ===");
        byte bananaCount = 5;
        byte bananaWeight = 80;
        int totalBananaWeight = bananaCount * bananaWeight;
        int milkML = 200;
        byte milkPer100ML = 105;
        int totalMilkWeight = milkML * milkPer100ML / 100;
        byte iceCreamCount = 2;
        byte iceCreamWeight = 100;
        int totalIceCreamWeight = iceCreamCount * iceCreamWeight;
        byte eggsCount = 4;
        byte eggWeight = 70;
        int totalEggsWeight = eggsCount * eggWeight;
        int totalGr = totalBananaWeight + totalMilkWeight + totalIceCreamWeight + totalEggsWeight;
        double totalKg = totalGr / 1000.0;

        System.out.println("Вес завтрака: " + totalGr + " грамм (" + totalKg + " кг)");

        // Задача 7
        System.out.println("\n=== Задача 7 ===");
        byte targetWeightLossKg = 7;
        int targetWeightLossGr = targetWeightLossKg * 1000;
        int minDailyLossGr = 250;
        int maxDailyLossGr = 500;
        int daysForMinLoss = targetWeightLossGr / minDailyLossGr;
        int daysForMaxLoss = targetWeightLossGr / maxDailyLossGr;
        int averageDays = (daysForMinLoss + daysForMaxLoss) / 2;

        System.out.println("При потере 250 грамм в день потребуется дней: " + daysForMinLoss);
        System.out.println("При потере 500 грамм в день потребуется дней: " + daysForMaxLoss);
        System.out.println("Среднее количество дней для похудения: " + averageDays);

        // Задача 8
        System.out.println("\n=== Задача 8 ===");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;

        double mashaNewSalary = mashaSalary * 1.10;
        double denisNewSalary = denisSalary * 1.10;
        double kristinaNewSalary = kristinaSalary * 1.10;

        double mashaYearDiff = (mashaNewSalary - mashaSalary) * 12;
        double denisYearDiff = (denisNewSalary - denisSalary) * 12;
        double kristinaYearDiff = (kristinaNewSalary - kristinaSalary) * 12;

        System.out.println("Маша теперь получает " + (int)mashaNewSalary + " рублей. " +
                "Годовой доход вырос на " + (int)mashaYearDiff + " рублей");
        System.out.println("Денис теперь получает " + (int)denisNewSalary + " рублей. " +
                "Годовой доход вырос на " + (int)denisYearDiff + " рублей");
        System.out.println("Кристина теперь получает " + (int)kristinaNewSalary + " рублей. " +
                "Годовой доход вырос на " + (int)kristinaYearDiff + " рублей");
    }
}
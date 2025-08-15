1
        int  = ages 29;
        byte  = numberOfStudents 127;
        short  = killograms 300;
        long = averageKillograms 100000L;
        float = averageScore 4.7f;
        double exactValue = 123.456789;
2
        double = 27.12;
        long = 987 678 965 549;
        float = 2,786;
        int = 569;
        int = -159;
        int = 27897;
        byte = 67;
3
        byte ludmilaStudents = 23;
        byte annaStudents = 27;
        byte ekaterinaStudents = 30;

        int totalPaper = 480;

        int totalStudents = ludmilaStudents + annaStudents + ekaterinaStudents;

        int paperPerStudent = totalPaper / totalStudents;
4
        byte bottlesPer2Minutes = 16;

        byte bottlesPerMinute = bottlesPer2Minutes / 2;

        int twentyMinutesProduction = (bottlesPerMinute * 20);

        int dailyProduction = (bottlesPerMinute * 1440);

        int threeDaysProduction = dailyProduction * 3;

        int monthlyProduction = dailyProduction * 30;
5
        byte numberOfCans = 120;
        byte witePaintPerClass = 2;
        byte brownPaintsPerClass = 4;
        byte paintPerClass = witePaintPerClass + brownPaintsPerClass;
        byte numberOfClasses = numberOfCans / paintPerClass;
        byte totalWhitePaintCans = numberOfClasses * witePaintPerClass;
        byte totalBrownPaintCans = numberOfClasses * brownPaintsPerClass;
6
        byte bananaCount = 5;
                byte bananaWeight = 20;
                int totalBananaWeight = bananaCount * bananaWeight;
                        int milkML = 200;
                        byte milkPre100Ml = 105;
                        int totalMilkWeight = milkML * milkPre100Ml / 100;
                                byte iceCream = 2;
                                        byte iceCreamWeight = 100;
                                        int totalIceCreamWeight = iceCream * iceCreamWeight;
                                        byte eggs = 4;
                                        byte eggsWeight = 70;
                                        int totalEggsWeight = eggs * eggsWeight;
                                        int totalGr = totalMilkWeight + totalBananaWeight + totalIceCreamWeight + totalEggsWeight;
                                        double totalKg = totalGr / 1000.0;
7
byte targetWeightLossKg = 7;
        int targetWeightLossGr = targetWeightLossKg * 1000;
        int minDailyLossGr = 250;
        int maxDailyLossGr = 500;
        int daysForMinLoss = targetWeightLossGr / minDailyLossGr;
        int daysForMaxLoss = targetWeightLossGr / maxDailyLossGr;
        int averageDays = (daysForMinLoss + daysForMaxLoss) / 2;
8
        int mashaSalary = 67 760;
int denisSalary = 83 690;
int kristinaSalary = 76 230;
        double mashaNewSalary = mashaSalary * 1.10;
        double denisNewSalary = denisSalary * 1.10;
        double kristinaNewSalary = kristinaSalary * 1.10;
        double mashaYearDiff = (mashaNewSalary - mashaSalary) * 12;
        double denisYearDiff = (denisNewSalary - denisSalary) * 12;
        double kristinaYearDiff = (kristinaNewSalary - kristinaSalary) * 12;


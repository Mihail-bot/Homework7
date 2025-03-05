public class Main {
    public static void main(String[] args) {
        System.out.println("    Задание 1");
        int savings = 0, month = 0;
        while (savings < 2459000) {
            savings = savings + 15000;
            month = month + 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + savings + " рублей");
        }

        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (i =10;i>=1; i--) {
            System.out.print(i + " ");

        }
        System.out.println();
        System.out.println("Заданеи 3 ");
        int y = 120000000, birthRate = 17, mortalityRate = 8, increase, totalMortality;
        while (i < 10) {
            i++;
            increase = y / 1000 * birthRate;
            totalMortality = y / 1000 * mortalityRate;
            y = y + increase - totalMortality;
            System.out.println("Год " + i + ", численность населения составляет " + y);
        }
        System.out.println("Задание 4");
        int totalSavings = 15000;
        i = 0;
        while (totalSavings < 12000000) {
            i++;
            totalSavings= (int) (totalSavings+totalSavings*0.07);
            System.out.println("Месяц "+i+" , сумма = "+totalSavings+" рублей.");

        }
        System.out.println("Задание 5");
        i=0;
        totalSavings=15000;
        while (totalSavings < 12000000) {
            i++;
            totalSavings = (int) (totalSavings + totalSavings * 0.07);
            if(i%6==0) {
              System.out.println("Месяц " + i + " , сумма = " + totalSavings + " рублей.");
            }

            }
        System.out.println("Последний месяц " + i + " , итоговая сумма = " + totalSavings + " рублей.");
        System.out.println("задание 6");
        i=0;
        totalSavings=15000;
        while (i<=12*9) {
            i++;
            totalSavings = (int) (totalSavings + totalSavings * 0.07);
            if(i%6==0) {
                System.out.println("Месяц " + i + " , сумма = " + totalSavings + " рублей.");
            }

        }
        System.out.println("Задание 7");
        int day=7, point=7;
       // System.out.println("Сегодня пятница "+day+" число. Необходимо подготовить отчет.");
        while(day<=31){
           if((day-point)%7==0){
                System.out.println("Сегодня пятница "+day+" число. Необходимо подготовить отчет.");

           }
            day++;
        }
        System.out.println("Задание 8");
        int toDayYear =2025;
        int previousYear=1825;
        int futureYear=2125;

        for (int year=0;year<futureYear;year+=79){

            if (year>previousYear) {
                System.out.println(year);
            }

        }

    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Задача 1");
    for (int i=1; i < 11; i++){
        System.out.println("Итерация цикла " + i);
    }
        System.out.println("Задача 2");
        for (int t=10; t > 0; t--){
            System.out.println("Итерация цикла " + t);}
        System.out.println("Задача 3");
        for (int r=0; r < 17; r=r+2) {
            System.out.println("Итерация цикла " + r);}
        System.out.println("Задача 4");
        for (int e=10; e > -11; e=e-1) {
            System.out.println("Итерация цикла " + e);}
        System.out.println("Задача 5");
        for (int v=1904; v < 2094; v=v+4) {
            System.out.println("Итерация цикла " + v + " является високосным");
        }
        System.out.println("Задача 6");
        for (int d=7; d <=98; d=d+7) {
            System.out.println("Итерация цикла " +d );
        }
        System.out.println("Задача 7");
        for (int f=1; f <=512; f=f*2) {
            System.out.println("Итерация цикла " + f );
        }
        System.out.println("Задача 8 and 9");
        int amount =29000;
        float amoutPercent = 0f;
        float percent = 1.01f;
        for (int m=1; m <= 12; m++) {
            amoutPercent =(amoutPercent + amount) * percent;

            System.out.println("Месяц " + m + " сумма накоплений равна " + amoutPercent + " рублей");
        }
        System.out.println("Задача 10");
        int two = 2;
        int twoNext = 0;
        for (int t = 1; t<=10; t++) {
            twoNext = two * t;
            System.out.println("2*" +t+ "=" +twoNext+"!");
        }
        System.out.println("Урок 2");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + salary;
            if (i==i++); {
                System.out.println("Месяц " + i + " Итого " + total);
            }}
        System.out.println("Задача 2");
        int f =0;
        while ( f < 10) {
        if (f==f++); {
        System.out.print(" "+ f ); }}
        System.out.println();

        for (int t=10; t > 0; t--){
            System.out.print(" " + t);}
        System.out.println();



        System.out.println("Задача 3");

        int people = 12_000_000;
        int diffPeople = people/1000;
        int rait = 17;
        int dead = 8;
        for (int year = 1; year <= 10; year++) {
            people = people + ( diffPeople * (rait - dead));
            System.out.println(" год " + year + " численность начеления составляет " + people +" человек ");
        }
        System.out.println("Задача 4");
        int salary1 = 15000;
        int ii = 0;
        while (salary1 < 12_000_000) {
            salary1 = salary1+(salary1/100*7);
            if (ii==ii++); {
                System.out.println("Месяц " + ii + " Итого " + salary1);}}

        System.out.println("Задача 5");
        int salary2 = 15000;
        int month = 0;
        while (salary2 <=12_000_000) {
            salary2 = salary2+(salary2/100*7);
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " Итого " + salary2);}}
        System.out.println("Задача 6");

        int salary3 = 15000;
        int month1 = 0;
        while (month1 < 108) {
            salary3 = salary3+(salary3/100*7);
            month1++;
            if (month1 % 6 == 0) {
                System.out.println("Месяц " + month1 + " Итого " + salary3);}}

        System.out.println("Задача 7");
        int days1 = 2;
        for (; days1<=31; days1++) {
            if (days1 % 7 ==2) {
            System.out.println("Сегодня пятница " +days1+ " число. Необходимо подготовить отчёт");}}

        System.out.println("Задача 8");
        int year = 2024;
        int comet = 79;
        int ThePast = year - 200;
        int future = year + 100;
        for(int y = 0;ThePast < future && y < 3; y++ ){
            ThePast = ThePast + comet;
            System.out.println(ThePast); }









    }
}
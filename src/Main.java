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
            System.out.println("2*" +t+ "=" +twoNext+"");
        }

}}
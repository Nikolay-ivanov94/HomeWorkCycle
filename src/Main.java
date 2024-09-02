public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        System.out.println();

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println();

        for (int i = 2; i < 17; i = i + 2) {
            System.out.println(i);
        }
        System.out.println();

        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }
        System.out.println();

        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println();

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        System.out.println();

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        System.out.println();

        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println();

        int total2 = 0;
        for (int i = 1; i <= 12; i++) {
            total2 = total2 + total2 / 100;
            total2 = total2 + salary;
            System.out.println("Месяц " + i + ", Итого " + total2);
        }
        System.out.println();

       for (int i = 1; i <= 10; i++) {
           System.out.println("2*" + i + "=" + (i*2));
        }
    }
}
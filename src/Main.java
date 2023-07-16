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
        task9A();
        task9B();
        task10();
    }

    public static void task1() {
        System.out.println("Задача 1");
        for (int i = 0; i <= 10; i = i + 1) {
            System.out.println(i);

        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        for (int i = 10; i > 0; i = i - 1) {
            System.out.println(i);
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        for (int i = 0; i < 17; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println("Високосный год " + i);
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int savings = 0;
        int monthPayment = 29000;
        for (int i = 1; i <= 12; i++) {
            savings = savings + monthPayment;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + savings + " рублей");
        }
    }

    public static void task9A() {
        System.out.println("Задача 9,I вариант решения");
        double savings = 0;
        int monthPayment = 29000;
        int percent = 12;
        for (int i = 1; i <= 12; i++) {
            savings = (savings + monthPayment) + savings * percent / 100;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + savings + " рублей");
        }
        System.out.println(savings);
    }

    public static void task9B() {
        System.out.println("Задача 9, II вариант решения");
        int salary = 29000;
        double total = 0;

        int salaryWithPenny = salary * 100;
        int totalWithPenny = 0;
        for (int i = 0; i < 12; i++) {
            totalWithPenny = totalWithPenny + totalWithPenny / 100;
            totalWithPenny = totalWithPenny + salaryWithPenny;

            total = totalWithPenny / 100.;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей");
        }
        System.out.println(total);
    }

    public static void task10() {
        System.out.println("Задача 10");
        int a = 2;
        int composition = 0;
        for (int i = 1; i <= 10; i++) {
            composition = a * i;
            System.out.println(a + "*" + i + "=" + composition);
        }
    }
}
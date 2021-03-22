package Lesson01.online;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 17.03.2021
 */

public class FirstClass {

    public static void main(String[] args) {
//        System.out.println("Hello_all! This is Java! Hello from WinConsole!");
//        System.out.print("Something text!");

//        //целочисленные
//        byte myByte = 25; //-128..+127 (1b)
//        short myShort = 250; //-32768..+32767 (2b)
//        int myInt = 50000; //-2.1*10^9..+2.1*10^9 (4b)
//        long myLong = 3000000000L; // -2^63 .. + 2^63 (8b)
//
//        //числа с плавающей точкой
//        float myFloat = 15.8f; // (4b)
//        double myDouble = 15.8; // (8b)
//
//        //символы
//        char myChar = 'q'; // (2b)
//
//        boolean myBoolean = false; //true
//
//        //Math operators: +, -, *, /, ^, %
//
//        int x = 15;
//        int y = 4;
//        int result = x % y;
//        System.out.println(result);
//
//        int abc = 15000;
//        double cde = 152.867;
//        System.out.println(abc + cde);
//
//        String myString = "=^_^=";
//        System.out.println(myString + abc);

//        int myAge = 50;
//
//        if (myAge < 18) {
//            System.out.println("Sorry!!! You can't buy");
//        } else if (myAge > 65) {
//            System.out.println("You old man - go home");
//        } else {
//            System.out.println("You OK!!!!");
//        }

        int a = 150;
        int b = 37;
        int result;

//        result = a * b;
        result = myCalculate(a, b);
        a++; //a = a + 1 -> a++ ||||||  a = a + 5 -> a += 5
        result = myCalculate(a, b);
        b++;
        result = myCalculate(a, b);
        a++;
        result = myCalculate(a, b);

        System.out.println(result); //189

        doSomething();

        check(50, 987);
        humanStep();

    }

    public static int myCalculate(int inputDec, int javaValue) {
        return inputDec + javaValue;
    }

    public static void doSomething() {
        float valueA = 250.987f;
        float valueB = 1002.445f;
        System.out.println(valueA * valueB);
    }

    public static void check(int a, int b) {
        System.out.println(a + b);
    }

    public static void humanStep() {
        System.out.println("Human must go");
    }


}

/*
1) Написать метод вычисляющий выражение a * (b + (c / d)) и
    возвращающий результат с плавающей точкой, где a, b, c, d – целочисленные входные параметры этого метода;

2) Написать метод, принимающий на вход два целых числа,
и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
если да – вернуть true, в противном случае – false;

3) Написать метод, которому в качестве параметра передается целое число,
метод должен проверить положительное ли число передали, или отрицательное.
Замечание: ноль считаем положительным числом. Результат работы метода вывести в консоль

4) Написать метод, которому в качестве параметра передается строка, обозначающая имя,
метод должен вернуть приветственное сообщение «Привет, переданное_имя!»; Вывести приветствие в консоль.

5)** Написать метод, который определяет является ли год високосным.
Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
Для проверки работы вывести результаты работы метода в консоль
*/

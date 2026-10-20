package guru.qa;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //8 примитивных типов данных
        // Целочисленные типы
        byte aByte = 0; // 8b -128 +128
        short aShort = 0;//16b -32768 +32767
        int aInt = 0; //32b (-2^32) (+2^32 - 1)
        Integer intWrapper = 0; //Объектный тип данных
        long aLong = 0L;//64b (-2^64) (+2^64 - 1)

        // Типы с плавающей точкой
        float aFloat = 0.0F; //32b
        double aDouble = 0.0;//64b
        Double doubleWrapper = 9.1; //Объектный тип данных
        // Символьный тип
        char aChar = 'a';//16b
        Character charWrapper = 'a'; //Объектный тип данных
        // Логический тип
        boolean aBoolean = true;//~1b
        Boolean booleanWrapper = true; //Объектный тип данных
        // Строка (и бесконечность других объектных/ссылочных типов данных)
        String toBePrint = "Hello world!";
        List<String> teachers = List.of("Stanislav, Dmitrii");

        //Операторы
        // Операторы присвоения =
        String name = "Dmitrii";
        int age = 27;
        // Арифметические операторы +, -, /, *, %, ++, --

        System.out.println(4.0 + 3);
        // Операторы сравнения <, >, >=, <=, !=, ==
        System.out.println(3 != 2);
        // Логические операторы &, |, &&, ||, !
        System.out.println(name.equals("Dmitrii") && age == 27);

        // Операторы instanceof

        System.out.println(name instanceof String);

        // Тернарный оператор

        char sex = 'm';

        String childName = sex == 'm'
                ? "Valentin"
                : "Valentina";
        // Управляющая конструкция if

        if (sex == 'm') {
            childName = "Valentin";
        }else if (sex == 'w')  {
            childName = "Valentina";
        } else {
            System.out.println("=(");
        }

        // Ключевое слово new

        String firstName = new String("Dima"); // == String firstName = "Dima";


    }
}
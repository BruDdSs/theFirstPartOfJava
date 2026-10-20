package guru.qa;

public class JavaFirstHomeWork {
    public static void main(String[] args) {
        //0) применить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int
    int a = 6;
    int b = 2;
    double c = 2.5;
    System.out.println("Сумма переменных a и b равна " + (a + b) );
    System.out.println("Разность переменных a и b равна " + (a - b) );
    System.out.println("Умножение переменных a и b равно " + (a * b) );
    System.out.println("Целочисленное деление переменных a и b равна " + (a / b) );

    //1) применить несколько арифметических операций над int и double в одном выражении
    System.out.println("Выражение с int и double равно " + ((a + c) + (a - c) * c) );

    //2) применить несколько логических операций ( < , >, >=, <= )
    if (a>b) {
        System.out.println("Число " + a + " больше числа " + b);
        } else {
        System.out.println("Число " + a + " меньше числа " + b);
    }
    // 3) прочитать про диапазоны типов данных для вещественных / чисел с плавающей точкой (какие максимальные и минимальные значения есть, как их получить) и переполнение

    System.out.println("Тип float минимальное положительное значение " + Float.MIN_VALUE);
    System.out.println("Тип float минимальное отрицательное значение " + (-Float.MAX_VALUE));
    System.out.println("Тип float максимальное значение " + Float.MAX_VALUE);
    System.out.println("Тип double минимальное положительное значение " + Double.MIN_VALUE);
    System.out.println("Тип double минимальное отрицательное значение " + (-Double.MAX_VALUE));
    System.out.println("Тип double максимальное значение " + Double.MAX_VALUE);

    //4) получить переполнение при арифметической операции
    System.out.println("Переполненый тип int " + (Integer.MAX_VALUE + 1));
    System.out.println("Переполненый тип double " + (Double.MAX_VALUE * 2));

    }

}
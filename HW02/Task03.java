// Задача3: - по желанию
// Напишите программу, которая запрашивает у пользователя три числа и выполняет следующие проверки:

// Если первое число больше 100, выбросить исключение NumberOutOfRangeException с сообщением "Первое число вне допустимого диапазона".
// Если второе число меньше 0, выбросить исключение NumberOutOfRangeException с сообщением "Второе число вне допустимого диапазона".
// Если сумма первого и второго чисел меньше 10, выбросить исключение NumberSumException с сообщением "Сумма первого и второго чисел слишком мала".
// Если третье число равно 0, выбросить исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо".
// В противном случае, программа должна выводить сообщение "Проверка пройдена успешно".
// - необходимо создать 3 класса собвстенных исключений

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) throws Exception {
        try {
            Double num1 = prompt("Введите число #1: ");
            Double num2 = prompt("Введите число #2: ");
            Double num3 = prompt("Введите число #3: ");

            if (num1 > 100) {
                throw new NumberOutOfRangeException("Первое число вне допустимого диапазона!");
            }
            if (num2 < 0) {
                throw new NumberOutOfRangeException("Второе число вне допустимого диапазона!");
            }

            if ((num1 + num2) < 10) {
                throw new NumberSumException("Сумма первого и второго чисел слишком мала!");
            }

            if (num3 == 0) {
                throw new DivisionByZeroException("Деление на ноль недопустимо!");
            }

            System.out.println("Проверка пройдена успешно!");

        } catch (DivisionByZeroException | NumberSumException | NumberOutOfRangeException e) {
            System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }

    /**
     * Takes double value from console
     * 
     * @param msg - message to invite user
     * @return double value parsed from the string input
     */
    public static double prompt(String msg) {
        Scanner scan = new Scanner(System.in);
        Double res = null;

        System.out.print(msg);

        try {
            res = Double.parseDouble(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Input error in prompt(): " + e.getClass().getSimpleName());
        }

        return res;
    }

}

/** Class of custom 'out of range' exception */
class NumberOutOfRangeException extends Exception {
    public NumberOutOfRangeException(String msg) {
        super(msg);
    }
}

/** Class of custom 'improper sum value' exception */
class NumberSumException extends Exception {
    public NumberSumException(String msg) {
        super(msg);
    }
}

/** Class of custom 'divide by zero' exception */
class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String msg) {
        super(msg);
    }
}
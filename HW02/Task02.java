// Задача 2:
// Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление. 
// Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException 
// с сообщением "Деление на ноль недопустимо". В противном случае, программа должна выводить 
// результат деления.

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        try {
            System.out.println(
                    "Результат деления: " + division(prompt("Введите число #1: "), prompt("Введите число #2: ")));

        } catch (DivisionByZeroException e) {
            System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }

    /** method to divide one number by another */
    public static double division(double num1, double num2) throws DivisionByZeroException {
        if (num2 == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо!");
        }
        return num1 / num2;
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

/** Class of custom 'divide by zero' exception */
class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String msg) {
        super(msg);
    }
}
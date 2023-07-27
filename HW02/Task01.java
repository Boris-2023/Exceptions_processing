// Задача 1:
// Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным. 
// Если число отрицательное или равно нулю, программа должна выбрасывать исключение InvalidNumberException 
// с сообщением "Некорректное число". В противном случае, программа должна выводить сообщение "Число корректно".

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        try {
            checkNumber(prompt("Введите число: "));
        } catch (InvalidNumberException e) {
            System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }

    /** method to check if the number is positive */
    public static void checkNumber(double num) throws InvalidNumberException {
        if (num <= 0) {
            throw new InvalidNumberException("Некорректное число!");
        }
        System.out.println("Число корректно!");
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
        } finally {
            scan.close();
        }

        return res;
    }

}

/** Class of custom number exception */
class InvalidNumberException extends Exception {
    public InvalidNumberException(String msg) {
        super(msg);
    }
}
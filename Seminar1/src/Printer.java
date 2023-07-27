class Answer {
    public void arrayOutOfBoundsException() {
        // Напишите свое решение ниже
      int[] a = new int[5];
      System.out.println(a[5]);
      
}

    public void divisionByZero() {
        // Напишите свое решение ниже
      System.out.println(5/0);
      
}

    public void numberFormatException() {
        // Напишите свое решение ниже
       int a = Integer.parseInt("aaa");
 }
}

public class Printer {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}
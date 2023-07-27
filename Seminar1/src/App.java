import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // --------> 1
        // int arr[] = new int[4];

        // try {

        // System.out.println("\nEnter to block 1");
        // int num = Integer.parseInt("aaa");
        // System.out.println("NOT visible: " + arr[100]);

        // } catch (Exception e) {
        // System.out.println("Error: " + e.getMessage());
        // } finally {
        // System.out.println("\nFinally executed!!!");
        // }

        // System.out.println("\nProceed after error!");

        // --------> 2
        // try {
        // int res = divide(10, 2);
        // System.out.println("\n" + res);

        // res = divide(10, 0);
        // System.out.println("\n" + res);

        // } catch (Exception e) {

        // System.out.println(e.getMessage());
        // }


        // -----------> Task #1
        System.out.println("Your age? ");
        Scanner scan = new Scanner(System.in);

        try {
            int age = Integer.parseInt(scan.nextLine());
            if (age < 0 || age > 120) {//this error has NO preset type => need to make new class of error extending Exception
                throw new InvalidAgeException("\nInvalid age !!!");
            }
            System.out.println("ваш возраст: " + age);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("\nIncorrect input!; " +  e.getMessage());
            
        }

        
        

    }



    public static int divide(int a, int b) {
        if (b == 0)
            throw new ArithmeticException("NO divide by zero!");
        return a / b;
    }

    public static int intdoSmth(int a, int b) throws ArithmeticException {
        if (b == 0)
            throw new ArithmeticException("NO divide by zero!");
        return a / b;
    }

}

public class Calculator01 {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0)
            throw new ArithmeticException("Divide by zero is not allowed!");
        return a / b;
    }

    public static void main(String[] args) {
        Calculator01 calculator = new Calculator01();
        try {
            System.out.println(calculator.divide(10, 0));
        } catch (Exception e) {
            System.out.println("Error occured: " + e.getMessage());
        }

    }
}


// BAD CODE !!! as we must process exception where the decision is made, not in
// a service method (divide() has no influence on input parameters)

// public class Calculator {

// public double divide(double a, double b) {
// try {
// return a / b;
// } catch (ArithmeticException e) {
// System.out.println("Произошла ошибка: " + e.getMessage());
// }
// return 0;
// }

// public static void main(String[] args) {
// Calculator calculator = new Calculator();
// System.out.println(calculator.divide(10, 0));
// }
// }

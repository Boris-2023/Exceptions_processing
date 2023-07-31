public class Calculator02 {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0)
            throw new ArithmeticException("Divide by zero is not allowed!");
        return a / b;

    }

    public double multiply(double a, double b) {
        if (a > Double.MAX_VALUE)
            throw new ArithmeticException("Double type overflow!");
        return a * b;
    }

    public double subtract(double a, double b) {
        if (a < b)
            throw new ArithmeticException("1st number is less than the 2nd!");
        return a - b;

    }

    public static void main(String[] args) {

        Calculator02 calculator = new Calculator02();
        // separate 'try' - all are tried anyway, otherwise will end just by the 1st
        // exception; need to process exceptions INDEPENDENTLY
        
        try {
            System.out.println(calculator.divide(10, 0));
        } catch (Exception e) {
            System.out.println("\nError occured: " + e.getMessage());
        }

        try {
            System.out.println(calculator.multiply(5, 10));
        } catch (Exception e) {
            System.out.println("\nError occured: " + e.getMessage());
        }

        try {
            System.out.println(calculator.subtract(5, 10));
        } catch (Exception e) {
            System.out.println("\nError occured: " + e.getMessage());
        }
    }
}

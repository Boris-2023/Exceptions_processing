package Task2;

import java.util.Scanner;

public class Task2 {
    public static void negNumber(int num){
        if(num < 0 ){
            throw new NegativeNumberException("No negative values are allowed!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        try {
            negNumber(number);
        } catch (NegativeNumberException e) {
            System.out.println(e.getClass().getSimpleName());
        }
        
    }
}

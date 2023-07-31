package Model;

import Controller.iGetModel;
import Exceptions.InvalidInputException;

/**
 * Class Calculator implementing iGetModel and using private fields
 * <b>result</b>, <b>arg1</b> and <b>arg2</b>
 */
public class Calculator implements iGetModel {

    private double arg1, arg2;

    /**
     * method to set 1st argument for the calculator - return true if succeeded
     * 
     * @param value - string value to set as argument #1
     * @see Calculator#setArg1(String)
     */
    public void setArg1(String value){
        if(isNumeric(value)) {
            arg1 = Double.parseDouble(value);
        } else{
            throw new NumberFormatException();
        }
    }

    /**
     * method to set 2nd argument for the calculator - return true if succeeded
     * 
     * @param value - string value to set as argument #2
     * @see Calculator#setArg2(String)
     */
    public void setArg2(String value){
        if(isNumeric(value)) {
            arg2 = Double.parseDouble(value);
        } else{
            throw new NumberFormatException();
        }
    }

    /**
     * method to get 1st argument as a number
     * 
     * @see Calculator#getArg1()
     */
    public double getArg1() {
        return arg1;
    }

    /**
     * method to get 2nd argument as a number
     * 
     * @see Calculator#getArg2()
     */
    public double getArg2() {
        return arg2;
    }

    /**
     * method to perform division of two numbers
     * 
     * @see Calculator#divide()
     */
    public double divide(){
        if (arg2 == 0)
            throw new ArithmeticException();
        return arg1 / arg2;
    }

    /**
     * method to perform multiplication of two numbers
     * 
     * @see Calculator#multiply()
     */
    public double multiply() {
        if (arg1 > Double.MAX_VALUE | arg2 > Double.MAX_VALUE)
            throw new ArithmeticException();
        return arg1 * arg2;
    }

    /**
     * method to perform summation of two numbers
     * 
     * @see Calculator#sum()
     */
    public double sum() {
        if (arg1 > Double.MAX_VALUE | arg2 > Double.MAX_VALUE)
            throw new ArithmeticException();
        return arg1 + arg2;
    }

    /**
     * method to perform deduction of two numbers
     * 
     * @see Calculator#subsuct()
     */
    public double subtract() {
        if (arg1 < arg2)
            throw new ArithmeticException();
        return arg1 - arg2;

    }

    /**
     * method to raise arg1 to a power Arg2
     * 
     * @see Calculator#calculatePower()
     */
    @Override
    public double calculatePower() {
        if (arg1 == 0 & arg2 <0 )
            throw new InvalidInputException();
        return Math.pow(arg1, arg2);
    }

     /**
     * method to check if the string argument can be parsed into double
     * 
     * @param value - string value to be parsed
     * @see Calculator#isNumeric(String)
     */
    public boolean isNumeric(String value){
        try {
            Double.parseDouble(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}

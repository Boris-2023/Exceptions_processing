package Controller;

/**
 * public interface for the models
 */
public interface iGetModel {
    public void setArg1(String value);

    public void setArg2(String value);

    public double getArg1();

    public double getArg2();

    public double divide();

    public double multiply();

    public double sum();

    public double subtract();

    public double calculatePower();

}

package Controller;

/**
 * public interface for the views
 */
public interface iGetView {
    // prints whole the problem with result
    String displaySolved(Double arg1, Double arg2, String operation, Double result);

    // request for user input (command or data from user)
    String prompt(String msg);

    // invite msg
    String msgOnInvite();

    // message to invite for new calculation
    String msgOnNewCalculation();

    // message to request 1st argument
    String msgOn1stArgument();

    // message to request 2nd argument
    String msgOn2ndArgument();

    // message to request an operation
    String msgOnOperation();

    // bad command message
    String msgOnBadCommand();

    // message on bad number input
    String msgOnBadNumber();

    // message on exit
    String msgOnExit();

    // message on result
    String msgOnResult();
    
    // message on divide by zero
    String msgOnDivideByZero();

    // message on Double type overflow
    String msgOnOverDblTypeSize();

    // message on Double type overflow
    String msgOn1stNumLessThen2nd();

    // message on invalid input exception
    String msgOnInvalidInput();
}

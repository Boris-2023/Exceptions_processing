package Controller;

/**
 * Class Controller using private fields
 * <b>model</b> and <b>view</b>
 */
public class Controller {

    private iGetModel model;
    private iGetView view;

    /**
     * Creating new instance of Controller with specified parameters:
     * 
     * @param view  -> model for the calculator
     * @param model -> view for the calculation, with easy add of user language
     * @see Controller#Controller(iGetModel, iGetView)
     */
    public Controller(iGetView view, iGetModel model) {
        this.view = view;
        this.model = model;
    }

    /**
     * basic method to run the calculator
     * 
     * @see Controller#run()
     */
    public void run() {
        boolean getNewIteration = true;
        Double arg1, arg2, result;
        String oper;

        System.out.println(view.msgOnInvite());

        while (getNewIteration) {

            // initialization
            arg1 = null;
            arg2 = null;
            oper = null;

            // takes 1st argument until done
            boolean chk = false;
            while (!chk) {
                try {
                    model.setArg1(view.prompt(view.msgOn1stArgument()));
                    arg1 = model.getArg1();
                    chk = true;
                } catch (Exception e) {
                    System.out.println(e.getClass().getSimpleName() + view.msgOnBadNumber());
                }
            }

            // takes 2nd argument until done
            chk = false;
            while (!chk) {
                try {
                    model.setArg2(view.prompt(view.msgOn2ndArgument()));
                    arg2 = model.getArg2();
                    chk = true;
                } catch (Exception e) {
                    System.out.println(e.getClass().getSimpleName() + view.msgOnBadNumber());
                }
            }

            // takes operation until done
            chk = false;
            while (!chk) {
                oper = view.prompt(view.msgOnOperation()).toLowerCase();
                chk = (oper.equals("+") | oper.equals("*") | oper.equals("/") | oper.equals("-") | oper.equals("pw"));
                if (!chk)
                    System.out.println(view.msgOnBadCommand());
            }

            // apply operations
            switch (oper) {
                case "+":
                    try {
                        result = model.sum();
                        System.out.println(view.displaySolved(arg1, arg2, oper, result));
                    } catch (Exception e) {
                        System.out.println(e.getClass().getSimpleName() + view.msgOnOverDblTypeSize());
                    }
                    break;
                case "-":
                    try {
                        result = model.subtract();
                        System.out.println(view.displaySolved(arg1, arg2, oper, result));
                    } catch (Exception e) {
                        System.out.println(e.getClass().getSimpleName() + view.msgOn1stNumLessThen2nd());
                    }
                    break;
                case "*":
                    try {
                        result = model.multiply();
                        System.out.println(view.displaySolved(arg1, arg2, oper, result));
                    } catch (Exception e) {
                        System.out.println(e.getClass().getSimpleName() + view.msgOnOverDblTypeSize());
                    }
                    break;
                case "/":
                    try {
                        result = model.divide();
                        System.out.println(view.displaySolved(arg1, arg2, oper, result));
                    } catch (Exception e) {
                        System.out.println(e.getClass().getSimpleName() + view.msgOnDivideByZero());
                    }
                    break;
                case "pw":
                    try {
                        result = model.calculatePower();
                        System.out.println(view.displaySolved(arg1, arg2, oper, result));
                    } catch (Exception e) {
                        System.out.println(e.getClass().getSimpleName() + view.msgOnInvalidInput());
                    }
                default:
                    break;
            }

            // request to start new calculation
            String str = view.prompt(view.msgOnNewCalculation()).toUpperCase();
            if (!str.equals("Y")) {
                getNewIteration = false;
                System.out.println(view.msgOnExit());
            }
        }
    }
}

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.Calculator;
import View.ViewRus;

public class App {
    public static void main(String[] args) throws Exception {

        iGetView view = new ViewRus();
        iGetModel model = new Calculator();

        Controller calc = new Controller(view, model);

        calc.run();
    }
}

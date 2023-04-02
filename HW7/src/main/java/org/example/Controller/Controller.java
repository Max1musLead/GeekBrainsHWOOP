package HW7.src.main.java.org.example.Controller;

import org.example.Calc.CalculableFactory;
import org.example.Calc.ICalculableFactory;
import org.example.View.ViewCalculator;

public class Controller {
    public static void Start() {
        ICalculableFactory cF = new CalculableFactory();
        ViewCalculator vW = new ViewCalculator(cF);
        vW.run();
    }


}

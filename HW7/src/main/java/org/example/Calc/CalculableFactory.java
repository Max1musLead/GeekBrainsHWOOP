package HW7.src.main.java.org.example.Calc;

import org.example.Chislo.Chislo;

public class CalculableFactory implements ICalculableFactory{
    @Override
    public CalculatorImpl create(Chislo number1, Chislo number2) {
        return new Calculator(number1,number2);
    }
}

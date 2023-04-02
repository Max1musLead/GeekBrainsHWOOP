
package HW7.src.main.java.org.example.View;

import org.example.Calc.CalculatorImpl;
import org.example.Calc.ICalculableFactory;
import org.example.Chislo.Chislo;
import org.example.Controller.GetterChislo;
import org.example.Controller.Logger;

import java.util.Scanner;

public class ViewCalculator {

    private ICalculableFactory calculableFactory;
    private Logger logger = new Logger();

    public ViewCalculator(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        while (true) {
            System.out.println("Первое число");
            Chislo i = new GetterChislo().getChislo();
            System.out.println("Второе число");
            Chislo z = new GetterChislo().getChislo();
            System.out.println("Начали");
            System.out.println("Ваши числа: ");
            System.out.println(i.toString());
            System.out.println(z.toString());
            CalculatorImpl calculator = calculableFactory.create(i, z);
            while (true) {
                String cmd = prompt("Введите команду (*, +, /, =) : ");
                if (cmd.equals("*")) {
                    System.out.println("Умножение выполнено");
                    calculator.multi();
                    logger.add("Произведено умножение" + calculator.getResult().toString());
                    continue;
                }
                if (cmd.equals("+")) {
                    System.out.println("Сложение выполнено");
                    calculator.sum();
                    logger.add("Произведено сложение" + calculator.getResult().toString());
                    continue;
                }
                if (cmd.equals("/")) {
                    System.out.println("Деление выполнено");
                    calculator.del();
                    logger.add("Произведено деление" + calculator.getResult().toString());
                    continue;
                }
                if (cmd.equals("=")) {
                    Chislo y = calculator.getResult();
                    System.out.println(y.toString());
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (y/n) или вывести лог?");
            if ((cmd).equalsIgnoreCase("y")) {
                continue;
            }
            if ((cmd).equalsIgnoreCase("log")) {
                logger.show();
                continue;
            }
            else break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}


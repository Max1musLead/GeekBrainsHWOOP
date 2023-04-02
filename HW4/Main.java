package HW4;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Calc<Number> calculator = new Calc<>();
        double res = calculator.sum(new ArrayList<>(Arrays.asList(1,2)));
        double res1 = calculator.multi(new ArrayList<>(Arrays.asList(1.2,2)));
        double res2 = calculator.del(new ArrayList<>(Arrays.asList(1,2.3)));
        System.out.println(res);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(calculator.binary(12.5));
        System.out.println(calculator.binary("12.5"));
        System.out.println(calculator.binary("12"));
        System.out.println(calculator.binary(12));

    }
}

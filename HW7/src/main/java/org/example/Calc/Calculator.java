package HW7.src.main.java.org.example.Calc;

import org.example.Chislo.Chislo;
import org.example.Chislo.ComplNumber;


public class Calculator implements CalculatorImpl {
    Chislo num1;
    Chislo num2;
    ComplNumber result;
    double part1;
    double part2;
    Character function1;
    Character function2;


    private double check(Character f1, Character f2, double x, double y) {
        double res;
        if (f1.equals(f2) && f1.equals('-')) {
            res = -x - y;
        } else if (f1.equals('-') && f2.equals('+')) {
            res = y - x;
        } else if (f1.equals('+') && f2.equals('-')) {
            res = x - y;
        } else {
            res = x + y;
        }
        return res;
    }

    private char check2(double f) {
        if (f < 0) return '-';
        else return '+';
    }

    public Calculator(Chislo number1, Chislo number2) {
        this.num1 = number1;
        this.num2 = number2;
    }

    @Override
    public void sum() {
        char sight1 = num1.getFunct1();
        double first1 = num1.getNum1();
        char sight2 = num1.getFunct2();
        double second1 = num1.getNum2();
        char sight3 = num2.getFunct1();
        double first2 = num2.getNum1();
        char sight4 = num2.getFunct2();
        double second2 = num2.getNum2();
        function1 = check2(check(sight1, sight3, first1, first2));
        function2 = check2(check(sight2, sight4, second1, second2));
        part1 = Math.abs(check(sight1, sight3, first1, first2));
        part2 = Math.abs(check(sight2, sight4, second1, second2));
    }

    @Override
    public void multi() {
        char sight1 = num1.getFunct1();
        double first1 = num1.getNum1();
        char sight2 = num1.getFunct2();
        double second1 = num1.getNum2();
        char sight3 = num2.getFunct1();
        double first2 = num2.getNum1();
        char sight4 = num2.getFunct2();
        double second2 = num2.getNum2();
        double temp1;
        double temp2;
        if(sight1 == '-') first1 = -first1;
        if(sight2 == '-') second1 = -second1;
        if(sight3 == '-') first2 = -first2;
        if(sight4 == '-') second2 = -second2;
        temp1 = (first1*first2)-(second1*second2);
        temp2 = (second1*first2)+(first1*second2);
        part1=Math.abs(temp1);
        part2=Math.abs(temp2);
        if (temp1<0) function1='-';
        else function1='+';
        if (temp2<0) function2='-';
        else function2 = '+';
    }

    @Override
    public void del() {
        char sight1 = num1.getFunct1();
        double first1 = num1.getNum1();
        char sight2 = num1.getFunct2();
        double second1 = num1.getNum2();
        char sight3 = num2.getFunct1();
        double first2 = num2.getNum1();
        char sight4 = num2.getFunct2();
        double second2 = num2.getNum2();
        double temp1;
        double temp2;
        if(sight1 == '-') first1 = -first1;
        if(sight2 == '-') second1 = -second1;
        if(sight3 == '-') first2 = -first2;
        if(sight4 == '-') second2 = -second2;
        temp1 = ((first1*first2)+(second1*second2))/(first2*first2+second2*second2);
        temp2 = ((second1*first2)-(first1*second2))/(first2*first2+second2*second2);
        part1=Math.abs(temp1);
        part2=Math.abs(temp2);
        if (temp1<0) function1='-';
        else function1='+';
        if (temp2<0) function2='-';
        else function2 = '+';
    }


    @Override
    public ComplNumber getResult() {
        return result = new ComplNumber(part1, part2, function1, function2);
    }
}


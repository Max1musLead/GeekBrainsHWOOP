package HW4;

import java.util.List;

public class Calc<T> {
    public Calc() {
    }

    public Double sum(List<Number> items) {
        double sum = 0.0;
        for (Number i : items) {
            sum += i.doubleValue();
        }
        return sum;
    }

    public Double multi(List<Number> items) {
        double res = items.get(0).doubleValue();
        for (int i = 1; i < items.size(); i++) {
            res *= items.get(i).doubleValue();
        }
        return res;
    }

    public Double del(List<Number> items) {
        double res = items.get(0).doubleValue();
        for (int i = 1; i < items.size(); i++) {
            res /= items.get(i).doubleValue();
        }
        return res;
    }

    public String binary(Object num) {
        String someString = num.toString();
        if (someString.contains("."))
            someString = someString.replace('.', ' ').split(" ")[0];
        int n = Integer.parseInt(someString);
        StringBuilder sb = new StringBuilder();
        while (n > 1) {
            sb.append(n % 2);
            n /= 2;
        }
        sb.append(n);
        return sb.reverse().toString();
    }
}

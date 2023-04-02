package HW7.src.main.java.org.example.Chislo;


public abstract class Chislo {
    double num1;
    double num2;
    char funct1;
    char funct2;

    public Chislo(double number1, double number2, char function1, char function2) {
        this.num1 = number1;
        this.num2 = number2;
        this.funct1 = function1;
        this.funct2 = function2;
    }

    public Chislo() {
    }

    @Override
    public String toString() {
        if (num1 % 1 == 0 && num2 % 1 == 0) {
            return String.format("%s%d%s%di", funct1,(int) num1,funct2,(int) num2);
        } else if (num1 % 1 == 0) {
            return String.format("%s%d%s%.3fi", funct1,(int) num1,funct2,num2);
        } else if (num2 % 1 == 0) {
            return String.format("%s%.3f%s%di", funct1,num1,funct2,(int) num2);
        }
        return String.format("%s%.3f%s%.3fi", funct1,num1,funct2,num2);
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public char getFunct1() {
        return funct1;
    }

    public char getFunct2() {
        return funct2;
    }
}

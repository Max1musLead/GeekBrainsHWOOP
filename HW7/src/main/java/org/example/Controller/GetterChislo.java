package HW7.src.main.java.org.example.Controller;

import org.example.Chislo.Chislo;
import org.example.Chislo.ComplNumber;

import java.util.Scanner;

public class GetterChislo implements GettingChislo {

    @Override
    public Chislo getChislo() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите комплексное число в формате +-A+-Bi");
        String str = in.nextLine();
        String[] str2 = str.split("[+-]");
        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();
        char funct1 = '+';
        char funct2 = '+';
        if (str.charAt(0) == '-') {
            funct1 = '-';
        }
        for (int i = 1; i < str.length(); i++) {
            if ((str.charAt(i) == '-' || str.charAt(i) == '+')) {
                funct2 = str.charAt(i);
            }
        }
        if (!str2[0].isEmpty()) {
            for (int i = 0; i < str2[0].length(); i++) {
                if ((Character.isDigit(str2[0].charAt(i))) || str2[0].charAt(i) == '.' || str2[0].charAt(i) == ',') {
                    num1.append(str2[0].charAt(i));
                }

            }
            for (int i = 0; i < str2[1].length(); i++) {
                if (Character.isDigit(str2[1].charAt(i)) || str2[1].charAt(i) == '.' || str2[1].charAt(i) == ',') {
                    num2.append(str2[1].charAt(i));
                }
            }
        } else {
            for (int i = 0; i < str2[1].length(); i++) {
                if ((Character.isDigit(str2[1].charAt(i))) || str2[1].charAt(i) == '.' || str2[1].charAt(i) == ',') {
                    num1.append(str2[1].charAt(i));
                }
            }
            for (int i = 0; i < str2[2].length(); i++) {
                if (Character.isDigit(str2[2].charAt(i)) || str2[2].charAt(i) == '.' || str2[2].charAt(i) == ',') {
                    num2.append(str2[2].charAt(i));
                }
            }
        }
        return new ComplNumber(Double.parseDouble(num1.toString()), Double.parseDouble(num2.toString()), funct1, funct2);
    }
}

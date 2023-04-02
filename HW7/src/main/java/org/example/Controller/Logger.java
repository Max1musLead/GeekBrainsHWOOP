package HW7.src.main.java.org.example.Controller;

import java.util.ArrayList;

public class Logger implements LoggerImp{
    ArrayList<String> strings = new ArrayList<>();
    @Override
    public void add(String s) {
    strings.add(s);
    }

    @Override
    public void show() {
        System.out.println(strings);
    }
}

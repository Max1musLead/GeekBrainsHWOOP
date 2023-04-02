package HW51.untitled.src.main.java.task1.view;

import task1.model.LearnGroup;
import task1.model.User;

import java.util.List;

public class View {
    public static String studentView(List<User> users){
        return users.toString();
    }
    public static String groupView(LearnGroup group){
        return group.toString();
    }
}

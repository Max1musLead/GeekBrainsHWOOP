package HW6.untitled.src.main.java.task1.view;

import task1.model.users.User;

import java.util.List;

public class View {
    public static String studentView(List<User> users) {
        return users.toString();
    }
}

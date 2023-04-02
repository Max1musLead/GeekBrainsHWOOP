package HW51.untitled.src.main.java.task1.model;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class UserService implements DataService {
    static int count = 1;

    @Override
    public User create(Student student, int group) {
        return new Student(new Date(), "stud_fio", 14,group);
    }

    @Override
    public User create(Teacher teacher, List<Integer> gr) {
        count++;
        return new Teacher(new Date(), "teach_fio", 24+count, gr);
    }

    @Override
    public List<User> read(List<User> users) {
        return users;
    }
}

package HW51.untitled.src.main.java.task1.model;

import java.util.List;

public interface DataService {
    User create(Student student, int group);
    User create(Teacher teacher, List<Integer> gr);
    List<User>read(List<User> users);
}

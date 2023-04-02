package HW51.untitled.src.main.java.task1.model;

import java.util.List;

public class LearnGroup {
    Teacher teacher;
    List<Student> group;

    public LearnGroup(Teacher teacher, List<Student> group) {
        this.teacher = teacher;
        this.group = group;
    }

    public LearnGroup() {

    }

    @Override
    public String toString() {
        return "LearnGroup{" +
                "teacher=" + teacher.toString() +
                ", group=" + group.toString() +
                '}';
    }
}

package HW51.untitled.src.main.java.task1.model;

import java.util.Date;
import java.util.List;

public class Student extends User {
    int groupID;
    List<Integer> grade;

    public Student(Date dateBirth, String FIO, int ID, int group) {
        super(dateBirth, FIO, ID);
        this.groupID = group;
    }
    public Student(int group) {
        super();
        this.groupID = group;
    }

    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Student{" +
                "groupID=" + groupID +
                ", grade=" + grade +
                ", dateBirth=" + dateBirth +
                ", FIO='" + FIO + '\'' +
                ", ID=" + ID +
                "}\n";
    }

    public int getGroupID() {
        return groupID;
    }
}

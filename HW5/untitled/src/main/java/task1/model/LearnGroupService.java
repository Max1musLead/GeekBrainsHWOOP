package HW51.untitled.src.main.java.task1.model;

import java.util.ArrayList;
import java.util.List;

public class LearnGroupService {
        public static LearnGroup groupCreate(Teacher teacher, List<Student> group){
            LearnGroup learnGroup = new LearnGroup(teacher,group);
            return learnGroup;
        }

}

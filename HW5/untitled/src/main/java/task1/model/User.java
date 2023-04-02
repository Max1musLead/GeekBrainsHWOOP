package HW51.untitled.src.main.java.task1.model;

import java.util.Date;

public abstract class User {
    Date dateBirth;
    String FIO;
    int ID;

    public User(Date dateBirth, String FIO, int ID) {
        this.dateBirth = dateBirth;
        this.FIO = FIO;
        this.ID = ID;
    }

    public User() {
    }
}

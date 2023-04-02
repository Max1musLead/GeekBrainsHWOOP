package HW6.untitled.src.main.java.task1.model.data;

import task1.model.users.User;

import java.util.List;
/*Принцип разделения интерфейсов*/
public interface DataServiceRead {
    List<User> read(List<User> users);
}

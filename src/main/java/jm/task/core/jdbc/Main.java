package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    public static void main(String[] args) {
        UserService us = new UserServiceImpl();
        us.createUsersTable();
        us.saveUser("Vladimir", "Mazur", (byte) 22);
        us.saveUser("Arseniy", "Kuznetsov", (byte) 22);
        us.saveUser("Alana", "Balaeva", (byte) 19);
        us.saveUser("Vasya", "Norchecheche", (byte) 22);
        us.getAllUsers().forEach(System.out::println);
        us.cleanUsersTable();
        us.dropUsersTable();
    }
}

package mateusz.collections;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User("Bartek", "123"));
        users.add(new User("Milena", "panda"));
        users.add(new User("Michał", "to co, działamy"));

        for (User user : users) {
            System.out.println("name: " + user.getName() + ", password: " + user.getPassword());
        }
    }
}

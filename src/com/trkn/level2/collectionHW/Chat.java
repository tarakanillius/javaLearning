package com.trkn.level2.collectionHW;

import java.util.List;

public class Chat {
    private final String name;
    private final int usersQuantity;
    private List<User> users;

    public Chat(String name, int usersQuantity) {
        this.name = name;
        this.usersQuantity = usersQuantity;
    }

    public Chat(String name, int usersQuantity, List<User> users) {
        this.name = name;
        this.usersQuantity = usersQuantity;
        this.users = users;
    }

    public String getName() {
        return name;
    }

    public int getUsersQuantity() {
        return usersQuantity;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "name='" + name + '\'' +
                ", usersQuantity=" + usersQuantity +
                '}';
    }
}

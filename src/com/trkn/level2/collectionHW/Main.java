package com.trkn.level2.collectionHW;

import java.util.Arrays;
import java.util.List;

import static com.trkn.level2.collectionHW.ChatUtil.getChatByUserAge;
import static com.trkn.level2.collectionHW.ChatUtil.getChatsByUsersQuantity;

public class Main {
    public static void main(String[] args) {
        List<Chat> chats = Arrays.asList(
                new Chat("Chat1",800),
                new Chat("Chat2",600),
                new Chat("Chat3",4000),
                new Chat("Chat4",3000),
                new Chat("Chat5",200)
        );

        List<User> AdultUsers = Arrays.asList(
                new User("Nikita", 25),
                new User("Christina", 25),
                new User("Vlad", 18),
                new User("Dima", 28)
        );

        List<User> ChildUsers = Arrays.asList(
                new User("Oleksandr", 13),
                new User("Elena", 14),
                new User("Xenia", 12)
        );

        List<Chat> chatsWithUsers = Arrays.asList(
                new Chat("Chat1",800,AdultUsers),
                new Chat("chat2",2,ChildUsers)
        );

        getChatsByUsersQuantity(chats,1000).forEach(System.out::println);
        System.out.println();
        getChatByUserAge(chatsWithUsers,18).forEach(System.out::println);
        System.out.println();
        System.out.println(ChatUtil.getAvgAge(AdultUsers));
        System.out.println(ChatUtil.getAvgAge(ChildUsers));

    }
}

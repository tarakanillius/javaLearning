package com.trkn.level2.collectionHW;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ChatUtil {
    private ChatUtil() {}

    public static List<Chat> getChatsByUsersQuantity(List<Chat> chats, int usersQuantity) {
        List<Chat> result = new ArrayList<>();
        Iterator<Chat> iterator = chats.iterator();
        while (iterator.hasNext()) {
            Chat chat = iterator.next();
            if (chat.getUsersQuantity() > usersQuantity) {
                result.add(chat);
            }
        }
        return result;
    }

    public static List<Chat> getChatByUserAge(List<Chat> chats, int userAge) {
        List<Chat> result = new ArrayList<>();
        Iterator<Chat> iterator = chats.iterator();
        while (iterator.hasNext()) {
            Chat chat = iterator.next();
            if (chat.getUsersQuantity() >= userAge) {
                result.add(chat);
            }
        }
        return result;
    }

    public static int getAvgAge(List<User> users) {
        int sum = 0;
        for (User user : users) {
            sum += user.getAge();
        }
        return sum / users.size();
    }
}

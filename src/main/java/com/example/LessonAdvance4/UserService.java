package com.example.LessonAdvance4;
import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<UserAccount> userAccounts = new ArrayList<UserAccount>();
    private static UserService userService;

    private UserService() {
    }

    public static UserService getUserService() {
        if(userService == null) {
            userService = new UserService();
        }
        return userService;
    }

    public List<UserAccount> getUserAccounts() {
        return userAccounts;
    }

    public void saveUser(UserAccount user) {
        userAccounts.add(user);
    }

    public UserAccount getUser(String email) {
        return userAccounts.stream().filter(user -> user.getEmail().equals(email)).findAny().orElse(null);
    }
}

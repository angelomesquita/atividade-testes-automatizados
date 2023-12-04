package service;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<String> users = new ArrayList<>();

    public boolean addUser(String username) {
        if (username != null && !username.trim().isEmpty() && !users.contains(username)) {
            users.add(username);
            return true;
        }
        return false;
    }

    public boolean removeUser(String username) {
        return users.remove(username);
    }

    public int getUsersCount() {
        return users.size();
    }

    public List<String> getAllUsers() {
        return new ArrayList<>(users);
    }

    public boolean userExists(String username) {
        return users.contains(username);
    }

    public void clearUsers() {
        users.clear();
    }

    public boolean updateUsername(String oldUsername, String newUsername) {
        if (users.contains(oldUsername) && !users.contains(newUsername) && !newUsername.trim().isEmpty()) {
            int index = users.indexOf(oldUsername);
            users.set(index, newUsername);
            return true;
        }
        return false;
    }


    public List<String> getUsersByPrefix(String prefix) {
        List<String> matchedUsers = new ArrayList<>();
        for (String user : users) {
            if (user.startsWith(prefix)) {
                matchedUsers.add(user);
            }
        }
        return matchedUsers;
    }
}


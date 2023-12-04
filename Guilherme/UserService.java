package atos.acelera;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    private Map<String, String> userCredentials;

    public UserService() {
        this.userCredentials = new HashMap<>();
    }

    public String extractUsernameFromEmail(String email) {
        int atIndex = email.indexOf('@');
        if (atIndex != -1) {
            return email.substring(0, atIndex);
        } else {
            throw new IllegalArgumentException("Invalid email format");
        }
    }

    public void signUp(String username, String password) {
        if (userCredentials.containsKey(username)) {
            throw new IllegalArgumentException("Username already exists");
        }
        userCredentials.put(username, password);
    }

    public boolean login(String username, String password) {
        return userCredentials.containsKey(username) && userCredentials.get(username).equals(password);
    }
}

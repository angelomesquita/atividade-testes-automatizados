package atos.acelera;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {
    private UserService userService;

    @BeforeEach
    public void setUp() {
        userService = new UserService();
    }

    @Test
    public void testSignUp() {
        userService.signUp("john_doe", "password123");
        assertTrue(userService.login("john_doe", "password123"));
    }

    @Test
    public void testSignUpDuplicateUsername() {
        userService.signUp("alice", "password456");
        assertThrows(IllegalArgumentException.class, () -> userService.signUp("alice", "anotherPassword"));
    }

    @Test
    public void testExtractUsernameFromEmail() {
        String email = "guilhermxlopes@gmail.com";
        String expectedUsername = "guilhermxlopes";
        String actualUsername = userService.extractUsernameFromEmail(email);
        assertEquals(expectedUsername, actualUsername);
    }

    @Test
    public void testLogin() {
        userService.signUp("user1", "pass123");
        assertTrue(userService.login("user1", "pass123"));
        assertFalse(userService.login("user1", "wrongPassword"));
        assertFalse(userService.login("nonexistent_user", "password123"));
    }
}


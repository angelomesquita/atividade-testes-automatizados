package service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserServiceTest {

	private UserService userService;

	@BeforeEach
	public void setUp() {
		userService = new UserService();
		userService.addUser("user1");
		userService.addUser("user2");
		userService.addUser("user3");
	}

	@Test
	void testUserExists() {
		assertTrue(userService.userExists("user1"));
		assertFalse(userService.userExists("nonExistingUser"));
	}

	@Test
	void testClearUsers() {
		userService.clearUsers();
		assertEquals(0, userService.getUsersCount());
	}

	@Test
	void testUpdateUsername() {
		assertTrue(userService.updateUsername("user1", "newUser1"));
		assertFalse(userService.updateUsername("user2", "newUser1"));
	}

	@Test
	void testGetUsersByPrefix() {
		List<String> usersWithPrefix = userService.getUsersByPrefix("user");
		assertEquals(3, usersWithPrefix.size());
	}

	@Test
	void testAddUserWithEmptyUsername() {
		assertFalse(userService.addUser(""));
		assertFalse(userService.addUser("   "));
	}

	@Test
	void testAddUserWithNullUsername() {
		assertFalse(userService.addUser(null));
	}

	@Test
	void testRemoveNonExistingUser() {
		assertFalse(userService.removeUser("nonExistingUser"));
	}

	@Test
	void testUpdateUsernameWithExistingNewUsername() {
		userService.addUser("newUser");
		assertFalse(userService.updateUsername("user1", "newUser"));
	}

	@Test
	void testGetUsersByPrefixWithNoMatchingUsers() {
		List<String> usersWithPrefix = userService.getUsersByPrefix("nonExistingPrefix");
		assertEquals(0, usersWithPrefix.size());
	}
	
	@Test
	void testAddDuplicateUser() {
	    assertFalse(userService.addUser("user1")); 
	    assertEquals(3, userService.getUsersCount());
	}
	
	@Test
	void testGetAllUsersMatchesInternalList() {
	    List<String> allUsers = userService.getAllUsers();
	    assertEquals(userService.getUsersCount(), allUsers.size());
	    assertTrue(allUsers.containsAll(userService.getAllUsers()));
	}
	
	@Test
	void testRemoveNonExistingUserFromEmptyList() {
	    userService.clearUsers(); 
	    assertFalse(userService.removeUser("nonExistingUser"));
	}

	@Test
	void testUpdateNonExistingUser() {
	    assertFalse(userService.updateUsername("nonExistingUser", "newUsername"));
	}

	@Test
	void testUpdateUserWithEmptyNewUsername() {
	    assertFalse(userService.updateUsername("user1", ""));
	}


}

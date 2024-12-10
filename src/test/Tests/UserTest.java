import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.example.user;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    private user testUser;

    /**
     * Set up a test user before each test.
     * This ensures each test starts with a fresh user instance.
     */
    @BeforeEach
    public void setUp() {
        testUser = new user("testUser", "test@email.com", "password123", "123 Test St");
    }

    /**
     * Test that a user is properly constructed with the given values.
     * This verifies that all fields are correctly initialized.
     */
    @Test
    public void testUserConstruction() {
        assertEquals("testUser", testUser.getUsername());
        assertEquals("test@email.com", testUser.getEmail());
        assertEquals("123 Test St", testUser.getAddress());
    }

    /**
     * Test the login functionality.
     * This verifies that the login method works as expected.
     */
    @Test
    public void testLogin() {
        // Test valid login
        assertTrue(testUser.login("password123"));

        // Test invalid login
        assertFalse(testUser.login("wrongPassword"));
    }

    /**
     * Test user ID setter and getter.
     * This verifies that the user ID can be properly set and retrieved.
     */
    @Test
    public void testUserIdSetterGetter() {
        testUser.setUserId(1);
        assertEquals(1, testUser.getUserId());
    }

    /**
     * Test changing the user's password.
     * This verifies that the password can be updated successfully.
     */
    @Test
    public void testChangePassword() {
        // Try changing the password with the wrong current password
        assertFalse(testUser.changePassword("wrongPassword", "newPassword123"));

        // Change password with the correct current password
        assertTrue(testUser.changePassword("password123", "newPassword123"));

        // Verify the password has been changed
        assertTrue(testUser.login("newPassword123"));
        assertFalse(testUser.login("password123"));
    }
}

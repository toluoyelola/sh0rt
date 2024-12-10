package org.example;

/**
 * The type User.
 */
public class user {

    private String username;
    private String email;
    private String password;
    private String address;
    private int userId;

    /**
     * Constructs a new User with the specified details.
     *
     * @param username the user's username for system identification
     * @param email    the user's email address for communication
     * @param password the user's password for authentication
     * @param address  the user's physical address for shipping
     */
    public user(String username, String email, String password, String address) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.address = address;
        this.userId = generateUserId();  // Automatically generate userId
    }

    /**
     * Retrieves the username of the user.
     *
     * @return the current username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Updates the username of the user.
     *
     * @param username the new username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Retrieves the email address of the user.
     *
     * @return the current email address
     */
    public String getEmail() {
        return email;
    }

    /**
     * Updates the email address of the user.
     *
     * @param email the new email address to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Retrieves the physical address of the user.
     *
     * @return the current physical address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Updates the physical address of the user.
     *
     * @param address the new physical address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Retrieves the unique identifier of the user.
     *
     * @return the user's ID
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Updates the unique identifier of the user.
     *
     * @param userId the new user ID to set
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * Attempts to authenticate the user in the system by comparing passwords.
     *
     * @param password the password to check
     * @return true if login is successful, false otherwise
     */
    public boolean login(String password) {
        return this.password.equals(password);  // Checks if the provided password matches
    }

    /**
     * Changes the user's password after validating the current password.
     *
     * @param currentPassword the current password to check
     * @param newPassword     the new password to set
     * @return true if the password was changed successfully, false otherwise
     */
    public boolean changePassword(String currentPassword, String newPassword) {
        if (this.password.equals(currentPassword)) {
            this.password = newPassword;
            return true;
        }
        return false;
    }

    /**
     * Generates a unique user ID (for simplicity, it's just a random number).
     *
     * @return a new user ID
     */
    private int generateUserId() {
        return (int) (Math.random() * 10000); // Generate a random ID between 0 and 9999
    }
}

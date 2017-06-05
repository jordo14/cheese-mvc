package org.launchcode.models;

/**
 * Created by jordanwills on 6/5/17.
 */
public class User {

    private String username;
    private String password;
    private String email;

//    private int userId;
//    private static int nextUserId = 1;

    public User(String username, String password, String email) {
        this();
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public User() {
//        userId = nextUserId;
//        nextUserId++;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

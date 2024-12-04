package org.example;

public class user {

    private String user_name;
    private String email;
    private String password;
    private String address;
    private int user_id;

    private user(String user_name, String emial, String password, String address, int user_id){
        this.user_name = user_name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.user_id = user_id;
    }

    public boolean login(String user_name, String password){
        return true;
    }

    public boolean changePassword(String currentPassword, String newPassword){
    return true;
    }



}


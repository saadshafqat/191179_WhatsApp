package com.example.a191179_whatsapp;

public class CallModelList {
    private String userName;
    private String ProfilePhoto;

    public CallModelList(String userName, String profilePhoto) {
        this.userName = userName;
        ProfilePhoto = profilePhoto;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProfilePhoto() {
        return ProfilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        ProfilePhoto = profilePhoto;
    }
}
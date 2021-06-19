package com.example.a191179_whatsapp;

public class StatusModelList {
    private String userName;
    private String urlProfile;

    public StatusModelList(String userName, String urlProfile) {
        this.userName = userName;
        this.urlProfile = urlProfile;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUrlProfile() {
        return urlProfile;
    }

    public void setUrlProfile(String urlProfile) {
        this.urlProfile = urlProfile;
    }
}

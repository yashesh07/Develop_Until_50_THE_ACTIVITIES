package com.example.datex;

public class Profile {
    private String profileName;
    private String profileAge;
    private String profileGender;
    private String profileBio;

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    private int imgId;

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileAge() {
        return profileAge;
    }

    public void setProfileDuration(String profileDuration) {
        this.profileAge = profileDuration;
    }

    public String getProfileGender() {
        return profileGender;
    }

    public void setProfileGender(String profileGender) {
        this.profileGender = profileGender;
    }

    public String getProfileBio() {
        return profileBio;
    }

    public void setProfileBio(String profileBio) {
        this.profileBio = profileBio;
    }

    public Profile(String profileName, String profileAge, String profileGender, String profileBio, int imgId) {
        this.profileName = profileName;
        this.profileAge = profileAge;
        this.profileGender = profileGender;
        this.profileBio = profileBio;
        this.imgId = imgId;
    }
}

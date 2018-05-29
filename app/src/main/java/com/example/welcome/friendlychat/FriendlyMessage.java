package com.example.welcome.friendlychat;

/**
 * Created by WELCOME on 1/29/2018.
 */

public class FriendlyMessage {
    private String text;
    private String name;
    private String photoUrl;

    public FriendlyMessage(){
    }
    public FriendlyMessage(String text, String name, String photoUrl){
        this.text = text;
        this.name = name;
        this.photoUrl = photoUrl;
    }
    public String getText(){ return text;}
    public void setText(){this.text = text;}

    public String getName(){ return name;}
    public void setName(){this.name = name;}

    public String getPhotoUrl(){ return photoUrl;}
    public void setPhotoUrl(){this.photoUrl = photoUrl;}
}

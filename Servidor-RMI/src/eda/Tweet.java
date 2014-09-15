/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eda;

/**
 *
 * @author daniel
 */
public final class Tweet implements java.io.Serializable {
    private int id;
    private String nickname;
    private String text;

    public Tweet(int id, String nickname, String text) {
        this.id = id;
        this.nickname = nickname;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    
    
}

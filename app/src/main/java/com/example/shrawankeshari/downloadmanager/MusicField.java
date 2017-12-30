package com.example.shrawankeshari.downloadmanager;

/**
 * Created by shrawankeshari on 23/12/17.
 */

public class MusicField {

    private String song_title;
    private byte[] song_image;
    private String song_path;
    private String song_artist;
    private String song_duration;
    private int whenNoImage;

    public void setSong_title(String song_title) {
        this.song_title = song_title;
    }

    public String getSong_title() {
        return song_title;
    }

    public void setSong_image(byte[] song_image) {
        this.song_image = song_image;
    }

    public byte[] getSong_image() {
        return song_image;
    }

    public void setSong_path(String song_path) {
        this.song_path = song_path;
    }

    public String getSong_path() {
        return song_path;
    }

    public void setSong_artist(String song_artist) {
        this.song_artist = song_artist;
    }

    public String getSong_artist() {
        return song_artist;
    }

    public void setSong_duration(String song_duration) {
        this.song_duration = song_duration;
    }

    public String getSong_duration() {
        return song_duration;
    }

    public void setWhenNoImage(int whenNoImage) {
        this.whenNoImage = whenNoImage;
    }

    public int getWhenNoImage(){
        return whenNoImage;
    }
}

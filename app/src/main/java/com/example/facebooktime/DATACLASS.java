package com.example.facebooktime;



public class DATACLASS {
    private int img ;
    private String name, time, post;

    public DATACLASS(int img,   String name, String time, String post) {
        this.img = img;

        this.name = name;
        this.time = time;
        this.post = post;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
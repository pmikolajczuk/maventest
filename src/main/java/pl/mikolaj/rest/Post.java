package pl.mikolaj.rest;

public class Post {
    private int id;
    private String userName;
    private String content;

    public Post(String userName, String content) {
        this.userName = userName;
        this.content = content;
    }
}

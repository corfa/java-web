package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Post{
    private String text;
    private Integer likes;


    public Post(String text_post,Integer likes_post) {
        text=text_post;
        likes=likes_post;
    }
}

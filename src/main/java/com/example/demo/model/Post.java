package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Post{
    private String text;

    private Date creationDate;
    private Integer likes = 101;


    public Post(String text_post, Date CreateDate) {
        text=text_post;
        creationDate=CreateDate;
    }
}

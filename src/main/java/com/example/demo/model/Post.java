package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Post{
    private String text;

    private Date creationDate;
    private Integer likes = 0;
    private Long id;


    public Post(Long id_,String text_post, Date CreateDate) {
        id=id_;
        text=text_post;
        creationDate=CreateDate;
    }
}

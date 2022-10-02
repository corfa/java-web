package com.example.demo.service;

import com.example.demo.model.Post;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Setter
public class PostService {
    private List<Post> posts = new ArrayList<>();

    public void create(String text) {
        posts.add(new Post((long) posts.size(),text, new Date()));
    }
    public List<Post> listAllPosts(){

        return posts;
    }
}

package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts(){
        List<Post> list_post = new ArrayList<>();
        list_post.add(new Post("Челябинск",555));
        list_post.add(new Post("Москва",67));
        list_post.add(new Post("Алания",1231));
        return list_post;
    }
}

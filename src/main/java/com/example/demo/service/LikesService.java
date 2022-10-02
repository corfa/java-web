package com.example.demo.service;

import com.example.demo.model.Post;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Setter
public class LikesService {
    @Autowired
    PostService postService;
    public int like(Long postId){
        Post post = postService.listAllPosts().get(postId.intValue());
        post.setLikes(post.getLikes() + 1);
        return post.getLikes();
    }
}

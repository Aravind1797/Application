package com.example.demo.service;

import com.example.demo.modal.Post;
import com.example.demo.modal.UpdatePosts;

import java.util.List;

public interface PostService {

    List<Post> getPosts();
    Post createPost(Post post);
    Post getPostDetails(Long postId);
    Post updatePost(Long postId, UpdatePosts updatePost);
    String deletePost(Long postId);

}

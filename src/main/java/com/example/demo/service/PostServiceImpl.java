package com.example.demo.service;

import com.example.demo.modal.Post;
import com.example.demo.modal.UpdatePosts;
import com.example.demo.repo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    PostRepo postRepo;

    @Override
    public List<Post> getPosts() {
        return postRepo.findAll();
    }

    @Override
    public Post createPost(Post post) {
        return postRepo.save(post);
    }

    @Override
    public Post getPostDetails(Long postId) {
        return postRepo.findBypostId(postId);
    }

    @Override
    public Post updatePost(Long postId, UpdatePosts updatePosts) {
        Post post=postRepo.findBypostId(postId);
        post.setPost(updatePosts.getPost());
        post.setUpdatedAt(new Date());
        return post;
    }

    @Override
    public String deletePost(Long postId) {
         postRepo.deleteById(postId);
        return "Post has been deleted";
    }
}

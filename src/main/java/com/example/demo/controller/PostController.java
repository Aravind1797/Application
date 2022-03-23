package com.example.demo.controller;

import com.example.demo.modal.Post;
import com.example.demo.modal.UpdatePosts;
import com.example.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping("/post")
    public ResponseEntity<List<Post>> getPosts(){
        return new ResponseEntity<List<Post>>(postService.getPosts(), HttpStatus.OK);
    }

    @GetMapping("/post/{id}")
    public ResponseEntity<Post> getPostDetails(@PathVariable("id") Long postId){
        return new ResponseEntity<Post>(postService.getPostDetails(postId), HttpStatus.OK);
    }

    @PostMapping("/posts")
    public ResponseEntity<Post> createPost(@RequestBody Post post){
        return new ResponseEntity<Post>(postService.createPost(post),HttpStatus.CREATED);
    }

    @PutMapping("/post/{id}")
    public ResponseEntity<Post> updatePost(@PathVariable ("id") Long postId, UpdatePosts updatePosts){
        return new ResponseEntity<Post>(postService.updatePost(postId,updatePosts),HttpStatus.OK);
    }

    @DeleteMapping("/post/{id}")
    public ResponseEntity<String> deletePost(@PathVariable ("id") Long postId){
        return new ResponseEntity<String>(postService.deletePost(postId),HttpStatus.OK);
    }

}
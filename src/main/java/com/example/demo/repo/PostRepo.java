package com.example.demo.repo;

import com.example.demo.modal.Post;
import org.springframework.data.mongodb.core.MongoAction;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepo extends MongoRepository<Post,Long> {
    Post findBypostId(Long postId);
}


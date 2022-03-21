package com.example.demo.modal;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "post")
public class Post {
    @Id
    private Long postId;
    public String post;
    private String postedBY;
    private Date CreatedAt;
    private Date UpdatedAt;
}

package com.company.blog.controllers;

import com.company.blog.config.AppConfig;
import com.company.blog.models.Post;
import com.company.blog.services.PostService;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostController {


    @Autowired
    AppConfig appConfig;

    PostService postService;

    @GetMapping("/{postId}")
    public Post getBlog(@PathVariable String postId) {
        MongoCollection<Document> documentMongoCollection = appConfig.mongoTemplate(appConfig.mongoClient()).getCollection("posts");



        return new Post();
    }


}

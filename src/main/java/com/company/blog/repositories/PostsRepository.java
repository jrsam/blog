package com.company.blog.repositories;

import com.company.blog.models.Post;
import org.springframework.data.repository.Repository;

interface PostsRepository extends Repository<Post, String> {

}

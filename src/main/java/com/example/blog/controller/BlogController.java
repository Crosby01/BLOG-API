package com.example.blog.controller;

import com.example.blog.model.BlogPost;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class BlogController {

    private List<BlogPost> posts = new ArrayList<>();

    // Create a new post
    @PostMapping
    public BlogPost createPost(@RequestBody BlogPost post) {

        post.setId((long) (posts.size() + 1));

        posts.add(post);

        return post;
    }

    // Get all posts
    @GetMapping
    public List<BlogPost> getAllPosts() {
        return posts;
    }

    // Search posts by keyword
    @GetMapping("/search")
    public List<BlogPost> searchPosts(@RequestParam String keyword) {

        List<BlogPost> results = new ArrayList<>();

        for (BlogPost post : posts) {

            if (post.getTitle().toLowerCase().contains(keyword.toLowerCase())
                    || post.getContent().toLowerCase().contains(keyword.toLowerCase())) {

                results.add(post);
            }
        }

        return results;
    }

    // Get a single post by ID
    @GetMapping("/{id}")
    public BlogPost getPostById(@PathVariable Long id) {

        for (BlogPost post : posts) {

            if (post.getId().equals(id)) {
                return post;
            }
        }

        return null;
    }

    // Update a post
    @PutMapping("/{id}")
    public BlogPost updatePost(@PathVariable Long id,
            @RequestBody BlogPost updatedPost) {

        for (BlogPost post : posts) {

            if (post.getId().equals(id)) {

                post.setTitle(updatedPost.getTitle());
                post.setContent(updatedPost.getContent());

                return post;
            }
        }

        return null;
    }

    // Delete a post
    @DeleteMapping("/{id}")
    public String deletePost(@PathVariable Long id) {

        for (BlogPost post : posts) {

            if (post.getId().equals(id)) {

                posts.remove(post);

                return "Post deleted successfully";
            }
        }

        return "Post not found";
    }


    
}
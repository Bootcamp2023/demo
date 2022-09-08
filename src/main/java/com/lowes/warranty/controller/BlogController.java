package com.lowes.warranty.controller;

import java.util.Optional;

import com.lowes.warranty.service.BlogService;
import com.lowes.warranty.models.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BlogController {

	@Autowired
	private BlogService blogService;

	@GetMapping("/blogs/{id}")
	public Optional<Blog> getBlog(@PathVariable String id) {
		return blogService.getBlogService(id);
	}
	
	@PostMapping("/blogs")
	public Blog postBlog(@RequestBody Blog blog) {
		return blogService.postBlogService(blog);
	}
}

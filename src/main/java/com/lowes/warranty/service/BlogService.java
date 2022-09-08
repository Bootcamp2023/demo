package com.lowes.warranty.service;

import java.util.Optional;

import com.lowes.warranty.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lowes.warranty.models.Blog;

@Service
public class BlogService {

	@Autowired
	private BlogRepository blogRepository;

	public Optional<Blog> getBlogService(String id) {
		return blogRepository.findById(id);
	}

	public Blog postBlogService(Blog blog){
		return blogRepository.save(blog);

	}
	
}

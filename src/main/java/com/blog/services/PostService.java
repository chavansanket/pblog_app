package com.blog.services;

import java.util.List;

import com.blog.entities.Category;
import com.blog.payloads.PostDto;
import com.blog.payloads.PostResponse;

public interface PostService {
		
		//create 
		PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);

		//update 
		PostDto updatePost(PostDto postDto, Integer postId);

		// delete
		void deletePost(Integer postId);
		
		//getAll
		PostResponse getAllPosts(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);
		
		//get
		PostDto getPost(Integer postId);
		
		//getPostOf cate
		List<PostDto> getPostsByCategory(Integer catId);
		
		//getPostOf user
		List<PostDto> getPostsByUser(Integer userId);
		
		//search posts
		List<PostDto> searchPosts(String keyword);
}









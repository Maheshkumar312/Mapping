package com.prodian.OneToManyMapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prodian.OneToManyMapping.Entity.Comment;
import com.prodian.OneToManyMapping.Entity.Post;
import com.prodian.OneToManyMapping.Repository.PostRepository;

@SpringBootApplication
public class OneToManyMappingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OneToManyMappingApplication.class, args);
	}

	@Autowired
	private PostRepository postRepository;

	@Override
	public void run(String... args) throws Exception {
		Post post = new Post("one to many mapping using JPA and hibernate","one to many mapping using JPA and hibernate");

		Comment comment1 = new Comment("Very useful");
		Comment comment2 = new Comment("informative");
		Comment comment3 = new Comment("Great post");

		post.getComments().add(comment1);
		post.getComments().add(comment2);
		post.getComments().add(comment3);

		this.postRepository.save(post);

	}
}

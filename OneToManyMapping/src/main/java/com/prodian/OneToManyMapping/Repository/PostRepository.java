package com.prodian.OneToManyMapping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prodian.OneToManyMapping.Entity.Post;

public interface PostRepository  extends JpaRepository<Post, Long>{

}

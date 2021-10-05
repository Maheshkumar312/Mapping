package com.prodian.OneToManyMapping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prodian.OneToManyMapping.Entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>{

}

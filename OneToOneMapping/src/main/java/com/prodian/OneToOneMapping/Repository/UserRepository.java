package com.prodian.OneToOneMapping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prodian.OneToOneMapping.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

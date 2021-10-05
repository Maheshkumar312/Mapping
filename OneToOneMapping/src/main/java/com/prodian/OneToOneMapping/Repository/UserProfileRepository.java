package com.prodian.OneToOneMapping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prodian.OneToOneMapping.Entity.UserProfile;

public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {

}

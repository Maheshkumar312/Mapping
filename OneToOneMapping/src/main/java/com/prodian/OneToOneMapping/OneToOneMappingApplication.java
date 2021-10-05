package com.prodian.OneToOneMapping;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prodian.OneToOneMapping.Entity.Gender;
import com.prodian.OneToOneMapping.Entity.User;
import com.prodian.OneToOneMapping.Entity.UserProfile;
import com.prodian.OneToOneMapping.Repository.UserRepository;

@SpringBootApplication
public class OneToOneMappingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OneToOneMappingApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		// user object
		User user = new User();
		user.setName("Ramesh");
		user.setEmail("ramesh@gmail.com");

		UserProfile userProfile = new UserProfile();
		userProfile.setAddress("Pune");
		userProfile.setBirthOfDate(LocalDate.of(1991, 03, 24));
		userProfile.setGender(Gender.MALE);
		userProfile.setPhoneNumber("1234567899");

		user.setUserProfile(userProfile);
		userProfile.setUser(user);

		userRepository.save(user);
	}

}

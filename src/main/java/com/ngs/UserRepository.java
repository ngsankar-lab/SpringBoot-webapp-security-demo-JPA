package com.ngs;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ngs.models.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	Optional<User> findByUserName(String userName);
}
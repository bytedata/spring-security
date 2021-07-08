package com.bytedata;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bytedata.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	Optional<User> findByUserName(String userName);
}

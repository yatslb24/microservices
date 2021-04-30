package com.yats.microserv.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yats.microserv.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	public User findUserById(Long userId);

}

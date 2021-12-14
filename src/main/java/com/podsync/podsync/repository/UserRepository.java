package com.podsync.podsync.repository;

import com.podsync.podsync.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}

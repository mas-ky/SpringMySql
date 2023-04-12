package com.springmysql.springmysql.repository;

import org.springframework.data.repository.CrudRepository;

import com.springmysql.springmysql.model.user;

public interface  userRepository extends CrudRepository<user, Integer> {
    
}

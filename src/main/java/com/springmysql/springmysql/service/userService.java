package com.springmysql.springmysql.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springmysql.springmysql.model.user;
import com.springmysql.springmysql.repository.userRepository;

@Service
@Transactional
public class userService {
    @Autowired()
    private userRepository userRepo;
    public void saveuser(user us){
        userRepo.save(us);
    }
}

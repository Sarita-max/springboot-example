package com.myspringboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.myspringboot.entities.User;

public interface UserRepo extends CrudRepository<User,Integer>{

}

package com.example.form_validation.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.form_validation.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}

package com.project.practice.repository;

import com.project.practice.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepositories extends CrudRepository<User,Integer>
{
    public Optional<User> findUserByEmail(String email);
}
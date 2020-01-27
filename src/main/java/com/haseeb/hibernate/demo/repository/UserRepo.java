package com.haseeb.hibernate.demo.repository;

import com.haseeb.hibernate.demo.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<User,Integer> {
}

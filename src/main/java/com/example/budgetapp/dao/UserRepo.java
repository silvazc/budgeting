package com.example.budgetapp.dao;

import com.example.budgetapp.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Integer> {

}

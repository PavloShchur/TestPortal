package com.pavlo.testPortal.dao;

import com.pavlo.testPortal.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserDAO extends JpaRepository<User, Integer> {



}

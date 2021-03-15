package com.projet.okofen_control.dao;

import com.projet.okofen_control.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Oko_userDAO extends JpaRepository<User,Integer> {
    User findById(int id);
}

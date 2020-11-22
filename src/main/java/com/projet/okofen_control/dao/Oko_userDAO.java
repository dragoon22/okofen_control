package com.projet.okofen_control.dao;

import com.projet.okofen_control.model.Oko_user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Oko_userDAO extends JpaRepository<Oko_user,Integer> {
    Oko_user findById(int id);
}

package com.projet.okofen_control.dao;

import com.projet.okofen_control.model.Oko_chaudiere;
import com.projet.okofen_control.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Oko_chaudiereDAO extends JpaRepository<Oko_chaudiere,Integer> {
    Iterable<Oko_chaudiere> findByUsersIn(List<User> users);
}

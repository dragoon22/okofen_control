package com.projet.okofen_control.dao;

import com.projet.okofen_control.model.Oko_chaudiere;
import com.projet.okofen_control.model.Oko_circuitChauffage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Oko_circuitChauffageDAO extends JpaRepository<Oko_circuitChauffage,Integer> {
}

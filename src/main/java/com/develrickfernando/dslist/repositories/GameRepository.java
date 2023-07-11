package com.develrickfernando.dslist.repositories;

import com.develrickfernando.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {



}

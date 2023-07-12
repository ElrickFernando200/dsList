package com.develrickfernando.dslist.repositories;

import com.develrickfernando.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GameListRepository extends JpaRepository<GameList,Long> {

}

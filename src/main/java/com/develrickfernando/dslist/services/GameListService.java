package com.develrickfernando.dslist.services;

import com.develrickfernando.dslist.dto.GameListDTO;
import com.develrickfernando.dslist.entities.GameList;
import com.develrickfernando.dslist.projections.GameMinProjection;
import com.develrickfernando.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    public GameListService(){}


    public GameListDTO getById(Long id){
        GameList gameList = gameListRepository.findById(id).get();
        return new GameListDTO(gameList);
    }

    public List<GameListDTO> findAll(){
        return gameListRepository.findAll().stream().map(g -> new GameListDTO(g)).toList();
    }
}

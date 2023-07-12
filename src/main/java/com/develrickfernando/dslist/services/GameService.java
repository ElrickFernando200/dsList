package com.develrickfernando.dslist.services;

import com.develrickfernando.dslist.dto.GameDTO;
import com.develrickfernando.dslist.dto.GameMinDTO;
import com.develrickfernando.dslist.entities.Game;
import com.develrickfernando.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;


    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game game = gameRepository.findById(id).get();
        return new GameDTO(game);
    }


    public List<GameMinDTO> findByList(Long id){
        return gameRepository.searchByList(id).stream().map(g -> new GameMinDTO(g)).toList();
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        return gameRepository.findAll().stream().map(g -> new GameMinDTO(g)).toList();
    }





}

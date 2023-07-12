package com.develrickfernando.dslist.services;

import com.develrickfernando.dslist.dto.GameDTO;
import com.develrickfernando.dslist.dto.GameMinDTO;
import com.develrickfernando.dslist.entities.Game;
import com.develrickfernando.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;


    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game game = gameRepository.findById(id).get();
        return new GameDTO(game);
    }


    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        return gameRepository.findAll().stream().map(g -> new GameMinDTO(g)).toList();
    }





}

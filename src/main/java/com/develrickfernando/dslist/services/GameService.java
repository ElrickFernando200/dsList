package com.develrickfernando.dslist.services;

import com.develrickfernando.dslist.dto.GameMinDto;
import com.develrickfernando.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDto> findAll(){
        return gameRepository.findAll().stream().map(g -> new GameMinDto(g)).toList();
    }





}

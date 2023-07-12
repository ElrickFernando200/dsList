package com.develrickfernando.dslist.controllers;

import com.develrickfernando.dslist.dto.GameListDTO;
import com.develrickfernando.dslist.dto.GameMinDTO;
import com.develrickfernando.dslist.services.GameListService;
import com.develrickfernando.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;
    @Autowired
    private GameService gameService;
    public GameListController(){}

    @GetMapping(value = "/{id}")
    public GameListDTO getByid(@PathVariable  Long id){
        return gameListService.getById(id);
    }

    @GetMapping(value = "/{id}/games")
    public List<GameMinDTO> getGamesList(@PathVariable  Long id){
        return gameService.findByList(id);
    }

    @GetMapping
    public List<GameListDTO> findAll(){
        return gameListService.findAll();
    }
}

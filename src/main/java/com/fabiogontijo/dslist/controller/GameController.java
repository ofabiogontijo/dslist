package com.fabiogontijo.dslist.controller;

import com.fabiogontijo.dslist.dto.GameDTO;
import com.fabiogontijo.dslist.dto.GameMinDTO;
import com.fabiogontijo.dslist.entities.Game;
import com.fabiogontijo.dslist.repositories.GameRepository;
import com.fabiogontijo.dslist.services.GameService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/games", produces = MediaType.APPLICATION_JSON_VALUE)
public class GameController {

    @Autowired
    private GameService gameService;

    @Autowired
    private GameRepository gameRepository;

    @GetMapping
    public List<GameMinDTO> findAll() {
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id) {
        GameDTO result = gameService.findById(id);
        return result;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Game create(@RequestBody Game game){
        return gameRepository.save(game);
    }

}
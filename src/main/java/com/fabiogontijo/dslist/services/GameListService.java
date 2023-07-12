package com.fabiogontijo.dslist.services;

import com.fabiogontijo.dslist.dto.GameListDTO;
import com.fabiogontijo.dslist.entities.GameList;
import com.fabiogontijo.dslist.repositories.GameListRepository;
import com.fabiogontijo.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDTO::new).toList();
    }

}

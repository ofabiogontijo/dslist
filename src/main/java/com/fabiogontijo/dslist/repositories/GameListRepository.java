package com.fabiogontijo.dslist.repositories;

import com.fabiogontijo.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository <GameList, Long> {

}

package com.fabiogontijo.dslist.repositories;

import com.fabiogontijo.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository <Game, Long> {

}

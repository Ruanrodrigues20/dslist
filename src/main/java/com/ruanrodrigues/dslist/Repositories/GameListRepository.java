package com.ruanrodrigues.dslist.Repositories;

import com.ruanrodrigues.dslist.Entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}

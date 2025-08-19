package com.ruanrodrigues.dslist.Repositories;


import com.ruanrodrigues.dslist.Entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
}

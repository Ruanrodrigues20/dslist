package com.ruanrodrigues.dslist.Services;

import com.ruanrodrigues.dslist.DTO.GameDto;
import com.ruanrodrigues.dslist.DTO.GameMinDto;
import com.ruanrodrigues.dslist.Entities.Game;
import com.ruanrodrigues.dslist.Repositories.GameRepository;
import com.ruanrodrigues.dslist.projections.GameMinProjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameService {

    @Autowired
    public GameRepository gameRepository;

    public List<Game> findAll() {
       List<Game> games = this.gameRepository.findAll();
       return games;
    };

    @Transactional(readOnly = true)
    public GameDto findById(long id) {
        Game game = this.gameRepository.findById((long) id).get();
        return new GameDto(game);
    }

    @Transactional(readOnly = true)
    public List<GameMinDto> findByGameList(Long listId) {
        List<GameMinProjection> games = gameRepository.searchByList(listId);
        return games.stream().map(GameMinDto::new).toList();
    }
}

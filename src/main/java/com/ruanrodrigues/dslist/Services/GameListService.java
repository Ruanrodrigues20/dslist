package com.ruanrodrigues.dslist.Services;

import com.ruanrodrigues.dslist.DTO.GameListDto;
import com.ruanrodrigues.dslist.Entities.GameList;
import com.ruanrodrigues.dslist.Repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public GameListDto findById(long id) {
        GameList entity = gameListRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("GameList not found with id: " + id));
        return new GameListDto(entity);
    }

    @Transactional(readOnly = true)
    public List<GameListDto> findAll() {
        return this.gameListRepository.findAll()
                .stream()
                .map(GameListDto::new).toList();
    }
}

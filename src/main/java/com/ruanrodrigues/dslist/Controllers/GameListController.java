package com.ruanrodrigues.dslist.Controllers;

import com.ruanrodrigues.dslist.DTO.GameListDto;
import com.ruanrodrigues.dslist.DTO.GameMinDto;
import com.ruanrodrigues.dslist.Repositories.GameListRepository;
import com.ruanrodrigues.dslist.Services.GameListService;
import com.ruanrodrigues.dslist.Services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDto> findAll() {
        return this.gameListService.findAll();
    }

    @GetMapping(value = "/{id}")
    public GameListDto findById(@PathVariable Long id) {
        return  this.gameListService.findById(id);
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDto> findGames(@PathVariable Long listId) {
        List<GameMinDto> result = this.gameService.findByGameList(listId);
        return result;
    }
}

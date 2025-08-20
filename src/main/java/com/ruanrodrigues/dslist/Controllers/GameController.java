package com.ruanrodrigues.dslist.Controllers;

import com.ruanrodrigues.dslist.DTO.GameDto;
import com.ruanrodrigues.dslist.DTO.GameMinDto;
import com.ruanrodrigues.dslist.Entities.Game;
import com.ruanrodrigues.dslist.Services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/games")
public class GameController {
    @Autowired
    private GameService gameService;

    public GameController() {}

    @GetMapping()
    public List<GameMinDto> findAllGames() {
        return this.gameService.findAll().stream().map(GameMinDto::new).toList();
    }

    @GetMapping(value = "/{id}")
    public GameDto findById(@PathVariable Long id) {
        return gameService.findById(id);
    }
}

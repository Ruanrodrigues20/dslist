package com.ruanrodrigues.dslist.Services;

import com.ruanrodrigues.dslist.Entities.Game;
import com.ruanrodrigues.dslist.Repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
}

package com.ruanrodrigues.dslist.DTO;

import com.ruanrodrigues.dslist.Entities.GameList;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
public class GameListDto {
    private Long id;
    private String name;

    public GameListDto() {}
    public GameListDto(GameList entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }
}

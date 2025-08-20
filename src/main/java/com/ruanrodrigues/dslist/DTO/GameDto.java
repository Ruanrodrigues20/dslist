package com.ruanrodrigues.dslist.DTO;

import com.ruanrodrigues.dslist.Entities.Game;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@ToString
public class GameDto {

    private Long id;
    private String title;

    private Integer year;

    private String genre;

    private String platforms;

    private Double score;

    private String imgUrl;

    private String shortDescription;

    private String longDescription;

    public GameDto(Game entity) {
        BeanUtils.copyProperties(entity, this);
    }

    public GameDto() {}
}

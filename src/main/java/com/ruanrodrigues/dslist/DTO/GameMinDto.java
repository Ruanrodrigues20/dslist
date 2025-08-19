package com.ruanrodrigues.dslist.DTO;


import com.ruanrodrigues.dslist.Entities.Game;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GameMinDto {
    private Long id;
    private String title;
    private String shortDescription;
    private String imgUrl;
    private Integer year;

    public GameMinDto() {}

    public  GameMinDto(Game entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.shortDescription = entity.getShortDescription();
        this.imgUrl = entity.getImgUrl();
        this.year = entity.getYear();
    }
}

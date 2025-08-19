package com.ruanrodrigues.dslist.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.mapping.PrimaryKey;


@Entity(name = "Game")
@Getter
@Setter
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Long id;

    @Column
    private String title;

    @Column
    private String genre;

    @Column
    private String platforms;

    @Column
    private String shortDescription;

    @Column
    private String longDescription;

    @Column
    private String imgUrl;



}

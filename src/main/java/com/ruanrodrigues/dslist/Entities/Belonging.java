package com.ruanrodrigues.dslist.Entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Entity
@Table(name = "tb_belonging")
@Getter
@Setter
public class Belonging {
    @EmbeddedId
    private BelongingPK id = new BelongingPK();

    private Integer position;
    public Belonging() {}

    public Belonging(Game game, GameList list, Integer position) {
        this.position = position;
        this.id.setGame(game);
        this.id.setGameList(list);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Belonging belonging = (Belonging) o;
        return Objects.equals(id, belonging.id) && Objects.equals(position, belonging.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, position);
    }
}

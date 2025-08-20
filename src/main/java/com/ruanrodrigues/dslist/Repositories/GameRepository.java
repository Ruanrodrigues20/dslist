package com.ruanrodrigues.dslist.Repositories;


import com.ruanrodrigues.dslist.Entities.Game;
import com.ruanrodrigues.dslist.projections.GameMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

    @Query(nativeQuery = true, value = """

        SELECT G.id, G.title, G.game_year AS `year`, G.img_url AS imgUrl,
        G.short_description AS shortDescription, B.position
        FROM Game G
        INNER JOIN tb_belonging B ON G.id = B.game_id
        WHERE B.list_id = ?
        ORDER BY B.position;
                            
			""")
    List<GameMinProjection> searchByList(Long listId);
}

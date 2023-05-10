package br.com.henriquesa.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.henriquesa.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}

package br.com.henriquesa.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.henriquesa.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
}

package br.com.henriquesa.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.henriquesa.dslist.dto.GameMinDTO;
import br.com.henriquesa.dslist.entities.Game;
import br.com.henriquesa.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		var dto = result.stream()
				.map(x -> new GameMinDTO(x))
				.toList();
		return dto;
	}
}

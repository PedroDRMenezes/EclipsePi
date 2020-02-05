package br.com.SafePet.Back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.SafePet.Back.dao.IAnimalAdocaoRepo;
import br.com.SafePet.Back.model.AnimalAdocao;

@Component
public class AnimalAdocaoImpl implements IAnimalAdocaoService{

	@Autowired
	public IAnimalAdocaoRepo repo;
	
	@Override
	public void adicionaAnimalAdocao(AnimalAdocao animalAdocao) {
		repo.save(animalAdocao);
	}

	@Override
	public void atualizaAnimalAdocao(AnimalAdocao animalAdocao) {
		repo.save(animalAdocao);		
	}

	@Override
	public List<AnimalAdocao> recuperaTodos() {
		return (List<AnimalAdocao>)repo.findAll();
	}

	@Override
	public AnimalAdocao recuperaPorId(int id) {
		return repo.findById(id).get();
	}
	

}

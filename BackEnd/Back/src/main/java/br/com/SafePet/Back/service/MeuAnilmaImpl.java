package br.com.SafePet.Back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.SafePet.Back.dao.IMeuAnimalRepo;
import br.com.SafePet.Back.model.MeuAnimal;

@Component
public class MeuAnilmaImpl implements IMeuAnimalService {
	
	@Autowired
	private IMeuAnimalRepo repo;

	@Override
	public void adicionaMeuAnimal(MeuAnimal meuAnimal) {
		repo.save(meuAnimal);
	}

	@Override
	public void atualizaMeuAnimal(MeuAnimal meuAnimal) {
		repo.save(meuAnimal);
	}

	@Override
	public List<MeuAnimal> recuperaTodos() {
		return (List<MeuAnimal>)repo.findAll();
	}

	@Override
	public MeuAnimal recuperaPorId(int id) {
		return repo.findById(id).get();
	}

}

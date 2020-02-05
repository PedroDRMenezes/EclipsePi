package br.com.SafePet.Back.service;

import java.util.List;

import br.com.SafePet.Back.model.MeuAnimal;

public interface IMeuAnimalService {
	
	public void adicionaMeuAnimal(MeuAnimal meuAnimal);

	public void atualizaMeuAnimal(MeuAnimal meuAnimal);

	public List<MeuAnimal> recuperaTodos();

	public MeuAnimal recuperaPorId(int id);
}

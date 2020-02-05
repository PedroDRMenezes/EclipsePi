package br.com.SafePet.Back.service;

import java.util.List;

import br.com.SafePet.Back.model.AnimalAdocao;

public interface IAnimalAdocaoService {

	public void adicionaAnimalAdocao(AnimalAdocao animalAdocao);

	public void atualizaAnimalAdocao(AnimalAdocao animalAdocao);

	public List<AnimalAdocao> recuperaTodos();

	public AnimalAdocao recuperaPorId(int id);

}

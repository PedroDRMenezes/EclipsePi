package br.com.SafePet.Back.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.SafePet.Back.model.AnimalAdocao;

public interface IAnimalAdocaoRepo  extends CrudRepository<AnimalAdocao, Integer>{

}

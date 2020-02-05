package br.com.SafePet.Back.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.SafePet.Back.model.MeuAnimal;

public interface IMeuAnimalRepo  extends CrudRepository<MeuAnimal, Integer> {

}

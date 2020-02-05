package br.com.SafePet.Back.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.SafePet.Back.model.Comentarios;

public interface IComentariosRepo extends CrudRepository<Comentarios, Integer> {

}

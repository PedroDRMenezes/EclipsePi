package br.com.SafePet.Back.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.SafePet.Back.model.Post;

public interface IPostRepo extends CrudRepository<Post, Integer> {

}

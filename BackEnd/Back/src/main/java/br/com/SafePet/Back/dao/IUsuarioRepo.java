package br.com.SafePet.Back.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.SafePet.Back.model.Usuario;

public interface IUsuarioRepo  extends CrudRepository<Usuario, Integer> {

	public Usuario findByEmailAndSenha(String email, String senha);

}

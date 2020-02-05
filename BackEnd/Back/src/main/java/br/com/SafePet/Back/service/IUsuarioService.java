package br.com.SafePet.Back.service;

import java.util.List;

import br.com.SafePet.Back.model.Usuario;

public interface IUsuarioService {

	public void adicionaUsuario(Usuario usuario);
	
	public void atualizaUsuario(Usuario usuario);

	public List<Usuario> recuperaTodos();

	public Usuario recuperaPorId(int id);
	
	public Usuario autenticaUsuario(String email, String senha);
	
	
}

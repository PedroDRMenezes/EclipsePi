package br.com.SafePet.Back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.SafePet.Back.dao.IUsuarioRepo;
import br.com.SafePet.Back.model.Usuario;

@Component
public class UsuarioImpl implements IUsuarioService {

	@Autowired
	private IUsuarioRepo repo;
	
	@Override
	public void adicionaUsuario(Usuario usuario) {
		repo.save(usuario);
	}

	@Override
	public void atualizaUsuario(Usuario usuario) {
		repo.save(usuario);
	}

	@Override
	public List<Usuario> recuperaTodos() {

		return (List<Usuario>)repo.findAll();
	}

	@Override
	public Usuario recuperaPorId(int id) {
		return repo.findById(id).get();
	}

	@Override
	public Usuario autenticaUsuario(String email, String senha) {
		return repo.findByEmailAndSenha(email, senha);
	}
}

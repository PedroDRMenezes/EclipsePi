package br.com.SafePet.Back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.SafePet.Back.dao.IComentariosRepo;
import br.com.SafePet.Back.model.Comentarios;

@Component
public class ComentariosImpl implements IComentariosService {

	@Autowired
	private IComentariosRepo repo;
	
	@Override
	public void adicionaComentarios(Comentarios comentarios) {
		repo.save(comentarios);	
	}

	@Override
	public void atualizaComentarios(Comentarios comentarios) {
		repo.save(comentarios);	
	}

	@Override
	public List<Comentarios> recuperaTodos() {
		return (List<Comentarios>)repo.findAll();
	}

	@Override
	public Comentarios recuperaPorId(int id) {
		return repo.findById(id).get();
	}
	
}

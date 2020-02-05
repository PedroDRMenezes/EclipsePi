package br.com.SafePet.Back.service;

import java.util.List;

import br.com.SafePet.Back.model.Comentarios;

public interface IComentariosService {
	
	public void adicionaComentarios(Comentarios comentarios);

	public void atualizaComentarios(Comentarios comentarios);

	public List<Comentarios> recuperaTodos();

	public Comentarios recuperaPorId(int id);

}

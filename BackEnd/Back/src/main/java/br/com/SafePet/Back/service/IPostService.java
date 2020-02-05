package br.com.SafePet.Back.service;

import java.util.List;

import br.com.SafePet.Back.model.Post;

public interface IPostService {
	
	public void adicionaPost(Post post);

	public void atualizaPost(Post post);

	public List<Post> recuperaTodos();

	public Post recuperaPorId(int id);

}

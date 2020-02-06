package br.com.SafePet.Back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.SafePet.Back.dao.IPostRepo;
import br.com.SafePet.Back.model.Post;

@Component
public class PostImpl implements IPostService{
	
	@Autowired
	private IPostRepo repo;

	@Override
	public void adicionaPost(Post post) {
		repo.save(post);
	}

	@Override
	public void atualizaPost(Post post) {
		repo.save(post);
	}

	@Override
	public List<Post> recuperaTodos() {
		return (List<Post>)repo.findByOrderByIdDesc();
	}

	@Override
	public Post recuperaPorId(int id) {
		return repo.findById(id).get();
	}
	

}

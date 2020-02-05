package br.com.SafePet.Back.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.SafePet.Back.model.Post;
import br.com.SafePet.Back.service.IPostService;

@RestController
@CrossOrigin("*")
public class PostController {
	
	@Autowired
	private IPostService serve;
	
	@PostMapping("/post/novo")
	public ResponseEntity<Post> novoPost(@RequestBody Post post){
		System.out.println("Passou por aqui!!");
		System.out.println(post);
		serve.adicionaPost(post);
		return ResponseEntity.ok(post);
	}
	
	@PutMapping("/post/atualiza")
	public ResponseEntity<Post> atualizaPost(@RequestBody Post post){
		serve.atualizaPost(post);
		return ResponseEntity.ok(post);
	}
	
	@GetMapping("/post")
	public ResponseEntity<List<Post>> todoMundo(){
		return ResponseEntity.ok(serve.recuperaTodos());
	}
	
	@GetMapping("/post/{id}")
	public ResponseEntity<Post> soUm(@PathVariable int id){
		Post post = serve.recuperaPorId(id);
		if(post != null) {
			return ResponseEntity.ok(post);
		}
		return ResponseEntity.notFound().build();
	}


}

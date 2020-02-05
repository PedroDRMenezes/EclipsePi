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

import br.com.SafePet.Back.model.AnimalAdocao;
import br.com.SafePet.Back.service.IAnimalAdocaoService;

@RestController
@CrossOrigin("*")
public class AdocaoAnimalController {
	
	@Autowired
	private IAnimalAdocaoService serve;
	
	@PostMapping("/animalAdocao/novo")
	public ResponseEntity<AnimalAdocao> novoUsuario(@RequestBody AnimalAdocao animalAdocao){
		serve.adicionaAnimalAdocao(animalAdocao);
		return ResponseEntity.ok(animalAdocao);
	}
	
	@PutMapping("/animalAdocao/atualiza")
	public ResponseEntity<AnimalAdocao> atualizaUsuario(@RequestBody AnimalAdocao animalAdocao){
		serve.atualizaAnimalAdocao(animalAdocao);
		return ResponseEntity.ok(animalAdocao);
	}
	
	@GetMapping("/animalAdocao")
	public ResponseEntity<List<AnimalAdocao>> todoMundo(){
		return ResponseEntity.ok(serve.recuperaTodos());
	}
	
	@GetMapping("/animalAdocao/{id}")
	public ResponseEntity<AnimalAdocao> soUm(@PathVariable int id){
		AnimalAdocao animalAdocao = serve.recuperaPorId(id);
		if(animalAdocao != null) {
			return ResponseEntity.ok(animalAdocao);
		}
		return ResponseEntity.notFound().build();
	}
}

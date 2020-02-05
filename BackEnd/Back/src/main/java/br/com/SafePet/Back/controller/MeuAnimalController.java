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

import br.com.SafePet.Back.model.MeuAnimal;
import br.com.SafePet.Back.service.IMeuAnimalService;

@RestController
@CrossOrigin("*")
public class MeuAnimalController {
	
	@Autowired
	private IMeuAnimalService serve;
	
	@PostMapping("/meuAnimal/novo")
	public ResponseEntity<MeuAnimal> novoUsuario(@RequestBody MeuAnimal meuAnimal){
		serve.adicionaMeuAnimal(meuAnimal);
		return ResponseEntity.ok(meuAnimal);
	}
	
	@PutMapping("/meuAnimal/atualiza")
	public ResponseEntity<MeuAnimal> atualizaUsuario(@RequestBody MeuAnimal meuAnimal){
		serve.atualizaMeuAnimal(meuAnimal);
		return ResponseEntity.ok(meuAnimal);
	}
	
	@GetMapping("/meuAnimal")
	public ResponseEntity<List<MeuAnimal>> todoMundo(){
		return ResponseEntity.ok(serve.recuperaTodos());
	}
	
	@GetMapping("/meuAnimal/{id}")
	public ResponseEntity<MeuAnimal> soUm(@PathVariable int id){
		MeuAnimal meuAnimal = serve.recuperaPorId(id);
		if(meuAnimal != null) {
			return ResponseEntity.ok(meuAnimal);
		}
		return ResponseEntity.notFound().build();
	}


}

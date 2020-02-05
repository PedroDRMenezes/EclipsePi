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

import br.com.SafePet.Back.model.Comentarios;
import br.com.SafePet.Back.service.IComentariosService;

@RestController
@CrossOrigin("*")
public class ComentariosController {

	@Autowired
	private IComentariosService serve;

	@PostMapping("/comentarios/novo")
	public ResponseEntity<Comentarios> novoComentarios(@RequestBody Comentarios comentarios) {
		serve.adicionaComentarios(comentarios);
		return ResponseEntity.ok(comentarios);
	}

	@PutMapping("/comentarios/atualiza")
	public ResponseEntity<Comentarios> atualizaComentarios(@RequestBody Comentarios comentarios) {
		serve.atualizaComentarios(comentarios);
		return ResponseEntity.ok(comentarios);
	}

	@GetMapping("/comentarios")
	public ResponseEntity<List<Comentarios>> todoMundo() {
		return ResponseEntity.ok(serve.recuperaTodos());
	}

	@GetMapping("/comentarios/{id}")
	public ResponseEntity<Comentarios> soUm(@PathVariable int id) {
		Comentarios comentarios = serve.recuperaPorId(id);
		if (comentarios != null) {
			return ResponseEntity.ok(comentarios);
		}
		return ResponseEntity.notFound().build();
	}

}

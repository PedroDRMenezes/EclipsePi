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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.SafePet.Back.model.Usuario;
import br.com.SafePet.Back.security.Autenticador;
import br.com.SafePet.Back.security.Token;
import br.com.SafePet.Back.service.IUsuarioService;

@RestController
@CrossOrigin("*")
public class UsuarioController {
	
	@Autowired
	private IUsuarioService serve;
	
	
	@PostMapping("/login")
	public ResponseEntity<Token> autentica(@RequestBody Usuario usuario) {
		Usuario u = serve.autenticaUsuario(usuario.getEmail(), usuario.getSenha());		
		if (u!=null) {
			String tk = Autenticador.generateToken(u);
			Token token = new Token();
			token.setStrToken(tk);
			return ResponseEntity.ok(token);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@PostMapping("/usuario/novo")
	public ResponseEntity<Usuario> novoUsuario(@RequestBody Usuario usuario){
		try {
		serve.adicionaUsuario(usuario);
		return ResponseEntity.ok(usuario);
		}catch(Exception err){
		return ResponseEntity.badRequest().build();
		}
	}
	
	@PutMapping("/usuario/atualiza")
	public ResponseEntity<Usuario> atualizaUsuario(@RequestBody Usuario usuario){		
		serve.atualizaUsuario(usuario);
		return ResponseEntity.ok(usuario);
	}
	
	@GetMapping("/usuario")
	public ResponseEntity<List<Usuario>> todoMundo(){
		return ResponseEntity.ok(serve.recuperaTodos());
	}
	
	@GetMapping("/usuario/{id}")
	public ResponseEntity<Usuario> soUm(@PathVariable int id){
		Usuario usu = serve.recuperaPorId(id);
		if(usu != null) {
			return ResponseEntity.ok(usu);
		}
		return ResponseEntity.notFound().build();
	}
	
	@GetMapping("/usuario/userinfo")
	public ResponseEntity<Usuario> getInfo(@RequestParam String token){
		Usuario tmp = Autenticador.getUserFromToken(token);
		tmp = serve.recuperaPorId(tmp.getId());
		if (tmp != null) {
			return ResponseEntity.ok(tmp);
		}
		return ResponseEntity.notFound().build();
	}

}

package br.com.SafePet.Back.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@Column(name = "usuarioId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "nome", length = 100)
	private String nome;

	@Column(name = "nomeDeUsuario", length = 50)
	private String nomeDeUsuario;

	@Column(name = "dataNasc", length = 10)
	private String dataNasc;

	@Column(name = "foto", length = 300)
	private String foto;

	@Column(name = "email", length = 50)
	private String email;

	@Column(name = "telefone", length = 25)
	private String telefone;

	@Column(name = "cep", length = 15)
	private String cep;

	@Column(name = "senha", length = 50)
	private String senha;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
	@JsonIgnoreProperties("usuario")
	private List<MeuAnimal> meuAnimal;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
	@JsonIgnoreProperties("usuario")
	private List<AnimalAdocao> animalAdocao;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "autorPost")
	@JsonIgnoreProperties({"autorPost", "comentarios", "autorComentario"})
	private List<Post> post;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "autorComentario")
	@JsonIgnoreProperties({"autorComentario", "post", "autorPost"})
	private List<Comentarios> comentario;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeDeUsuario() {
		return nomeDeUsuario;
	}

	public void setNomeDeUsuario(String nomeDeUsuario) {
		this.nomeDeUsuario = nomeDeUsuario;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<MeuAnimal> getMeuAnimal() {
		return meuAnimal;
	}

	public void setMeuAnimal(List<MeuAnimal> meuAnimal) {
		this.meuAnimal = meuAnimal;
	}

	public List<AnimalAdocao> getAnimalAdocao() {
		return animalAdocao;
	}

	public void setAnimalAdocao(List<AnimalAdocao> animalAdocao) {
		this.animalAdocao = animalAdocao;
	}

	public List<Post> getPost() {
		return post;
	}

	public void setPost(List<Post> post) {
		this.post = post;
	}

	public List<Comentarios> getComentario() {
		return comentario;
	}

	public void setComentario(List<Comentarios> comentario) {
		this.comentario = comentario;
	}
	
	public String toString() {
		return id+";"+nome+";"+email;
	}


}

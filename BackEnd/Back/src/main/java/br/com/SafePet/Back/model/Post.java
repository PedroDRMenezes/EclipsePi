package br.com.SafePet.Back.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "post")
public class Post {

	@Id
	@Column(name = "postId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "postConteudo", length = 1000)
	private String postConteudo;

	@Column(name = "postImg", length = 300)
	private String postImg;

	@Column(name = "postLike")
	private int postLike;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "post")
	@JsonIgnoreProperties({"post", "Comentarios"})
	private List<Comentarios> comentarios = new ArrayList<Comentarios>();

	@ManyToOne
	@JsonIgnoreProperties({"comentario", "post", "autorComentario", "meuAnimal", "animalAdocao"})
	private Usuario autorPost;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPostConteudo() {
		return postConteudo;
	}

	public void setPostConteudo(String postConteudo) {
		this.postConteudo = postConteudo;
	}

	public String getPostImg() {
		return postImg;
	}

	public void setPostImg(String postImg) {
		this.postImg = postImg;
	}

	public int getPostLike() {
		return postLike;
	}

	public void setPostLike(int postLike) {
		this.postLike = postLike;
	}

	public List<Comentarios> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<Comentarios> comentario) {
		this.comentarios = comentario;
	}

	public Usuario getAutorPost() {
		return autorPost;
	}

	public void setAutorPost(Usuario autorPost) {
		this.autorPost = autorPost;
	}

	
}

package br.com.SafePet.Back.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "comentarios")
public class Comentarios {

	@Id
	@Column(name = "commentId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "commentConteudo", length = 1000)
	private String commentConteudo;

	@Column(name = "commentLike")
	private int commentLike;

	@ManyToOne
	@JsonIgnoreProperties({"comentarios", "post", "autorPost"})
	private Usuario autorComentario;

	@ManyToOne
	@JsonIgnoreProperties({"comentarios", "autorPost", "autorComentario"})
	private Post post;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCommentConteudo() {
		return commentConteudo;
	}

	public void setCommentConteudo(String commentConteudo) {
		this.commentConteudo = commentConteudo;
	}

	public int getCommentLike() {
		return commentLike;
	}

	public void setCommentLike(int commentLike) {
		this.commentLike = commentLike;
	}

	public Usuario getAutorComentario() {
		return autorComentario;
	}

	public void setAutorComentario(Usuario autorComentario) {
		this.autorComentario = autorComentario;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}
}

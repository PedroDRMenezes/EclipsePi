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
@Table(name = "animalAdocao")
public class AnimalAdocao {

	@Id
	@Column(name = "adocaoId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "adocaoNome", length = 50)
	private String adocaoNome;

	@Column(name = "adocaoTipo", length = 50)
	private String adocaoTipo;

	@Column(name = "adocaoRaca", length = 50)
	private String adocaoRaca;

	@Column(name = "adocaoPorte")
	private char adocaoPorte;

	@Column(name = "adocaoLocal", length = 50)
	private String adocaoLocal;

	@Column(name = "adocaoVacinacao")
	private boolean adocaoVacinacao;

	@Column(name = "adocaoDetalhes", length = 300)
	private String adocaoDetalhes;

	@Column(name = "adocaoFoto", length = 300)
	private String adocaoFoto;

	@ManyToOne
	@JsonIgnoreProperties({"comentario", "post", "autorComentario", "meuAnimal", "animalAdocao"})
	private Usuario usuario;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdocaoNome() {
		return adocaoNome;
	}

	public void setAdocaoNome(String adocaoNome) {
		this.adocaoNome = adocaoNome;
	}

	public String getAdocaoTipo() {
		return adocaoTipo;
	}

	public void setAdocaoTipo(String adocaoTipo) {
		this.adocaoTipo = adocaoTipo;
	}

	public String getAdocaoRaca() {
		return adocaoRaca;
	}

	public void setAdocaoRaca(String adocaoRaca) {
		this.adocaoRaca = adocaoRaca;
	}

	public char getAdocaoPorte() {
		return adocaoPorte;
	}

	public void setAdocaoPorte(char adocaoPorte) {
		this.adocaoPorte = adocaoPorte;
	}

	public String getAdocaoLocal() {
		return adocaoLocal;
	}

	public void setAdocaoLocal(String adocaoLocal) {
		this.adocaoLocal = adocaoLocal;
	}

	public boolean isAdocaoVacinacao() {
		return adocaoVacinacao;
	}

	public void setAdocaoVacinacao(boolean adocaoVacinacao) {
		this.adocaoVacinacao = adocaoVacinacao;
	}

	public String getAdocaoDetalhes() {
		return adocaoDetalhes;
	}

	public void setAdocaoDetalhes(String adocaoDetalhes) {
		this.adocaoDetalhes = adocaoDetalhes;
	}

	public String getAdocaoFoto() {
		return adocaoFoto;
	}

	public void setAdocaoFoto(String adocaoFoto) {
		this.adocaoFoto = adocaoFoto;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}

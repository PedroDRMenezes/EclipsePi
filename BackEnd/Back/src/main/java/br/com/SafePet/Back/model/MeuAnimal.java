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
@Table(name = "meuAnimal")
public class MeuAnimal {

	@Id
	@Column(name = "meuAniId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "meuAniNome", length = 50)
	private String meuAniNome;

	@Column(name = "meuAniTipo", length = 50)
	private String meuAniTipo;

	@Column(name = "meuAniRaca", length = 50)
	private String meuAniRaca;

	@Column(name = "meuAniPorte")
	private char meuAniPorte;

	@Column(name = "meuAniVacinacao")
	private boolean meuAniVacinacao;

	@Column(name = "meuAniNasc", length = 50)
	private String meuAniNasc;

	@Column(name = "meuAniDetalhes", length = 300)
	private String meuAniDetalhes;

	@Column(name = "meuAniFoto", length = 300)
	private String meuAniFoto;

	@ManyToOne
	@JsonIgnoreProperties("meuAnimal")
	private Usuario usuario;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMeuAniNome() {
		return meuAniNome;
	}

	public void setMeuAniNome(String meuAniNome) {
		this.meuAniNome = meuAniNome;
	}

	public String getMeuAniTipo() {
		return meuAniTipo;
	}

	public void setMeuAniTipo(String meuAniTipo) {
		this.meuAniTipo = meuAniTipo;
	}

	public String getMeuAniRaca() {
		return meuAniRaca;
	}

	public void setMeuAniRaca(String meuAniRaca) {
		this.meuAniRaca = meuAniRaca;
	}

	public char getMeuAniPorte() {
		return meuAniPorte;
	}

	public void setMeuAniPorte(char meuAniPorte) {
		this.meuAniPorte = meuAniPorte;
	}

	public boolean isMeuAniVacinacao() {
		return meuAniVacinacao;
	}

	public void setMeuAniVacinacao(boolean meuAniVacinacao) {
		this.meuAniVacinacao = meuAniVacinacao;
	}

	public String getMeuAniNasc() {
		return meuAniNasc;
	}

	public void setMeuAniNasc(String meuAniNasc) {
		this.meuAniNasc = meuAniNasc;
	}

	public String getMeuAniDetalhes() {
		return meuAniDetalhes;
	}

	public void setMeuAniDetalhes(String meuAniDetalhes) {
		this.meuAniDetalhes = meuAniDetalhes;
	}

	public String getMeuAniFoto() {
		return meuAniFoto;
	}

	public void setMeuAniFoto(String meuAniFoto) {
		this.meuAniFoto = meuAniFoto;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}

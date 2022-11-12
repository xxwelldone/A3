package anhembiMorumbi;

import java.util.Date;

public class Filme {
	// Locadora de filmes
	private String nome;
	private Date anoLacamento;
	private String genero;
	private String diretor;
	private int classificacao;
	private static int id;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getAnoLacamento() {
		return anoLacamento;
	}
	public void setAnoLacamento(Date anoLacamento) {
		this.anoLacamento = anoLacamento;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getId() {
		return id;
	}
	
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public int getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}
	
	
	public Filme(String nome, Date anoLacamento, String genero, String diretor, int classificacao) {
		super();
		this.nome = nome;
		this.anoLacamento = anoLacamento;
		this.genero = genero;
		this.diretor = diretor;
		this.classificacao = classificacao;
		 Filme.id++;
	}
	public Filme() {
		Filme.id++;
		
	}
	
	
	//

}

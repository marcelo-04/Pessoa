package com.cursojdev.modulo10;
/*
 * Heran�a - Classe pai ou classe master ou superclasse - (Atributos comuns a todos os objetos filhos).
 */
public abstract class Pessoa {
	
	protected String nome;
	protected int idade;
	protected String dataNascimneto;
	protected String registroGeral;
	protected String numeroCpf;
	protected String nomeMae;
	protected String nomePai;

	public abstract double salario();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getDataNascimneto() {
		return dataNascimneto;
	}
	
	public void setDataNascimneto(String dataNascimneto) {
		this.dataNascimneto = dataNascimneto;
	}
	public String getRegistroGeral() {
		return registroGeral;
	}
	
	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}
	
	public String getNumeroCpf() {
		return numeroCpf;
	}
	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}
	
	public String getNomeMae() {
		return nomeMae;
	}
	
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	
	public String getNomePai() {
		return nomePai;
	}
	
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	
	public boolean pessoaMaiorIdade() {
		return idade >= 18;
	}
}

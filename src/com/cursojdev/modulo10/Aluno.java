package com.cursojdev.modulo10;

import java.util.ArrayList;
import java.util.List;
/*Essa é nossa classe/objeto que representa o aluno*/
public class Aluno extends Pessoa {
	
	// Esse são os atributos do Aluno
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public Aluno() {

	}

	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}

	public Aluno(String nomePadrao, int idadePadra) {
		nome = nomePadrao;
		idade = idadePadra;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	/**
	 * /Método que retorna a média do aluno.
	 * 
	 * @return
	 */
	public double getMediaNota() {

		double somaNotas = 0.0;

		for (Disciplina disciplinaEquals : disciplinas) {
			somaNotas += disciplinaEquals.getNota();
		}

		return somaNotas / disciplinas.size();
	}

	/**
	 * Método que retorna true para aprovado e false reprovado.
	 * @return
	 */
	public String getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >= 50) {
			if (media >= 70) {
				return StatusAluno.APROVADO;
			} else {
				return StatusAluno.RECUPERACAO;
			}
		} else {
			return StatusAluno.REPROVADO;
		}
	}

	@Override
	public String toString() {
		return "aluno [nome=" + nome + ", idade=" + idade + ", dataNascimneto=" + dataNascimneto + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((numeroCpf == null) ? 0 : numeroCpf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numeroCpf == null) {
			if (other.numeroCpf != null)
				return false;
		} else if (!numeroCpf.equals(other.numeroCpf))
			return false;
		return true;
	}
	/*
	 * Aula 05 - Anotação @Override e reescrita de método, Identifica método sobreescrito
	 */
	@Override
	public boolean pessoaMaiorIdade() {
		
		return idade >= 21;
	}
	
	public String msgMaiorIdade() {
		return this.pessoaMaiorIdade() ? "Obaa aluno é maior de idade!" :
			"Ixii você é menor de idade!";
	}
}

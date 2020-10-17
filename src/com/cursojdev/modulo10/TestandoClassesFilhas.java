package com.cursojdev.modulo10;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Marcelo aluno da JDev Treinamento.");
		aluno.setNomeEscola("JDev - Treinamento");
		aluno.setIdade(17);
		
		Diretor diretor = new Diretor();
		diretor.setRegistroEducacao("456.AB2-03");
		diretor.setNome("Marcelo Alves");
		diretor.setIdade(51);
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Desevolvimento de Java Web!");
		secretario.setNome("José");
		secretario.setNumeroCpf("123.456.7898-00");
		secretario.setIdade(18);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade()+ " - "+ aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("Salário do Aluno = "+ aluno.salario());
		System.out.println("Salário do Diretor = "+ diretor.salario());
		System.out.println("Salário do Secretario = "+ secretario.salario());
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
		
	}
	
	/*Esse é um método generico para teste*/
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa é demais ==> " 
				+ pessoa.getNome()+ " o salário = "
				+ pessoa.salario());
	}
}

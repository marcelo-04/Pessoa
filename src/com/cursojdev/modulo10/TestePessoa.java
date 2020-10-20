package com.cursojdev.modulo10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;

import com.cursojdev.classesauxiliares.modulo10.FuncaoAutenticacao;
import com.cursojdev.interfaces.modulo10.PermitirAcesso;

public class TestePessoa {

	public static void main(String[] args) {
		
		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");
		
		//Travando o contrato para autorizar somente quem realmente tem o contrato 100% legitimo.
		if (new FuncaoAutenticacao(new Diretor(login, senha)).autenticar()) {

			List<Aluno> alunos = new ArrayList<Aluno>();

			//É uma lista que dentro dela temos uma chave que identifica uma sequencia devalores também.
			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

			for (int qtd = 1; qtd <= 3; qtd++) {

				String nome = JOptionPane.showInputDialog("Qual o nome do aluno: " + qtd + " ?");
				/*
				 * String idade = JOptionPane.showInputDialog("Qual a sua idade?"); String
				 * dataNascimento =
				 * JOptionPane.showInputDialog("Qual a sua data de nascimento?"); String rg =
				 * JOptionPane.showInputDialog("Informe seu registro geral."); String cpf =
				 * JOptionPane.showInputDialog("Informe seu CPF:"); String mae =
				 * JOptionPane.showInputDialog("Digite o nome da mãe:"); String pai =
				 * JOptionPane.showInputDialog("Digite o nome do pai:"); String matricula =
				 * JOptionPane.showInputDialog("Informe a data da matricula?"); String escola =
				 * JOptionPane.showInputDialog("Digite o nome da escola:"); String serie =
				 * JOptionPane.showInputDialog("Digite a série do aluno:");
				 */
				Aluno aluno = new Aluno();

				aluno.setNome(nome);
				/*
				 * aluno.setIdade(Integer.valueOf(idade));
				 * aluno.setDataNascimneto(dataNascimento); aluno.setRegistroGeral(rg);
				 * aluno.setNumeroCpf(cpf); aluno.setNomeMae(mae); aluno.setNomePai(pai);
				 * aluno.setDataMatricula(matricula); aluno.setNomeEscola(escola);
				 * aluno.setSerieMatriculado(serie);
				 */

				for (int pos = 1; pos <= 1; pos++) {

					String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " + pos + " ?");
					String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + " ?");

					Disciplina disciplina = new Disciplina();
					disciplina.setDisciplina(nomeDisciplina);
					disciplina.setNota(Double.valueOf(notaDisciplina));

					aluno.getDisciplinas().add(disciplina);
				}

				int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");

				if (escolha == 0) {/* Opção SIM e ZERO */

					int continuarRemover = 0;
					int posicao = 1;

					while (continuarRemover == 0) {
						String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4?");
						aluno.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
						posicao++;
						continuarRemover = JOptionPane.showConfirmDialog(null, "Deseja continuar removendo?");
					}
				}
				alunos.add(aluno);
			}
			
			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());

			
			for (Aluno aluno : alunos) { // Separado em listas
				if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO)) {
					maps.get(StatusAluno.APROVADO).add(aluno);

				} else if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);

				} else if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.REPROVADO)) {
					maps.get(StatusAluno.REPROVADO).add(aluno);
				}
			}
			System.out.println();
			System.out.println("=============== Lista dos Aprovados ===============");
			for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
				System.out.println("Resultado = " + aluno.getNome() + " está " + aluno.getAlunoAprovado()
						+ " com média de = " + aluno.getMediaNota());
			}
			System.out.println();
			System.out.println("=============== Lista dos em Recuperação ===============");
			for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
				System.out.println("Resultado = " + aluno.getNome() + " está em " + aluno.getAlunoAprovado()
						+ " com média de = " + aluno.getMediaNota());
			}
			System.out.println();
			System.out.println("=============== Lista dos Reprovados ==============");
			for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
				System.out.println("Resultado = " + aluno.getNome() + " está em " + aluno.getAlunoAprovado()
						+ " com média de = " + aluno.getMediaNota());
			}
		} else {
			JOptionPane.showMessageDialog(null, "Acesso Negado!");
		}
	}
}

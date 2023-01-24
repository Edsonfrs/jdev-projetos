package projeto2;

import projeto2.entities.Aluno;

public class CalculoMedia {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno(); 
		aluno1.setNome("Mary Wollstonecraft Shelley");
		aluno1.setDataNascimento("30/08/1797");
		aluno1.setNumeroCpf("03807971");
		aluno1.setNomeMae("Mary Wollstonecraft");
		aluno1.setNomePai("William Godwin");
		aluno1.setDataMatricula("01/01/1818");
		aluno1.setNota1(9);
		aluno1.setNota2(7);
		aluno1.setNota3(8.5);
		aluno1.setNota4(7.8);
		
		System.out.println("BOLETIM ESCOLAR");
		System.out.println();
		System.out.println("Nome: " + aluno1.getNome());
		System.out.println("Data de Nascimento: " + aluno1.getDataNascimento());
		System.out.println("CPF: " + aluno1.getNumeroCpf());
		System.out.println("Nome da Mãe: " + aluno1.getNomeMae());
		System.out.println("Nome do Pai: " + aluno1.getNomePai());
		System.out.println("Data de Matricula: " + aluno1.getDataMatricula());
		System.out.println("Média: " + aluno1.getMediaNota());
		
		

	}

}

package cursojava.executavel;

import javax.swing.JOptionPane;

public class CalculoMédia {

	public static void main(String[] args) {
		
		String nota1 = JOptionPane.showInputDialog("Digite a primeira nota: ");
		String nota2 = JOptionPane.showInputDialog("Digite a segunda nota: ");
		String nota3 = JOptionPane.showInputDialog("Digite a terceira nota: ");
		String nota4 = JOptionPane.showInputDialog("Digite a quarta nota: ");
		
		double valorNota1 = Double.parseDouble(nota1);
		double valorNota2 = Double.parseDouble(nota2);
		double valorNota3 = Double.parseDouble(nota3);
		double valorNota4 = Double.parseDouble(nota4);
		double  media = (valorNota1 + valorNota2 + valorNota3 + valorNota4) / 4;
		
		System.out.println("Nota1: " + nota1);
		System.out.println("Nota2: " + nota2);
		System.out.println("Nota3: " + nota3);
		System.out.println("Nota4: " + nota4);
		
		System.out.println("Média: " + media);
		
		JOptionPane.showMessageDialog(null, "A média do aluno é " +  media + ".");
		
		if (media >= 5) {
			
			if (media >= 7) {
				JOptionPane.showMessageDialog(null, "Aluno aprovado com média " +  media + ".");
			} else {
				JOptionPane.showMessageDialog(null, "Aluno em recuperação com média " +  media + ".");
			}
			
		} else {
			JOptionPane.showMessageDialog(null, "Aluno reprovado com média " +  media + ".");
		}
		
		
		
		
		// TODO Auto-generated method stub

	}

}

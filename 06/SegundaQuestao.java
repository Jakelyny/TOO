import javax.swing.JOptionPane;

/*
 * Disciplina: Tecnologia de Orienta��o a Objetos
 * Professor: Jorge Luis Boeira Bavaresco
 * Aluna: Jakelyny Sousa de Ara�jo
 * */


public class SegundaQuestao {
	public static void main(String[] args) {
		int maior = 0;
		int menor = 2147483647;
		int vetor[] = new int[10];
		for (int i = 0; i < 10; i++) {
			
			String entrada = JOptionPane.showInputDialog("Digite o "+i+"� valor: ");
			vetor[i] = Integer.parseInt(entrada);
		}
		for (int i = 0; i < 10; i++) {
			if(maior < vetor[i]) {
				maior = vetor[i];
			}
			if(menor > vetor[i]) {
				menor = vetor[i];
			}
		}
		System.out.println("O maior n�mero do vetor: "+maior+"\nO menor n�mero do vetor: "+menor);
	}
}
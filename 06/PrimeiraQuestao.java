import javax.swing.JOptionPane;


/*
 * Disciplina: Tecnologia de Orienta��o a Objetos
 * Professor: Jorge Luis Boeira Bavaresco
 * Aluna: Jakelyny Sousa de Ara�jo
 * */


public class PrimeiraQuestao {
	public static void main(String[] args) {
		double aux = 0;
		int vetor[] = new int[10];
		for (int i = 0; i < 10; i++) {
			
			String entrada = JOptionPane.showInputDialog("Digite o "+i+"� valor: ");
			vetor[i] = Integer.parseInt(entrada);
			aux += vetor[i];
		}
		double media;
		media = (aux/10.0);
		for (int i = 0; i < 10; i++) {
			if(vetor[i] > media) {
				System.out.println("O "+vetor[i]+" � maior que "+media+", a m�dia dos valores coletados");
			}
		}
	}
}
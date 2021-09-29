import javax.swing.JOptionPane;


/*
 * Disciplina: Tecnologia de Orientação a Objetos
 * Professor: Jorge Luis Boeira Bavaresco
 * Aluna: Jakelyny Sousa de Araújo
 * */


public class PrimeiraQuestao {
	public static void main(String[] args) {
		double aux = 0;
		int vetor[] = new int[10];
		for (int i = 0; i < 10; i++) {
			
			String entrada = JOptionPane.showInputDialog("Digite o "+i+"º valor: ");
			vetor[i] = Integer.parseInt(entrada);
			aux += vetor[i];
		}
		double media;
		media = (aux/10.0);
		for (int i = 0; i < 10; i++) {
			if(vetor[i] > media) {
				System.out.println("O "+vetor[i]+" é maior que "+media+", a média dos valores coletados");
			}
		}
	}
}
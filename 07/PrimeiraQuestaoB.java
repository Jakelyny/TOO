import javax.swing.JOptionPane;


/*
 * Disciplina: Tecnologia de Orienta��o a Objetos
 * Professor: Jorge Luis Boeira Bavaresco
 * Aluna: Jakelyny Sousa de Ara�jo
 * */


public class PrimeiraQuestaoB {
	public static void main(String[] args) {
		String frase = JOptionPane.showInputDialog("Digite uma frase: ");
		String frase2 = frase.replace(" ", "");
		
		StringBuilder builder = new StringBuilder(frase2);
		JOptionPane.showMessageDialog(null, builder.reverse());
	}
}


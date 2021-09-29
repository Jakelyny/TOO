import javax.swing.JOptionPane;


/*
 * Disciplina: Tecnologia de Orientação a Objetos
 * Professor: Jorge Luis Boeira Bavaresco
 * Aluna: Jakelyny Sousa de Araújo
 * */


public class PrimeiraQuestaoA {
	public static void main(String[] args) {
		String frase = JOptionPane.showInputDialog("Digite uma frase: ");
		String invertida = "";
		String frase2 = frase.replace(" ", "");
		
		for(int i = frase2.length() -1; i >= 0; i--) {
			invertida = invertida + frase2.charAt(i);
		}
		JOptionPane.showMessageDialog(null, invertida);
	}
}

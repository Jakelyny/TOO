import javax.swing.JOptionPane;


/*
 * Disciplina: Tecnologia de Orienta��o a Objetos
 * Professor: Jorge Luis Boeira Bavaresco
 * Aluna: Jakelyny Sousa de Ara�jo
 * */


public class SegundaQuestao {
	public static void main(String[] args) {
		String frase = JOptionPane.showInputDialog("Digite uma frase: ");
		if(frase.contains("sexo")) {
			JOptionPane.showMessageDialog(null, "Conte�do impr�prio!");
		}
		if(frase.contains("sexual")) {
			JOptionPane.showMessageDialog(null, "Conte�do impr�prio!");
		}else {
			JOptionPane.showMessageDialog(null, "Conte�do liberado!");
		}
	}
}
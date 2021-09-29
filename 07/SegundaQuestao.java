import javax.swing.JOptionPane;


/*
 * Disciplina: Tecnologia de Orientação a Objetos
 * Professor: Jorge Luis Boeira Bavaresco
 * Aluna: Jakelyny Sousa de Araújo
 * */


public class SegundaQuestao {
	public static void main(String[] args) {
		String frase = JOptionPane.showInputDialog("Digite uma frase: ");
		if(frase.contains("sexo")) {
			JOptionPane.showMessageDialog(null, "Conteúdo impróprio!");
		}
		if(frase.contains("sexual")) {
			JOptionPane.showMessageDialog(null, "Conteúdo impróprio!");
		}else {
			JOptionPane.showMessageDialog(null, "Conteúdo liberado!");
		}
	}
}
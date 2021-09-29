import javax.swing.JOptionPane;


/*
 * Disciplina: Tecnologia de Orientação a Objetos
 * Professor: Jorge Luis Boeira Bavaresco
 * Aluna: Jakelyny Sousa de Araújo
 * */


public class TerceiraQuestao {
	public static void main(String[] args) {
		String frase = JOptionPane.showInputDialog("Digite uma frase: ");
		if(frase.contains("sexo")) {
			String frase2 = frase.replace("sexo", "CENSURADO");
			JOptionPane.showMessageDialog(null, frase2);
		}
		if(frase.contains("sexual")) {
			String frase3 = frase.replace("sexual", "CENSURADO");
			JOptionPane.showMessageDialog(null, frase3);
		}else {
			JOptionPane.showMessageDialog(null, "Conteúdo liberado!");
		}
	}
}


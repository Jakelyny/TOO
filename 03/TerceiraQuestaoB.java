import javax.swing.JOptionPane;

/**
 * Disciplina: Tecnologia de Orientação a Objeto
 * Aluna: Jakelyny Sousa de Araújo
 * Turma: CC - 3M1
*/

public class TerceiraQuestaoB {
	public static void main(String[] args) {
		String entrada = JOptionPane.showInputDialog("Digite um número");
		int numero = Integer.parseInt(entrada);
		int i = 0;
		while(i < 10){
			int multiplicacao = 0;
			multiplicacao = i * numero;
			JOptionPane.showMessageDialog(null, numero +" X "+ i +" = "+ multiplicacao);
			i++;
		}
	}
}

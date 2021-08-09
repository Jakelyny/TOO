import javax.swing.JOptionPane;

/**
 * Disciplina: Tecnologia de Orientação a Objeto
 * Aluna: Jakelyny Sousa de Araújo
 * Turma: CC - 3M1
*/

public class TerceiraQuestaoC {
	public static void main(String[] args) {
		String entrada = JOptionPane.showInputDialog("Digite um número");
		int numero = Integer.parseInt(entrada);
		int i = 0;
		do{
			int multiplicacao = 0;
			multiplicacao = i * numero;
			JOptionPane.showMessageDialog(null, numero +" X "+ i +" = "+ multiplicacao);
			i++;
		}while(i < 10);
	}
}

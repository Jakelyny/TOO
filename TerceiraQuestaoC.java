import javax.swing.JOptionPane;

/**
 * Disciplina: Tecnologia de Orienta��o a Objeto
 * Aluna: Jakelyny Sousa de Ara�jo
 * Turma: CC - 3M1
*/

public class TerceiraQuestaoC {
	public static void main(String[] args) {
		String entrada = JOptionPane.showInputDialog("Digite um n�mero");
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

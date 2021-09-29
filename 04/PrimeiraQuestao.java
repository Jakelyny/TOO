import javax.swing.JOptionPane;

/* *
 * 
 * Disciplina: Pr�tica Profissional Orientada
 * Professor: Jorge Luis Boeira Bavaresco
 * Aluna: Jakelyny Sousa de Ara�jo
 * 
 * */

public class PrimeiraQuestao {
	public static void main(String[] args) {
		try {
			String strNumero1 = JOptionPane.showInputDialog("Informe um n�mero");
			Double numero1 = Double.parseDouble(strNumero1);
			String strNumero2 = JOptionPane.showInputDialog("Informe um segundo n�mero");
			Double numero2 = Double.parseDouble(strNumero2);
			
			JOptionPane.showMessageDialog(null, (numero1 / numero2));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "OPS, ocorreu um problema..."+ e.getMessage()
					+ "\nClasse do erro: "+ e.getClass());
		} finally {
			JOptionPane.showMessageDialog(null, "Encerrando programa...");
		}
	}
}

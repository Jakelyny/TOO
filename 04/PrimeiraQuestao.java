import javax.swing.JOptionPane;

/* *
 * 
 * Disciplina: Prática Profissional Orientada
 * Professor: Jorge Luis Boeira Bavaresco
 * Aluna: Jakelyny Sousa de Araújo
 * 
 * */

public class PrimeiraQuestao {
	public static void main(String[] args) {
		try {
			String strNumero1 = JOptionPane.showInputDialog("Informe um número");
			Double numero1 = Double.parseDouble(strNumero1);
			String strNumero2 = JOptionPane.showInputDialog("Informe um segundo número");
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

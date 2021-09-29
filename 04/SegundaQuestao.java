import javax.swing.JOptionPane;

/* *
 * 
 * Disciplina: Prática Profissional Orientada
 * Professor: Jorge Luis Boeira Bavaresco
 * Aluna: Jakelyny Sousa de Araújo
 * 
 * */

public class SegundaQuestao {
	public static void main(String[] args) {
		try {
			String strNumero1 = JOptionPane.showInputDialog("Informe um número");
			Double numero1 = Double.parseDouble(strNumero1);
			String strNumero2 = JOptionPane.showInputDialog("Informe um segundo número");
			Double numero2 = Double.parseDouble(strNumero2);
			
			JOptionPane.showMessageDialog(null, ("Resultado: "+ (numero1 / numero2)));
		} catch (NumberFormatException ne) {
			JOptionPane.showMessageDialog(null, "Numero Inválido..."
					+ ne.getMessage());
		} catch (ArithmeticException ae) {
			JOptionPane.showMessageDialog(null, "Erro na divisão por zero..."
					+ ae.getMessage());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ocorreu uma exceção..."+ e.getMessage()
					+ "\nClasse do erro: "+ e.getClass());
		} finally {
			JOptionPane.showMessageDialog(null, "Encerrando programa...");
		}
	}
}

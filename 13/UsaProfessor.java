import javax.swing.JOptionPane;

/*
 *  Disciplina: Tecnologia de Orienta��o a Objetos
 *  Professor: Jorge Luis Boeira Bavaresco
 *  Aluna: Jakelyny Sousa de Ara�jo
 *  
 * */

public class UsaProfessor {
	
	public static void main(String[] args) {
		
		Cidade c1 = new Cidade(Integer.parseInt(JOptionPane.showInputDialog("Informe o c�digo cidade: ")), 
				JOptionPane.showInputDialog("Informe o nome da cidade: "), JOptionPane.showInputDialog("Informe o uf: "));
		
		Professor pf1 = new Professor(Integer.parseInt(JOptionPane.showInputDialog("Informe o c�digo: ")), 
				JOptionPane.showInputDialog("Informe o nome: "), Integer.parseInt(JOptionPane.showInputDialog("Informe a carga hor�ria: ")),
				Double.parseDouble(JOptionPane.showInputDialog("Informe o valor por hora: ")), c1, 
				JOptionPane.showInputDialog("Informe a titula��o: "),Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero de turmas: ")));
		pf1.calculaSalario();
		pf1.exibirDados();
	}
}

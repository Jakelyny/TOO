import javax.swing.JOptionPane;

/*
 *  Disciplina: Tecnologia de Orienta��o a Objetos
 *  Professor: Jorge Luis Boeira Bavaresco
 *  Aluna: Jakelyny Sousa de Ara�jo
 *  
 * */

public class UsaPessoa {
	
	public static void main(String[] args) {
		
		Cidade c1 = new Cidade(Integer.parseInt(JOptionPane.showInputDialog("Informe o c�digo cidade: ")), 
				JOptionPane.showInputDialog("Informe o nome da cidade: "), JOptionPane.showInputDialog("Informe o uf: "));
		
		Pessoa p1 = new Pessoa(Integer.parseInt(JOptionPane.showInputDialog("Informe o c�digo: ")), 
				JOptionPane.showInputDialog("Informe o nome: "), Integer.parseInt(JOptionPane.showInputDialog("Informe a carga hor�ria: ")),
				Double.parseDouble(JOptionPane.showInputDialog("Informe o valor por hora: ")), c1);
		p1.calculaSalario();
		p1.exibirDados();
	}

}

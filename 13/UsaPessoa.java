import javax.swing.JOptionPane;

/*
 *  Disciplina: Tecnologia de Orientação a Objetos
 *  Professor: Jorge Luis Boeira Bavaresco
 *  Aluna: Jakelyny Sousa de Araújo
 *  
 * */

public class UsaPessoa {
	
	public static void main(String[] args) {
		
		Cidade c1 = new Cidade(Integer.parseInt(JOptionPane.showInputDialog("Informe o código cidade: ")), 
				JOptionPane.showInputDialog("Informe o nome da cidade: "), JOptionPane.showInputDialog("Informe o uf: "));
		
		Pessoa p1 = new Pessoa(Integer.parseInt(JOptionPane.showInputDialog("Informe o código: ")), 
				JOptionPane.showInputDialog("Informe o nome: "), Integer.parseInt(JOptionPane.showInputDialog("Informe a carga horária: ")),
				Double.parseDouble(JOptionPane.showInputDialog("Informe o valor por hora: ")), c1);
		p1.calculaSalario();
		p1.exibirDados();
	}

}

import javax.swing.JOptionPane;

/*
 *  Disciplina: Tecnologia de Orientação a Objetos
 *  Professor: Jorge Luis Boeira Bavaresco
 *  Aluna: Jakelyny Sousa de Araújo
 *  
 * */

public class UsaCidade {
	
	public static void main(String[] args) {
		
		Cidade c1 = new Cidade(Integer.parseInt(JOptionPane.showInputDialog("Informe o código: ")), 
				JOptionPane.showInputDialog("Informe o nome: "), JOptionPane.showInputDialog("Informe o uf: "));
		c1.exibirDadosCidade();
	}
}

import javax.swing.JOptionPane;

/*
 *  Disciplina: Tecnologia de Orienta��o a Objetos
 *  Professor: Jorge Luis Boeira Bavaresco
 *  Aluna: Jakelyny Sousa de Ara�jo
 *  
 * */

public class UsaCidade {
	
	public static void main(String[] args) {
		
		Cidade c1 = new Cidade(Integer.parseInt(JOptionPane.showInputDialog("Informe o c�digo: ")), 
				JOptionPane.showInputDialog("Informe o nome: "), JOptionPane.showInputDialog("Informe o uf: "));
		c1.exibirDadosCidade();
	}
}

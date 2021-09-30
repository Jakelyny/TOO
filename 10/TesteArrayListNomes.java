import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/*
 *  Disciplina: Tecnologia de Orientação a Objetos
 *  Professor: Jorge Luis Boeira Bavaresco
 *  Aluna: Jakelyny Sousa de Araújo
 *  
 * */

public class TesteArrayListNomes {
	public static void main(String[] args) {
		
		ArrayList<String> nomePessoas = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			nomePessoas.add(JOptionPane.showInputDialog("Digite o nome: "));
		}
		System.out.println("----10 nomes por ordem de entrada----");
		for(String l : nomePessoas) {
			
			System.out.println("Nome: " + l);
		}
		
		Collections.sort(nomePessoas);
		System.out.println("\n----10 nomes ordenados----");
		for(String l : nomePessoas) {
			
			System.out.println("Nome: " + l);
		}
	}
}

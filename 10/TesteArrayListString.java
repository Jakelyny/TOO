import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 *  Disciplina: Tecnologia de Orientação a Objetos
 *  Professor: Jorge Luis Boeira Bavaresco
 *  Aluna: Jakelyny Sousa de Araújo
 *  
 * */

public class TesteArrayListString {
	public static void main(String[] args) {
		
		ArrayList<String> listaStrings = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			listaStrings.add(JOptionPane.showInputDialog("Digite algo: "));
		}
		System.out.println("----Todos os 10 elementos----\n");
		for(String l : listaStrings) {
			
			System.out.println("Elemento: " + l);
		}
		listaStrings.remove(2);
        listaStrings.remove(4);
        System.out.println("\n---Remoção índices: [2] [4]---");
        System.out.println("Tamanho da lista: " + listaStrings.size());
	}
}

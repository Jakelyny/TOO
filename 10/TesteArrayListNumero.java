import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 *  Disciplina: Tecnologia de Orienta��o a Objetos
 *  Professor: Jorge Luis Boeira Bavaresco
 *  Aluna: Jakelyny Sousa de Ara�jo
 *  
 * */

public class TesteArrayListNumero {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> listaInteger = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++) {
			
			listaInteger.add(Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(i+1)+"� n�mero:")));
		}
		
		for(Integer l : listaInteger) {
			
			if(l == 10 || l == 100 || l == 1000) {
				System.out.println("N�mero: " + l + " - Voc� ganhou um b�nus de R$ 50,00 !!");
			}else {
				System.out.println("N�mero: " + l);
			}
		}
	}
}

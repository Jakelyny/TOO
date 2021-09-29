import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/*
 * Disciplina: Tecnologia de Orientação a Objetos
 * Professor: Jorge Luis Boeira Bavaresco
 * Aluna: Jakelyny Sousa de Araújo
 * */


public class PrimeiraQuestao {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite uma data no formato (dd/mm/aaaa): ");
		String d = in.nextLine();
		DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
		df.setLenient (false);
		try {
		    df.parse (d);
		    System.out.print("Data válida!");
		} catch (Exception ex) {
			System.out.print("Data inválida!");
		}
	}
}




import java.util.Scanner;

/**
 * Disciplina: Tecnologia de Orienta��o a Objeto
 * Aluna: Jakelyny Sousa de Ara�jo
 * Turma: CC - 3M1
*/

public class QuartaQuestao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o n�mero inicial: ");
		int primeiroNum = entrada.nextInt();
		System.out.println("Digite o n�mero final: ");
		int segundoNum = entrada.nextInt();
		for (int i = primeiroNum; i < segundoNum+1; i++) {
			if(i % 2 == 0) {
				System.out.println(i + " � par");
			}
		}
	}		
}

import java.util.Scanner;

/**
 * Disciplina: Tecnologia de Orientação a Objeto
 * Aluna: Jakelyny Sousa de Araújo
 * Turma: CC - 3M1
*/

public class PrimeiraQuestao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o número de prestações: ");
		int prestacoes = entrada.nextInt();
		double valorTotal = 0.0;
		System.out.println("Agora digite o valor total da compra: R$ ");
		valorTotal = entrada.nextDouble();
		
		double resultado = valorTotal / prestacoes;
		
		System.out.println("Você pagará "+ prestacoes +"x de R$ "+ resultado);
	}
}

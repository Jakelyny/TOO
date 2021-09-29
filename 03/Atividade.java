import java.util.Scanner;

/**
 * Disciplina: Tecnologia de Orienta��o a Objetos
 * Aluna: Jakelyny Sousa de Ara�jo
 * Turma: CC - 3M1
*/ 
public class Atividade{
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("O nome de uma disciplina: ");
		String disciplina = entrada.nextLine();
		System.out.println("Digite sua primeira nota: ");
		double primeiraNota = entrada.nextInt();
		System.out.println("Agora sua segunda nota: ");
		double segundaNota = entrada.nextInt();
		double media = (primeiraNota + segundaNota) / 2;
		
		System.out.println("Ol� "+nome+", sua m�dia na disciplina "+disciplina+" � "+media+", bons estudos!");
	}
}

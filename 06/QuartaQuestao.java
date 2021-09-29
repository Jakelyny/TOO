import javax.swing.JOptionPane;

/*
 * Disciplina: Tecnologia de Orientação a Objetos
 * Professor: Jorge Luis Boeira Bavaresco
 * Aluna: Jakelyny Sousa de Araújo
 * */


public class QuartaQuestao {
	public static void main(String[] args) {
		int A[] = new int[10];
		int B[] = new int[10];
		int C[] = new int[10];
		for(int i = 0; i < 10; i++) {
			String entrada = JOptionPane.showInputDialog("[A] Digite o "+i+"º valor: ");
			A[i] = Integer.parseInt(entrada);
		}
		for(int i = 0; i < 10; i++) {
			String entrada = JOptionPane.showInputDialog("[B] Digite o "+i+"º valor: ");
			B[i] = Integer.parseInt(entrada);
		}
		int S = 0;
		S = (A[0]*B[9]) + (A[1]*B[8]) + (A[2]*B[7]) + (A[3]*B[6]) + (A[4]*B[5]) + (A[5]*B[4]) + (A[6]*B[3]) + (A[7]*B[2]) + (A[8]*B[1]) + (A[9]*B[0]);
		System.out.println("Números pares do array A: ");
		for(int i = 0; i < 10; i++) {
			C[i] = A[i]/B[i];
			if(A[i] % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("Valor de S: "+S);
		System.out.println("Números do array C:");
		for(int i = 0; i < 10; i++) {
			System.out.println(C[i]);
		}
	}
}
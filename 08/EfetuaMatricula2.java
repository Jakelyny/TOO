import javax.swing.JOptionPane;

/*
 * Disciplina: Tecnologia de Orienta��o a Objetos
 * Professor: Jorge Luis Boeira Bavaresco
 * Aluna: Jakelyny Sousa de Ara�jo
 * 
 *     MATRICULA ALUNO
 * */

public class EfetuaMatricula2 {
	public static void main(String[] args) {
		
		MatriculaAluno aluno = new MatriculaAluno();
		
		String numeroMatriculaAux = JOptionPane.showInputDialog("Informe o n�mero de matr�cula: ");
		aluno.numeroMatriculaAluno = Integer.parseInt(numeroMatriculaAux);
		aluno.salaAluno = JOptionPane.showInputDialog("Informe a sala: ");
		aluno.nomeAluno = JOptionPane.showInputDialog("Informe o nome do aluno: ");
		String primeiraNotaAux = JOptionPane.showInputDialog("Informe a 1� nota: ");
		aluno.primeiraNota = Double.parseDouble(primeiraNotaAux);
		String segundaNotaAux = JOptionPane.showInputDialog("Informe a 2� nota: ");
		aluno.segundaNota = Double.parseDouble(segundaNotaAux);
		JOptionPane.showMessageDialog(null, "N� matr�cula: " + aluno.numeroMatriculaAluno + 
				"\nSala: " + aluno.salaAluno + "\nNome: " + aluno.nomeAluno + "\n1� nota: " + aluno.primeiraNota + 
				"\n2� nota: " + aluno.segundaNota + "\n M�dia: " + aluno.MediaAluno());
	}
}

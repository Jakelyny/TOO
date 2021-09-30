import javax.swing.JOptionPane;

/*
 * Disciplina: Tecnologia de Orientação a Objetos
 * Professor: Jorge Luis Boeira Bavaresco
 * Aluna: Jakelyny Sousa de Araújo
 * 
 *     MATRICULA ALUNO
 * */

public class EfetuaMatricula2 {
	public static void main(String[] args) {
		
		MatriculaAluno aluno = new MatriculaAluno();
		
		String numeroMatriculaAux = JOptionPane.showInputDialog("Informe o número de matrícula: ");
		aluno.numeroMatriculaAluno = Integer.parseInt(numeroMatriculaAux);
		aluno.salaAluno = JOptionPane.showInputDialog("Informe a sala: ");
		aluno.nomeAluno = JOptionPane.showInputDialog("Informe o nome do aluno: ");
		String primeiraNotaAux = JOptionPane.showInputDialog("Informe a 1ª nota: ");
		aluno.primeiraNota = Double.parseDouble(primeiraNotaAux);
		String segundaNotaAux = JOptionPane.showInputDialog("Informe a 2ª nota: ");
		aluno.segundaNota = Double.parseDouble(segundaNotaAux);
		JOptionPane.showMessageDialog(null, "Nº matrícula: " + aluno.numeroMatriculaAluno + 
				"\nSala: " + aluno.salaAluno + "\nNome: " + aluno.nomeAluno + "\n1ª nota: " + aluno.primeiraNota + 
				"\n2ª nota: " + aluno.segundaNota + "\n Média: " + aluno.MediaAluno());
	}
}

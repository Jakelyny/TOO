
/*
 * Disciplina: Tecnologia de Orienta��o a Objetos
 * Professor: Jorge Luis Boeira Bavaresco
 * Aluna: Jakelyny Sousa de Ara�jo
 * 
 *     MATRICULA ALUNO
 * */

public class EfetuaMatricula {
	public static void main(String[] args) {
		MatriculaAluno aluno1 = new MatriculaAluno();
		aluno1.numeroMatriculaAluno = 2016343;
		aluno1.salaAluno = "3M1";
		aluno1.nomeAluno = "Jakelyny";
		aluno1.primeiraNota = 8.0;
		aluno1.segundaNota = 7.8;
		
		System.out.println(" N� matr�cula: " + aluno1.numeroMatriculaAluno + 
				"\n Sala: " + aluno1.salaAluno + "\n Nome: " + aluno1.nomeAluno + 
				"\n 1� nota: " + aluno1.primeiraNota + "\n 2� nota: " + aluno1.segundaNota + "\n M�dia: " + aluno1.MediaAluno());
		
		MatriculaAluno aluno2 = new MatriculaAluno();
		aluno2.numeroMatriculaAluno = 2014598;
		aluno2.salaAluno = "1M1";
		aluno2.nomeAluno = "Astronagbaldo";
		aluno2.primeiraNota = 9.6;
		aluno2.segundaNota = 8.75;
		
		System.out.println(" N� matr�cula: " + aluno2.numeroMatriculaAluno + 
				"\n Sala: " + aluno2.salaAluno + "\n Nome: " + aluno2.nomeAluno + 
				"\n 1� nota: " + aluno2.primeiraNota + "\n 2� nota: " + aluno2.segundaNota + "\n M�dia: " + aluno2.MediaAluno());
	}
}

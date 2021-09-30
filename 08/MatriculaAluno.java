
/*
 * Disciplina: Tecnologia de Orientação a Objetos
 * Professor: Jorge Luis Boeira Bavaresco
 * Aluna: Jakelyny Sousa de Araújo
 * 
 *     MATRICULA ALUNO
 * */

public class MatriculaAluno {
	
	Integer numeroMatriculaAluno;
	String salaAluno;
	String nomeAluno;
	Double primeiraNota;
	Double segundaNota;
	
	public MatriculaAluno() {
		System.out.println("\n-----------------------------");
		this.numeroMatriculaAluno = 0;
		this.salaAluno = "Dado não informado";
		this.nomeAluno = "Dado não informado";
		this.primeiraNota = 0.0;
		this.segundaNota = 0.0;
	}
	
	public Double MediaAluno() {
		Double media = (this.primeiraNota + this.segundaNota) / 2;
		return media;
		
	}
	
}

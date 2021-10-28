package grandense.rio.sul.federal.instituto;

/*
 *  Disciplina: Tecnologia de Orienta��o a Objetos
 *  Professor: Jorge Luis Boeira Bavaresco
 *  Aluna: Jakelyny Sousa de Ara�jo
 *  
 * */

public class Nota{
	
	private Aluno aluno;
	private Disciplina disciplina;
	private Double notaProva;
	private Double notaTrabalho;
	
	public Nota() {
		
	}
	
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public Aluno getAluno() {
		return aluno;
	}
	
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	public Disciplina getDisciplina() {
		return disciplina;
	}
	
	public void setNotaProva(Double notaProva) {
		if(notaProva <= 0 || notaProva > 10) {
			System.out.println("Necess�rio ser maior que zero e menor que dez !!!");
		}else {
			this.notaProva = notaProva;
		}
	}
	
	public Double getNotaProva() {
		return notaProva;
	}
	
	public void setNotaTrabalho(Double notaTrabalho) {
		if(notaTrabalho <= 0 || notaTrabalho > 10) {
			System.out.println("\n\n---------------------------------------------------------\nNecess�rio ser maior que zero e menor que dez !!!");
		}else {
			this.notaTrabalho = notaTrabalho;
		}
	}
	
	public Double getNotaTrabalho() {
		return notaTrabalho;
	}	
	
	public Double mediaPonderada() {
		if(notaProva == null || notaTrabalho == null) {
			System.out.println("Valores de prova ou trabalho, est�o inv�lidos ou nulos!\n---------------------------------------------------------");
			return null;
		}else {
			return ((notaProva * 6) + (notaTrabalho * 4)) / 10;
		}	
	}
}

package notas.de.exibicao;
import grandense.rio.sul.federal.instituto.Aluno;
import grandense.rio.sul.federal.instituto.Disciplina;
import grandense.rio.sul.federal.instituto.Nota;

import java.util.Date;
/*
 *  Disciplina: Tecnologia de Orientação a Objetos
 *  Professor: Jorge Luis Boeira Bavaresco
 *  Aluna: Jakelyny Sousa de Araújo
 *  
 * */

public class Resultado {

public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		a1.setNome("Jakelyny Sousa");
		a1.setDataNascimento(new Date());
		
		Disciplina d1 = new Disciplina();
		d1.setNome("TOO");
		d1.setCargaHoraria(80);
		
		Nota n1 = new Nota();
		n1.setAluno(a1);
		n1.setDisciplina(d1);
		n1.setNotaProva(8.60);
		n1.setNotaTrabalho(8.00);
		
		System.out.println("Nome: "+ a1.getNome() +"\nDisciplina: "+ d1.getNome() +"\nMédia: "+ n1.mediaPonderada());
		
		Aluno a2 = new Aluno();
		a2.setNome("Danniel Santos");
		a2.setDataNascimento(new Date());
		
		Disciplina d2 = new Disciplina();
		d2.setNome("ED1");
		d2.setCargaHoraria(90);
		
		Nota n2 = new Nota();
		n2.setAluno(a2);
		n2.setDisciplina(d2);
		n2.setNotaProva(6.70);
		n2.setNotaTrabalho(9.60);	
		
		System.out.println("\n\nNome: "+ a2.getNome() +"\nDisciplina: "+ d2.getNome() +"\nMédia: "+ n2.mediaPonderada());
		
		Aluno a3 = new Aluno();
		a3.setNome("Josue da Pereira");
		a3.setDataNascimento(new Date());
		
		Disciplina d3 = new Disciplina();
		d3.setNome("BD2");
		d3.setCargaHoraria(40);
		
		Nota n3 = new Nota();
		n3.setAluno(a3);
		n3.setDisciplina(d3);
		n3.setNotaProva(5.30);
		n3.setNotaTrabalho(11.00);
		
		System.out.println("Nome: "+ a3.getNome() +"\nDisciplina: "+ d3.getNome() +"\nMédia: "+ n3.mediaPonderada()+"\n\n");
		
		Aluno a4 = new Aluno();
		a4.setNome("Nini Montgomery");
		a4.setDataNascimento(new Date());
		
		Disciplina d4 = new Disciplina();
		d4.setNome("LPBD");
		d4.setCargaHoraria(90);
		
		Nota n4 = new Nota();
		n4.setAluno(a4);
		n4.setDisciplina(d4);
		n4.setNotaProva(9.75);
		n4.setNotaTrabalho(6.00);
		
		System.out.println("\nNome: "+ a4.getNome() +"\nDisciplina: "+ d4.getNome() +"\nMédia: "+ n4.mediaPonderada());
		
		Aluno a5 = new Aluno();
		a5.setNome("Amarylles Bruzaca");
		a5.setDataNascimento(new Date());
		
		Disciplina d5 = new Disciplina();
		d5.setNome("CDI2");
		d5.setCargaHoraria(60);
		
		Nota n5 = new Nota();
		n5.setAluno(a5);
		n5.setDisciplina(d5);
		n5.setNotaProva(7.00);
		n5.setNotaTrabalho(6.95);
		
		System.out.println("\n\nNome: "+ a5.getNome() +"\nDisciplina: "+ d5.getNome() +"\nMédia: "+ n5.mediaPonderada());
	}
}
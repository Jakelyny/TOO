package grandense.rio.sul.federal.instituto;
import java.util.Date;

/*
 *  Disciplina: Tecnologia de Orientação a Objetos
 *  Professor: Jorge Luis Boeira Bavaresco
 *  Aluna: Jakelyny Sousa de Araújo
 *  
 * */

public class Aluno {

	private String nome;
	private Date dataNascimento;
	
	public Aluno() {

	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setDataNascimento(Date string) {
		this.dataNascimento = string;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
}

package grandense.rio.sul.federal.instituto;

/*
 *  Disciplina: Tecnologia de Orienta��o a Objetos
 *  Professor: Jorge Luis Boeira Bavaresco
 *  Aluna: Jakelyny Sousa de Ara�jo
 *  
 * */

public class Disciplina {
	
	private String nome;
	private Integer cargaHoraria;
	
	public Disciplina(){
		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public Integer getCargaHoraria(){
		return this.cargaHoraria;
	}
}

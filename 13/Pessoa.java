/*
 *  Disciplina: Tecnologia de Orienta��o a Objetos
 *  Professor: Jorge Luis Boeira Bavaresco
 *  Aluna: Jakelyny Sousa de Ara�jo
 *  
 * */

public class Pessoa {
	
	Integer codigo;
	String nome;
	Integer cargaHoraria;
	Double valorHora;
	Double salario;
	Cidade cidade;
	
	public Pessoa(Integer codigo, String nome, Integer cargaHoraria, Double valorHora, Cidade cidade) {
		this.codigo = codigo;
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.valorHora = valorHora;
		this.cidade = cidade;
	}
	
	public void calculaSalario() {
		this.salario = (this.cargaHoraria * this.valorHora);
	}
	
	public void exibirDados() {
		System.out.println("C�digo: "+ this.codigo + "\nNome: "+ this.nome + "\nCarga Hor�ria: "+ this.cargaHoraria + 
							"\nValor hora: "+ this.valorHora + "\nSal�rio: "+ this.salario + "\nCidade: "+ this.cidade.nome + "\nC�digo cidade: "+
							this.cidade.codigo + "\nUF: "+ this.cidade.uf);
	}
}

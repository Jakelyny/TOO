/*
 *  Disciplina: Tecnologia de Orientação a Objetos
 *  Professor: Jorge Luis Boeira Bavaresco
 *  Aluna: Jakelyny Sousa de Araújo
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
		System.out.println("Código: "+ this.codigo + "\nNome: "+ this.nome + "\nCarga Horária: "+ this.cargaHoraria + 
							"\nValor hora: "+ this.valorHora + "\nSalário: "+ this.salario + "\nCidade: "+ this.cidade.nome + "\nCódigo cidade: "+
							this.cidade.codigo + "\nUF: "+ this.cidade.uf);
	}
}

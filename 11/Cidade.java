/*
 *  Disciplina: Tecnologia de Orienta��o a Objetos
 *  Professor: Jorge Luis Boeira Bavaresco
 *  Aluna: Jakelyny Sousa de Ara�jo
 *  
 * */

public class Cidade {
	
	Integer codigo;
	String nome;
	String uf;
	
	public Cidade() {
		this.codigo = 0;
		this.nome = "N�o informado";
		this.uf = "";
	}
	
	public Cidade(Integer codigo, String nome, String uf) {
		this.codigo = codigo;
		this.nome = nome;
		this.uf = uf;
	}
	
	public void exibirDadosCidade() {
		System.out.println("C�digo: "+ this.codigo + "\nNome: "+ this.nome + "\nUF: "+ this.uf);
	}
}

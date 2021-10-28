/*
 *  Disciplina: Tecnologia de Orientação a Objetos
 *  Professor: Jorge Luis Boeira Bavaresco
 *  Aluna: Jakelyny Sousa de Araújo
 *  
 * */

public class Professor extends Pessoa{
	
	String titulacao;
	Integer numeroTurmas;
	public Professor(Integer codigo, String nome, Integer cargaHoraria, Double valorHora, Cidade cidade, String titulacao, Integer numeroTurmas) {
		super(codigo, nome, cargaHoraria, valorHora, cidade);
		this.titulacao = titulacao;
		this.numeroTurmas = numeroTurmas;
	}
	
	@Override
	public void calculaSalario() {
		this.salario = (this.cargaHoraria * this.valorHora) + ((this.cargaHoraria * this.valorHora) * (this.numeroTurmas * (1/100)));
	}
	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Titulacao: "+ this.titulacao + "\nNº de turmas: "+ this.numeroTurmas);
	}
}

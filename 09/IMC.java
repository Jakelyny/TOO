import javax.swing.JOptionPane;
/*
 * Disciplina: Tecnologia de Orientação a Objetos
 * Professor: Jorge Luis Boeira Bavaresco
 * Aluna: Jakelyny Sousa de Araújo
 * 
 *          IMC
 * */

public class IMC {
	
	String nome;
	Double altura;
	Double peso;
	Double IMCpessoa;
	String classificacao;
	
	public IMC(String nome, Double altura, Double peso) {
		
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
		this.classificacao = calcularIMC();
	}
	
	public String calcularIMC() {
		
		this.IMCpessoa = this.peso / (this.altura * this.altura);
		
		if(this.IMCpessoa <= 18.5) {
			classificacao = "Grau 0 - Magreza";
		}else if(this.IMCpessoa <= 24.9) {
			classificacao = "Grau 0 - Normal";
		}else if(this.IMCpessoa <= 29.9) {
			classificacao = "Grau I - Sobrepeso";
		}else if(this.IMCpessoa <= 39.9) {
			classificacao = "Grau II - Obesidade";
		}else if(this.IMCpessoa >= 40) {
			classificacao = "Grau III - Obesidade Grave";
		}
		return classificacao;	
	}
	
	public void exibirDados() {
		
		JOptionPane.showMessageDialog(null, "Nome:  " + this.nome + 
				"\nAltura: " + this.altura + "\nPeso: " + this.peso + "\nIMC: " + (this.IMCpessoa = this.peso / (this.altura * this.altura)) + 
				"\nClassificação: " + this.calcularIMC());
	}
}

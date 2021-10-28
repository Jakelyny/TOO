import javax.swing.JOptionPane;

/*
 * Disciplina: Tecnologia de Orientação a Objetos
 * Professor: Jorge Luis Boeira Bavaresco
 * Aluna: Jakelyny Sousa de Araújo
 * */

public class PrimeiraQuestao {
	public static void main(String[] args) {
	String nome;
	double salario;
	double inss = 0.0;
	double descontoINSS = 0.0;

	nome = JOptionPane.showInputDialog("Digite o nome: ");
	String salarioCovert = JOptionPane.showInputDialog("Digite o salário: ");
	salario = Double.parseDouble(salarioCovert);
	
	if(salario <= 1100.0) {
		inss = (salario * (7.5 / 100.0));
		descontoINSS = (salario - inss);
	}else if(salario <= 2203.48) {
		inss = (salario * (9.0 / 100.0));
		descontoINSS = (salario - inss);
	}else if(salario <= 3305.22) {
		inss = (salario * (12.0 / 100.0));
		descontoINSS = (salario - inss);
	}else if(salario <= 6433.57) {
		inss = (salario * (14.0 / 100.0));
		descontoINSS = (salario - inss);
	}

	System.out.println("Nome: "+nome);
	System.out.println("Novo bruto: "+salario);
	System.out.println("INSS: "+inss);
	System.out.println("Salário líquido: "+descontoINSS);
	}
}

import javax.swing.JOptionPane;

/*
 * Disciplina: Tecnologia de Orienta��o a Objetos
 * Professor: Jorge Luis Boeira Bavaresco
 * Aluna: Jakelyny Sousa de Ara�jo
 * */


public class QuintaQuestao {
	public static void main(String[] args) {
		double ajuste = 0;
		int codigo[] = new int[5];
		String nomes[] = new String[5];
		String nascimento[] = new String[5];
		double salario[] = new double[5];
		double novoSalario[] = new double[5];
		for (int i = 0; i < 5; i++) {
			String primeira = JOptionPane.showInputDialog("Digite o "+i+"� codigo: ");
			codigo[i] = Integer.parseInt(primeira);
			nomes[i] = JOptionPane.showInputDialog("Digite o "+i+"� nome: ");
			nascimento[i] = JOptionPane.showInputDialog("Digite a "+i+"� data de nascimento:");
			String segunda = JOptionPane.showInputDialog("Digite o "+i+"� sal�rio: ");
			salario[i] = Double.parseDouble(segunda);
		}
		String terceira = JOptionPane.showInputDialog("Digite o valor do percentual: ");
		ajuste = Integer.parseInt(terceira);
		for(int i = 0; i < 5; i++) {
			novoSalario[i] = (salario[i] * ((ajuste / 100.0) + 1.0));
		}
		for(int i = 0; i < 5; i++) {
			System.out.println("C�digo: "+codigo[i]);
			System.out.println("Nome: "+nomes[i]);
			System.out.println("Data de Nascimento: "+nascimento[i]);
			System.out.println("Novo Sal�rio: R$"+novoSalario[i]+"\n----------------------------------");
		}
	}
}
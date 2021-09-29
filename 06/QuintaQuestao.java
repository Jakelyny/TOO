import javax.swing.JOptionPane;

/*
 * Disciplina: Tecnologia de Orientação a Objetos
 * Professor: Jorge Luis Boeira Bavaresco
 * Aluna: Jakelyny Sousa de Araújo
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
			String primeira = JOptionPane.showInputDialog("Digite o "+i+"º codigo: ");
			codigo[i] = Integer.parseInt(primeira);
			nomes[i] = JOptionPane.showInputDialog("Digite o "+i+"º nome: ");
			nascimento[i] = JOptionPane.showInputDialog("Digite a "+i+"º data de nascimento:");
			String segunda = JOptionPane.showInputDialog("Digite o "+i+"º salário: ");
			salario[i] = Double.parseDouble(segunda);
		}
		String terceira = JOptionPane.showInputDialog("Digite o valor do percentual: ");
		ajuste = Integer.parseInt(terceira);
		for(int i = 0; i < 5; i++) {
			novoSalario[i] = (salario[i] * ((ajuste / 100.0) + 1.0));
		}
		for(int i = 0; i < 5; i++) {
			System.out.println("Código: "+codigo[i]);
			System.out.println("Nome: "+nomes[i]);
			System.out.println("Data de Nascimento: "+nascimento[i]);
			System.out.println("Novo Salário: R$"+novoSalario[i]+"\n----------------------------------");
		}
	}
}
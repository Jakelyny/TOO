import javax.swing.JOptionPane;

/*
 * Disciplina: Tecnologia de Orientação a Objetos
 * Professor: Jorge Luis Boeira Bavaresco
 * Aluna: Jakelyny Sousa de Araújo
 * */


public class TerceiraQuestao {
	public static void main(String[] args) {
		String nomes[] = new String[10];
		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = JOptionPane.showInputDialog("Digite o "+i+"º nome");
		}
		String copiaNome = JOptionPane.showInputDialog("Qual nome deseja procurar: ");
		for (int i = 0; i < nomes.length; i++) {
			if(copiaNome.equals(nomes[i])) {
				System.out.println("O nome "+nomes[i]+" existe na "+i+"º posição");
			}else {
				System.out.println("Não encontrado");
			}
		}
	}
}
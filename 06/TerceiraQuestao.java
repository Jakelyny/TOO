import javax.swing.JOptionPane;

/*
 * Disciplina: Tecnologia de Orienta��o a Objetos
 * Professor: Jorge Luis Boeira Bavaresco
 * Aluna: Jakelyny Sousa de Ara�jo
 * */


public class TerceiraQuestao {
	public static void main(String[] args) {
		String nomes[] = new String[10];
		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = JOptionPane.showInputDialog("Digite o "+i+"� nome");
		}
		String copiaNome = JOptionPane.showInputDialog("Qual nome deseja procurar: ");
		for (int i = 0; i < nomes.length; i++) {
			if(copiaNome.equals(nomes[i])) {
				System.out.println("O nome "+nomes[i]+" existe na "+i+"� posi��o");
			}else {
				System.out.println("N�o encontrado");
			}
		}
	}
}
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class SegundaQuestao {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
	        System.out.println("Digite a data de loca��o (dd/mm/aaaa): ");
			String a = in.nextLine();
	        Date dataLocacao = new Date();
	        dataLocacao = sdf.parse(a);
	        
	        System.out.println("Digite a data de devolu��o (dd/mm/aaaa): ");
			String b = in.nextLine();
			Date dataDevolucao = new Date();
			dataDevolucao = sdf.parse(b);
	        
	        System.out.println("Digite o valor da di�ria: ");
			double valorDiaria = in.nextDouble();
	        
	        long diferenca = dataDevolucao.getTime() - dataLocacao.getTime();
	        long miliSegundosPorDia = 24 * 60 * 60 * 1000;
	        long diasLocacao = diferenca / miliSegundosPorDia;
	        double valorTotal = (diasLocacao * valorDiaria);
	        
	        System.out.println("Valor da di�ria: " +valorDiaria);
	        System.out.println("Data de loca��o: " +sdf.format(dataDevolucao));
	        System.out.println("Data de devolu��o: " +sdf.format(dataDevolucao));
	        System.out.println("Dias de loca��o: " +diasLocacao);
	        System.out.println("Valor total da loca��o: " +valorTotal);
        }catch (Exception e ){
            System.out.println("Erro! Tipo inserido inv�lido...");
        }
	}
}

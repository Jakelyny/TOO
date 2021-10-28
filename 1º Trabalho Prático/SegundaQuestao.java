import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class SegundaQuestao {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
	        System.out.println("Digite a data de locação (dd/mm/aaaa): ");
			String a = in.nextLine();
	        Date dataLocacao = new Date();
	        dataLocacao = sdf.parse(a);
	        
	        System.out.println("Digite a data de devolução (dd/mm/aaaa): ");
			String b = in.nextLine();
			Date dataDevolucao = new Date();
			dataDevolucao = sdf.parse(b);
	        
	        System.out.println("Digite o valor da diária: ");
			double valorDiaria = in.nextDouble();
	        
	        long diferenca = dataDevolucao.getTime() - dataLocacao.getTime();
	        long miliSegundosPorDia = 24 * 60 * 60 * 1000;
	        long diasLocacao = diferenca / miliSegundosPorDia;
	        double valorTotal = (diasLocacao * valorDiaria);
	        
	        System.out.println("Valor da diária: " +valorDiaria);
	        System.out.println("Data de locação: " +sdf.format(dataDevolucao));
	        System.out.println("Data de devolução: " +sdf.format(dataDevolucao));
	        System.out.println("Dias de locação: " +diasLocacao);
	        System.out.println("Valor total da locação: " +valorTotal);
        }catch (Exception e ){
            System.out.println("Erro! Tipo inserido inválido...");
        }
	}
}

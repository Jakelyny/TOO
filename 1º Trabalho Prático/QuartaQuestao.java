import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class QuartaQuestao {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	        Date minhaData = new Date();
			System.out.println("Valor da compra: ");
			double valorCompra = in.nextDouble();
			
			System.out.println("Digite a quantidade de parcelas: ");
			int parcelas = in.nextInt();
				        
	        double tamanhoParcelas[] = new double[parcelas];
			Date dataVencimento[] = new Date[parcelas];
	        
	        System.out.println("Valor da compra: "+valorCompra);
	        System.out.println("Total de parcelas: "+parcelas);
	        long miliSegundosPorDia = 24 * 60 * 60 * 1000;
	        	        
	        for(int i = 0; i < parcelas; i++) {
	        	tamanhoParcelas[i] = (valorCompra / parcelas);
	        	dataVencimento[i] = minhaData;
	        	System.out.println("Valor da parcela: "+tamanhoParcelas[i]+" Data do "+(i+1)+"º vencimento: " +sdf.format(dataVencimento[i]));
	        	long vencimentoCalculo = (minhaData.getTime() + (miliSegundosPorDia * 30));
	        	minhaData.setTime(vencimentoCalculo);
	        }
        }catch (Exception e ){
            System.out.println("Erro! Tipo inserido inválido...");
        }
	}
}

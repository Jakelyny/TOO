import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class TerceiraQuestao {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
	        System.out.println("Digite uma data (dd/mm/aaaa): ");
			String a = in.nextLine();
	        Date dataInformada = new Date();
	        dataInformada = sdf.parse(a);
	        
	        System.out.println("Data informada: " +sdf.format(dataInformada));
	        for(int i = 0; i < 5; i++) {
	        	dataInformada.setDate(dataInformada.getDate() + 7);
	        	System.out.println("Data de pagamento: " +sdf.format(dataInformada));
	        }
        }catch (Exception e ){
            System.out.println("Erro! Tipo inserido inválido...");
        }
	}
}


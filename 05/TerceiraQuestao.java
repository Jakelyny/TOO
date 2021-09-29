import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;


public class TerceiraQuestao {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite uma data no formato (dd/mm/aaaa): ");
		String a = in.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date minhaData = new Date();

        try {
            minhaData = sdf.parse(a);
        }catch (Exception e ){
            System.out.println("Erro na conversão!");
        }
        minhaData.setDate(minhaData.getDate() + 90);
        System.out.println("Daqui há noventa dias será: " + minhaData.getDate()+ "/"+minhaData.getMonth()+ "/"+minhaData.getYear());
	}
}

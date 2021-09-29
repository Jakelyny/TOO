import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;


public class QuartaQuestao {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dataProva = new Date();
		try{
			dataProva.setDate(18);
			dataProva.setMonth(8);
			dataProva.setYear(2021);
		}catch(Exception e){
			System.out.println("Erro ao converter");
		}
		Date dataAtual = new Date();
		Date dataAux = new Date();
		dataAux.setDate(dataProva.getDate() - dataAtual.getDate());
		dataAux.setMonth(dataProva.getMonth() - dataAtual.getMonth());
		dataAux.setYear(dataProva.getYear() - dataAtual.getYear());
		
		 System.out.println("Faltam " + dataAux.getMonth() + " meses e " + dataAux.getDate() + " dias.");
	}
}

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;
/*
 * Disciplina: Tecnologia de Orienta��o a Objetos
 * Professor: Jorge Luis Boeira Bavaresco
 * Aluna: Jakelyny Sousa de Ara�jo
 * */

public class SegundaQuestao {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE, d 'de' MMMM 'de' yyyy");
		Calendar c = Calendar.getInstance();
		JOptionPane.showMessageDialog(null, "Hoje � "+ sdf.format(c.getTime()));
	}
}

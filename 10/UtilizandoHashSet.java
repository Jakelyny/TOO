import java.util.HashSet;

/*
 *  Disciplina: Tecnologia de Orienta��o a Objetos
 *  Professor: Jorge Luis Boeira Bavaresco
 *  Aluna: Jakelyny Sousa de Ara�jo
 *  
 * */

public class UtilizandoHashSet {
	
	public static void main(String[] args) {
		
		HashSet<String> nomes = new HashSet<>();
			
		nomes.add("Obi-Wan Kenobi");
		nomes.add("Yoda");
		nomes.add("Ahsoka Tano");
		nomes.add("Qui-Gon Jinn");
		nomes.add("Mace Windu");
		
		for(String s : nomes) {
			System.out.println("Jedi: "+ s);
		}
		
		System.out.println("\n----Novos jedis inclu�dos----\n");
		nomes.add("Luke Skywalker");
		nomes.add("Leia Organa");
		
		//A entrada dos elementos em HashSet n�o s�o ordenados
		for(String s : nomes) {
			System.out.println("Jedi: "+ s);
		}
	}
}



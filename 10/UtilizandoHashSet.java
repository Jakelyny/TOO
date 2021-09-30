import java.util.HashSet;

/*
 *  Disciplina: Tecnologia de Orientação a Objetos
 *  Professor: Jorge Luis Boeira Bavaresco
 *  Aluna: Jakelyny Sousa de Araújo
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
		
		System.out.println("\n----Novos jedis incluídos----\n");
		nomes.add("Luke Skywalker");
		nomes.add("Leia Organa");
		
		//A entrada dos elementos em HashSet não são ordenados
		for(String s : nomes) {
			System.out.println("Jedi: "+ s);
		}
	}
}



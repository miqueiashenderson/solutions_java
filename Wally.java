/*
 * Laboratório de Programação - Lab 01
 *
 * @Miquéias Henderson da Silva Santos - 124211400
 */
import java.util.*;

public class Wally{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while (true){
		String listaDeNomes = sc.nextLine();
		if (listaDeNomes.equals("wally")){
			break;
		}
		String ultNome = "?";
		String[] osNomes = listaDeNomes.split(" ");
		
		for (String nome : osNomes){
			if (nome.length() == 5) {
				ultNome = nome;
			}
		}
		System.out.println(ultNome);
		}

	}
}



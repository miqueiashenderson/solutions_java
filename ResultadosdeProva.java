/*
 * Laboratório de Programação - Lab 01
 *
 * @Miquéias Henderson da Silva Santos - 124211400
 */
import java.util.*;

public class ResultadosdeProva{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int contador = 0;
		int maiorNota = 0;
		int menorNota = 10001;
		int maioresAlunos = 0;
		int menoresAlunos = 0;
		int soma = 0;
		int media = 0;
		while(true){
			String entrada = sc.nextLine();
			if (entrada.equals("-")){ 
				break;
			}
			int nota = Integer.parseInt(entrada.split(" ")[1]);
			contador ++;
			soma += nota;
			if (nota >= 700) {
				maioresAlunos++;
			} else {
				menoresAlunos++;
			}

			if (nota < menorNota){ menorNota = nota;}
			if (nota > maiorNota){ maiorNota = nota;}
		}
		if (contador > 0) {
			media = soma / contador;
		
		System.out.println("maior: " + maiorNota);
		System.out.println("menor: " + menorNota);
		System.out.println("media: " + media);
		System.out.println("acima: " + maioresAlunos);
		System.out.println("abaixo: " + menoresAlunos);
	}
}
}




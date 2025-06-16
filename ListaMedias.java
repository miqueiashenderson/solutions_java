/*
 * Laboratório de Programação 2 - Lab 01
 *
 * @Miquéias Henderson da Silva Santos - 124211400
 */
import java.util.*;
public class ListaMedias {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		String[] entrada = sc.nextLine().split(" ");
		int[] array = new int[entrada.length];
		for (int i = 0; i < entrada.length; i++){
			array[i] = Integer.parseInt(entrada[i]);
		}

		int soma = 0;
		for (int valores : array){
			soma += valores;
		}
		double media = soma / array.length;
		StringJoiner resultado = new StringJoiner(" ");

		for (int valores : array) {
			if (valores > media) {
				resultado.add(String.valueOf(valores));
			}
		}

		String txt = resultado.toString();
		System.out.println(txt);
	}
}

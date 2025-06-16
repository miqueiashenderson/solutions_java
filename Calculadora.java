/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @Miquéias Henderson da Silva Santos - 124211400
 */

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char operador = sc.next().charAt(0);
		if (!(operador == '+' || operador == '-' || operador == '*' || operador == '/')) {
			System.out.println("ENTRADA INVALIDA");
		} else {
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			if (operador == '+'){
			System.out.println("RESULTADO: " + (n1 + n2));
			} else if (operador == '-') {
				System.out.println("RESULTADO: " + (n1 - n2));
			} else if (operador == '*') {
				System.out.println("RESULTADO: " + (n1 * n2));
			} else if (operador == '/') {
				if (n2 == 0) {
				System.out.println("ERRO");}
				else{
					System.out.println("RESULTADO: " + (n1 / n2));}
			}
		}
	}
}





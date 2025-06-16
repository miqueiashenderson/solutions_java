import java.util.Scanner;

public class Switchcase{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char operador = sc.next().charAt(0);
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		switch (operador) {
			case '+':
				System.out.println("RESULTADO: " + (n1 + n2));
				break;
			case '-':
				System.out.println("RESULTADO: " + (n1 - n2));
				break;
			case '*':
				System.out.println("RESULTADO: " + (n1 * n2));
				break;
			case '/':
				if (n2 == 0){
					System.out.println("ERRO");}
				else {
					System.out.println("RESULTADO: " + (n1/ n2));
				}break;
			default: System.out.println("ENTRADA INVALIDA");
				 break;
		}
	}
}


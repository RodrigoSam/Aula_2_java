package cwi.cursojava_aula7;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner digite = new Scanner(System.in);
		System.out.println("Insira um n�mero: ");
		int num1 = digite.nextInt();
		System.out.println("Insira outro n�mero: ");
		int num2 = digite.nextInt();
		int res = (num1 + num2);
		System.out.println("O Resultado de sua soma �: "+res);
	}
	

}

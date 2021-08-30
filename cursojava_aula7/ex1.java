package cwi.cursojava_aula7;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner digite = new Scanner(System.in);
		System.out.println("Insira um número: ");
		int num1 = digite.nextInt();
		System.out.println("Insira outro número: ");
		int num2 = digite.nextInt();
		int res = (num1 + num2);
		System.out.println("O Resultado de sua soma é: "+res);
	}
	

}

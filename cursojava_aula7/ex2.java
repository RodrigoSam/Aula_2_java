package cwi.cursojava_aula7;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner insira = new Scanner(System.in);
		System.out.println("Insira sua primeira nota: ");
		double n1 = insira.nextDouble();
		System.out.println("Insira sua segunda nota: ");
		double n2 = insira.nextDouble();
		System.out.println("Insira sua terceira nota: ");
		double n3 = insira.nextDouble();
		System.out.println("Insira sua quarta nota: ");
		double n4 = insira.nextDouble();
		double m = (n1+n2+n3+n4)/4;
		System.out.println("A média de suas notas foi: " + m);
	}

}

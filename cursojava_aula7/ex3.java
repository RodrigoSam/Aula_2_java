package cwi.cursojava_aula7;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner digite = new Scanner(System.in);
		System.out.print("Insira o valor de sua hora trabalhada: ");
		double salHora = digite.nextDouble();
		System.out.print("insira quantas horas você trabalha por mês: ");
		double horTrab = digite.nextDouble();
		double totSal = (salHora*horTrab);
		System.out.println("O total do seu salário foi de: R$" + totSal);
		

	}

}

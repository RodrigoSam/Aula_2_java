package cwi.cursojava_aula7;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner digite = new Scanner(System.in);
		System.out.print("Insira o valor de sua hora trabalhada: ");
		double salHora = digite.nextDouble();
		System.out.print("insira quantas horas voc� trabalha por m�s: ");
		double horTrab = digite.nextDouble();
		double totSal = (salHora*horTrab);
		System.out.println("O total do seu sal�rio foi de: R$" + totSal);
		

	}

}

package cwi.cursojava_aula9;

import java.util.Scanner;

public class ex01_programa_nota_entre0_e_10 {

	public static void main(String[] args) {
	
		Scanner digite = new Scanner(System.in);
					
		boolean valorValido = true;
		
		while (valorValido) {
		System.out.print("Insira uma nota entre 0 e 10 : ");
		int nota = digite.nextInt();
		if ((nota < 0) || (nota>10)) {
			System.out.println("voc� inseriu um n�mero inv�lido");
			System.out.println("Insira uma nota v�lida para continuar");
			continue;
					
		}
		System.out.println("Sua nota v�lida �: " + nota);
	}
	}
}

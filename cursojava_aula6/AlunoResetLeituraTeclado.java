package cwi.cursojava_aula6;

import java.util.Scanner;

public class AlunoResetLeituraTeclado {

	public static void main(String[] args) {
		Scanner digite = new Scanner(System.in);
		System.out.print("Insira seu nome completo: ");
		String nomec = digite.nextLine();
		System.out.print("Sou aluno do Level 1 do CWI Reset! Me chamo " + nomec + " Rumo ao Level 2!!!!");

	}

}

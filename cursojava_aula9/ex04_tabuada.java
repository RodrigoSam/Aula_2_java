package cwi.cursojava_aula9;

import java.util.Scanner;

public class ex04_tabuada {

	public static void main(String[] args) {
		
Scanner digite = new Scanner(System.in);
	System.out.println("Informe qual o número que você deseja multiplicar: ");
	int num = digite.nextInt();
	
	System.out.println("Tabuada do "+num+ ":");
	
	for (int i = 1; i <= 10; i++) {
		System.out.println(num+" x "+i+" = "+ num*i);		
	}
	

	}

}

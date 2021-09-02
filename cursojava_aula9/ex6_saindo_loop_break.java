package cwi.cursojava_aula9;

import java.util.Scanner;

public class ex6_saindo_loop_break {

	public static void main(String[] args) {
		Scanner digite = new Scanner(System.in);
		
		System.out.println("entre com um número: ");
		
		int num = digite.nextInt();
		
		System.out.println("entre com um limite: ");
		
		int max = digite.nextInt();
		
		for (int i = num; i <= max; i++) {
			System.out.println (i);
			
			if (i % 7 == 0) {
				System.out.println("O valor de i é : " + i);
				break;
			}
		}
		
		
		
	}

}

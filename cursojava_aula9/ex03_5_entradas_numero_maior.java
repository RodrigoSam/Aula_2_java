//faça um programa que leia 5 números e informe o maior número.


package cwi.cursojava_aula9;

import java.util.Scanner;

public class ex03_5_entradas_numero_maior {

	public static void main(String[] args) {
		Scanner digite=new Scanner(System.in);
		System.out.println("Insira um número:");
		double n1 = digite.nextDouble();
		
		System.out.println("Insira um número:");
		double n2 = digite.nextDouble();
		
		System.out.println("Insira um número:");
		double n3 = digite.nextDouble();
		
		System.out.println("Insira um número:");
		double n4 = digite.nextDouble();
		
		System.out.println("Insira um número:");
		double n5 = digite.nextDouble();
		
		if ((n1>n2) && (n1>n3) && (n1>n4) && (n1>n5)) {
			System.out.println("O número "+n1+" é o maior!");
			
		}else if ((n2>n1) && (n2>n3) && (n2>n4) && (n2>n5)) {
			System.out.println("O número "+n2+" é o maior!");
		}else if ((n3>n1) && (n3>n2) && (n3>n4) && (n3>n5)) {
			System.out.println("O número "+n3+" é o maior!");
		}else if ((n4>n1) && (n4>n3) && (n4>n3) && (n4>n5)) {
			System.out.println("O número "+n4+" é o maior!");
		}else if ((n5>n1) && (n5>n3) && (n5>n4) && (n5>n2)) {
			System.out.println("O número "+n5+" é o maior!");
		}else {
			System.out.println("Não existe número maior!");
		}
		
	}

}

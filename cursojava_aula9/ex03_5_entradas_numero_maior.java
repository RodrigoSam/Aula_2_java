//fa�a um programa que leia 5 n�meros e informe o maior n�mero.


package cwi.cursojava_aula9;

import java.util.Scanner;

public class ex03_5_entradas_numero_maior {

	public static void main(String[] args) {
		Scanner digite=new Scanner(System.in);
		System.out.println("Insira um n�mero:");
		double n1 = digite.nextDouble();
		
		System.out.println("Insira um n�mero:");
		double n2 = digite.nextDouble();
		
		System.out.println("Insira um n�mero:");
		double n3 = digite.nextDouble();
		
		System.out.println("Insira um n�mero:");
		double n4 = digite.nextDouble();
		
		System.out.println("Insira um n�mero:");
		double n5 = digite.nextDouble();
		
		if ((n1>n2) && (n1>n3) && (n1>n4) && (n1>n5)) {
			System.out.println("O n�mero "+n1+" � o maior!");
			
		}else if ((n2>n1) && (n2>n3) && (n2>n4) && (n2>n5)) {
			System.out.println("O n�mero "+n2+" � o maior!");
		}else if ((n3>n1) && (n3>n2) && (n3>n4) && (n3>n5)) {
			System.out.println("O n�mero "+n3+" � o maior!");
		}else if ((n4>n1) && (n4>n3) && (n4>n3) && (n4>n5)) {
			System.out.println("O n�mero "+n4+" � o maior!");
		}else if ((n5>n1) && (n5>n3) && (n5>n4) && (n5>n2)) {
			System.out.println("O n�mero "+n5+" � o maior!");
		}else {
			System.out.println("N�o existe n�mero maior!");
		}
		
	}

}

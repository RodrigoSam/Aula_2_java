package cwi.cursojava_aula9;

import java.util.Scanner;

public class ex02_ler_2_numeros_c_intervalo {

	public static void main(String[] args) {
	
		Scanner digite= new Scanner(System.in);
			
		boolean valorValido = true;
		
		System.out.print("Insira seu primeiro n�mero: ");
		
		int segnum = 0;
		
		int n1 = digite.nextInt();
		
		while (valorValido) {
						
			System.out.print("Insira o segundo n�mero: ");
			
			int n2 = digite.nextInt();
					
			if(n1 >= n2) {
									
			System.out.println("O segundo n�mero deve ser maior que o primeiro!");
			
			System.out.println("insira um n�mero v�lido");
			
			continue;
			
		                 }
			valorValido = false;
			
			segnum=n2;      }
		
		for (int i=n1 ; i < segnum; i++){
			if(i==n1) { 
				i+=1;
			          }
			if (segnum == n1+1 ) {
			System.out.println("N�o a numeros no intervalo");
			           break;    }
		     System.out.println(i); 
		                                 }
			                                 }
                                              }




import java.util.Scanner;


	
		public class ex01 {

			public static void main(String[] args) {
				Scanner digite = new Scanner(System.in);
				System.out.println("Insira sua primeira nota: ");
				double n1 =	digite.nextDouble();	
				System.out.println("Insira sua segunda nota: ");
				double n2 =	digite.nextDouble();
				System.out.println("Insira sua terceira nota: ");
				double n3 =	digite.nextDouble();
				System.out.println("Insira sua quarta nota: ");
				double n4 =	digite.nextDouble();
				double medNota = (n1+n2+n3+n4)/4;
				
				
				System.out.print("Sua média final foi: " + medNota); 
				
				if ((medNota <= 7)&&(medNota <=9)) {
					System.out.println(" Aluno aprovado!");
				} else if(medNota<7) {
					System.out.println(" Aluno reprovado");
				} else if (medNota == 10) {
					System.out.println(" Aluno aprovado com louvor!!");
				}else if ((medNota > 10.00) || (medNota < 0.00)){
					System.out.println(" Sua nota é inválida");
				}

			}

		}

	
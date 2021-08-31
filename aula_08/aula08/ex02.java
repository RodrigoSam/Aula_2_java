package aula08;


import java.util.Scanner;

//Faça um Programa que leia um número e exiba o dia correspondente da semana. (1=Domingo, 2=Segunda, etc.), caso seja informado um valor que não corresponda à um dia da semana, então deve imprimir a mensagem Valor inválido!.
public class ex02 {

	public static void main(String[] args) {
	Scanner digite = new Scanner(System.in);
	
	System.out.println("Insira o dia da semana: ");
	int dia = digite.nextInt();
	
	switch (dia) {
	
	case 1: System.out.println("Hoje é domingo");break;
	case 2: System.out.println("Hoje é segunda");break;
	case 3: System.out.println("Hoje é terça");break;
	case 4: System.out.println("Hoje é quarta");break;
	case 5: System.out.println("Hoje é quinta");break;
	case 6: System.out.println("Hoje é sexta");break;
	case 7: System.out.println("Hoje é sábado");break;
	default: System.out.println("Valor inválido!!");break;
	
	
	
	
	
	
	}
		
	}

}

package aula08;


import java.util.Scanner;

//Fa�a um Programa que leia um n�mero e exiba o dia correspondente da semana. (1=Domingo, 2=Segunda, etc.), caso seja informado um valor que n�o corresponda � um dia da semana, ent�o deve imprimir a mensagem Valor inv�lido!.
public class ex02 {

	public static void main(String[] args) {
	Scanner digite = new Scanner(System.in);
	
	System.out.println("Insira o dia da semana: ");
	int dia = digite.nextInt();
	
	switch (dia) {
	
	case 1: System.out.println("Hoje � domingo");break;
	case 2: System.out.println("Hoje � segunda");break;
	case 3: System.out.println("Hoje � ter�a");break;
	case 4: System.out.println("Hoje � quarta");break;
	case 5: System.out.println("Hoje � quinta");break;
	case 6: System.out.println("Hoje � sexta");break;
	case 7: System.out.println("Hoje � s�bado");break;
	default: System.out.println("Valor inv�lido!!");break;
	
	
	
	
	
	
	}
		
	}

}

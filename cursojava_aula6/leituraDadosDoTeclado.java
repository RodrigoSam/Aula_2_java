package cwi.cursojava_aula6;

import java.util.Scanner;

public class leituraDadosDoTeclado {

	public static void main(String[] args) {
    Scanner digite = new Scanner(System.in);		
/*	System.out.println("Digite seu nome completo: ");
	String nomec = digite.nextLine();
	System.out.println("Seu nome completo �: " + nomec);
	
	System.out.println("Digite seu primeiro nome: ");
	String primNome=digite.next();
	System.out.println("Seu primeiro nome �: "+  primNome);
	
	System.out.println("Digite sua idade: ");
	int id = digite.nextInt();
	System.out.println("Sua idade �: " + id);
	
	System.out.println("Digite sua altura: ");
	double alt = digite.nextDouble();
	System.out.println("Sua altura �: " + alt);*/
	
	System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem pet: ");
	String nome = digite.next();
	int id = digite.nextInt();
	byte quantfil=digite.nextByte();
	double alt=digite.nextDouble();
	boolean tempet=digite.nextBoolean();
	
	
	System.out.println("Voc� inseriu os seguintes dados: ");
	System.out.println("Seu primeiro nome �: "+nome);
	System.out.println("Sua idade �: "+id+" anos");
	System.out.println("Voc� tem: "+ quantfil+ " filhos");
	System.out.println("Sua altura � " + alt +"mts");
	System.out.println("Voc� possui pet " + tempet);
	
	
	
	
	}

}

package cwi.cursojava_aula9;

public class ex2_loop_do_while {	
public static void main(String[] args) {
	int i = 0;
	int max = 10;

System.out.println("Contando at� "+ max);

   while (i <= max) {
	System.out.println("Valor de i:" + i);
	i++; 
	}
   System.out.println(i);

 do {
	i++;
	System.out.println("Valor de i:" + i);
	} while (i < 15);

 System.out.println(i);


}
}
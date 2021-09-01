package cwi.cursojava_aula9;

import java.util.Scanner;

class Exercicio1Aula9 {

    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);
        System.out.println("Informe uma nota entre zero e dez: ");

        boolean notaValida = false;
        do {
            double nota = digite.nextDouble();
            if (nota >= 0 && nota <= 10) {
                notaValida = true;
                System.out.println("Nota válida: " + nota);
            } else {
                System.out.println("Nota inválida! Informe uma nota entre zero e dez.");
            }

        } while (!notaValida);

    }

}

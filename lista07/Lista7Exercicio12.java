package lista07;

import java.util.Scanner;

public class Lista7Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int maior = 0;
        int menor = 0;
        boolean primeiroNumero = true;

        System.out.println("Digite números inteiros positivos. Digite um número negativo para parar.");

        while (numero >= 0) {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();

            if (numero >= 0) {
                if (primeiroNumero) {
                    maior = numero;
                    menor = numero;
                    primeiroNumero = false;
                } else {
                    if (numero > maior) {
                        maior = numero;
                    }

                    if (numero < menor) {
                        menor = numero;
                    	}
               }
            }
      }

        if (primeiroNumero) {
            System.out.println("Nenhum número positivo foi digitado.");
        } else {
            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);
        }

        sc.close();
    }
}

package lista07;

import java.util.Scanner;

public class Lista7Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int contador = 0;
		
		while (contador<=100) {
			contador++;
		}
		
		int soma = contador * 100;
				
		System.out.println("A soma dos 100 primeiros numeros é igual á: " +(soma / 2));
		

		sc.close();
	}

}

package lista07;

import java.util.Scanner;

public class Lista7Exercicio10 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int contadora = 50;
		int soma = 50;
		int contador = 0;
		
		while(contadora <= 70) {
			contadora++;
			contador++;
			
			if(contadora % 2 == 0) {
				soma += contadora;
			}			
		}
		int media = soma / contador;
		
		//resultado da soma 660			
		System.out.println("A soma dos valores de 50 a 70 pares é: " +soma);
		System.out.println("A média da soma entre os numero 50 a 70 pares é: " +media);			
		
		System.out.println();
		


		sc.close();
	}
	
}


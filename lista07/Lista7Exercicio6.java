package lista07;

import java.util.Scanner;

public class Lista7Exercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("resultado das potencias de 3.");
		System.out.println("Digite o numero da base: ");
		int base = sc.nextInt();
		
		System.out.println("Digite o valor do expoente: ");
		int expoente = sc.nextInt();
			
			double resultado = Math.pow(base, expoente);
			
			
				System.out.println(base+ " elevado a " +expoente+ " é igual a: "+resultado);				
			
			
			
		
		sc.close();
	}

}

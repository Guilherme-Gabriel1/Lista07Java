package lista07;

import java.util.Scanner;

public class Lista7Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("resultado das potencias de 3.");
		
		int contadora = 0;
		
		while(contadora < 16) {
			contadora++;
			
			double resultado = Math.pow(3, contadora);
			
			if(contadora == 0) {
				System.out.println("3 elevado a " +contadora+ " é igual a: 1");
			}else {
				System.out.println("3 elevado a " +contadora+ " é igual a: "+resultado);				
			}
			
			
		}
		sc.close();
	}

}

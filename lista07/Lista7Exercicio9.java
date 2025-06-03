package lista07;

import java.util.Scanner;

public class Lista7Exercicio9 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int contadora = 1;
		int soma = 0;
		
		while(contadora < 11) {
			System.out.println("digite o número " +contadora);
			int numero = sc.nextInt();
			soma += numero;
				
			contadora++;
			}
			int media = soma / 10;
			
			System.out.println("A soma dos números digitado é: " +soma);
			System.out.println("A média aritmética dos números digitados é: " +media);
			
		sc.close();
		}
	}



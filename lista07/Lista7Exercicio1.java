package lista07;

import java.util.Scanner;

public class Lista7Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero para descobrir a tabuada de 1 à 10: ");
		int numero = sc.nextInt();
		
		int contador = 1;
		
		while(contador<11) {

		System.out.println(+numero+ " X " +contador+ " = "+(numero * contador));
		contador ++;
		}
		
		
		
		sc.close();
	}

}

package lista07;

import java.util.Scanner;

public class Lista7Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Números impares até 20.");
		
		int contadora = 0;
		
		while(contadora < 20) {
			
		contadora++;

		if(contadora % 2 != 0) {	
			System.out.println(contadora);
		}
		}

		sc.close();
	}

}

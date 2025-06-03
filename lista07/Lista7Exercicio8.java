package lista07;

public class Lista7Exercicio8 {

	public static void main(String[] args) {
					
		float celsius = 10;
		
		while(celsius < 101) {
			
			double fahrenheit = (celsius * 9/5) +32;
			System.out.println(celsius+ " = " +fahrenheit);
			celsius += 10; 
		}

	}

}

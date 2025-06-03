package lista07;

import java.util.Scanner;

public class Lista7Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double areaComodo = 0;
        double largura = 0;
        double comprimento = 0;
        double areaTotal = 0;
        String resposta;

        do {
            System.out.print("Digite o nome do cômodo: ");
            String nome = sc.next();

            System.out.print("Digite a largura do cômodo: ");
            largura = sc.nextDouble();

            System.out.print("Digite o comprimento do cômodo: ");
            comprimento = sc.nextDouble();

            areaComodo = largura * comprimento;
            areaTotal += areaComodo;

            System.out.println("Área do " + nome + ": " + areaComodo + " m²");

            System.out.print("Deseja adicionar outro cômodo? (digite 'não' para sair): ");
            sc.nextLine();
            resposta = sc.nextLine();

        } while (!resposta.equalsIgnoreCase("não"));

        System.out.println("Área total da residência: " + areaTotal + " m²");

        sc.close();
    }
}



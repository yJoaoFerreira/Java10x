package Desafios;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = 0;
        int contador = 0;

        System.out.println("Quantos cadastros você quer fazer? ");
        int cadastros = scanner.nextInt();

        String[] nome = new String[cadastros];
        int[] idade = new int[cadastros];

        while (number != 3) {
            System.out.println("----- CRUD Ninja -----");
            System.out.println("[1] Cadastrar Ninja");
            System.out.println("[2] Listar Ninjas");
            System.out.println("[3] Sair da Aplicação");
            System.out.println("----------------------");
            System.out.println("Opção: ");
            number = scanner.nextInt();

            scanner.nextLine();

            switch (number) {
                case 1:
                    System.out.println("Digite o nome do ninja que vai ser cadastrado: ");
                    nome[contador] = scanner.nextLine();

                    System.out.println("Digite a idade do ninja " + nome[contador] + ":");
                    idade[contador] = scanner.nextInt();

                    System.out.println("Sucesso: O Ninja #" + (contador+1) + " " + nome[contador] + " de " + idade[contador] + " anos foi cadastrado.");
                    contador++;
                    break;
                case 2:
                    System.out.println("----- Lista de Ninjas -----");
                    for (int i = 0; i < contador; i++) {
                        System.out.println("Ninja #" + (i+1) + ": " + nome[i] + " tem " + idade[i] + " anos.");
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Erro: Número inválido...");
                    break;
            }
        }

        scanner.close();
    }
}

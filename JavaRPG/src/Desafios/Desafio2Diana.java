package Desafios;

import java.util.Scanner;

public class Desafio2Diana {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = 0;
        int contador = 0;

        System.out.println("Quantos cadastros você quer fazer? ");
        int cadastros = scanner.nextInt();

        String[] nome = new String[cadastros];
        int[] idade = new int[cadastros];

        while (number != 5) {
            System.out.println("----- CRUD Ninja -----");
            System.out.println("[1] Cadastrar Ninja");
            System.out.println("[2] Listar Ninjas");
            System.out.println("[3] Atualizar Cadastro");
            System.out.println("[4] Excluir Ninja");
            System.out.println("[5] Sair da Aplicação");
            System.out.println("----------------------");
            System.out.println("Opção: ");
            number = scanner.nextInt();

            scanner.nextLine();

            switch (number) {
                case 1: // Create
                    System.out.println("Digite o nome do ninja que vai ser cadastrado: ");
                    nome[contador] = scanner.nextLine();

                    System.out.println("Digite a idade do ninja " + nome[contador] + ":");
                    idade[contador] = scanner.nextInt();

                    System.out.println("Sucesso: O Ninja #" + (contador+1) + " " + nome[contador] + " de " + idade[contador] + " anos foi cadastrado.");
                    contador++;
                    break;
                case 2: // Read
                    System.out.println("----- Lista de Ninjas -----");
                    for (int i = 0; i < contador; i++) {
                        if (nome[i] != null) {
                            System.out.println("Ninja #" + (i+1) + ": " + nome[i] + " tem " + idade[i] + " anos.");
                        }
                    }
                    break;
                case 3: // Update
                    for (int j = 0; j < contador; j++) {
                        if (nome[j] != null) {
                            System.out.println("Ninja #" + (j + 1) + ": " + nome[j] + " tem " + idade[j] + " anos.");
                        } else {
                            System.out.println("Ninja #" + (j + 1) + ": Vazio");
                        }
                    }

                    System.out.println("Qual ninja deseja atualizar? Digite [0] para sair.");
                    int updateNumber = scanner.nextInt();

                    scanner.nextLine();

                    if (updateNumber != 0 && updateNumber <= contador) {
                        System.out.println("Digite o novo nome: ");
                        nome[updateNumber - 1] = scanner.nextLine();

                        System.out.println("Digite a nova idade: ");
                        idade[updateNumber - 1] = scanner.nextInt();
                    }

                    break;
                case 4: // Delete
                    for (int k = 0; k < contador; k++) {
                        if (nome[k] != null) {
                            System.out.println("Ninja #" + (k + 1) + ": " + nome[k] + " tem " + idade[k] + " anos.");
                        }
                    }

                    System.out.println("Qual ninja deseja apagar? Digite [0] para sair.");
                    int deleteNumber = scanner.nextInt();

                    if (deleteNumber != 0 && deleteNumber <= contador) {
                        nome[deleteNumber - 1] = null;
                        idade[deleteNumber - 1] = 0;
                    }

                    break;
                case 5:
                    break;
                default:
                    System.out.println("Erro: Número inválido...");
                    break;
            }
        }

        scanner.close();
    }
}
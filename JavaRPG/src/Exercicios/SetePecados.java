package Exercicios;

import java.util.Scanner;

public class SetePecados {
    public static void main(String[] args) {

        /* Objetivo:
        * eu quero um programa que permita adicionar os nomes e generos dos 7 pecados capitais.... // check
        * O programa deve ter mostrar primeiro apenas os homens e depois só as mulheres desse grupo // check
        * convem usar for e array boa sorte amor // check
        * */

        Scanner scanner = new Scanner(System.in);

        String[] name = new String[7];
        String[] gender = new String[7];

        for (int i = 0; i < 7 ; i++) {
            System.out.println("Digite o nome do pecado: ");
            name[i] = scanner.nextLine();

            System.out.println("Digite o gênero do pecado (M/F): ");
            gender[i] = scanner.nextLine();
        }

        System.out.println("----------------------------------------");

        for (int j = 0; j < 7; j++) {
            if (gender[j].equalsIgnoreCase("M")) {
                System.out.println(name[j] + " é um homem");
            }
        }

        for (int k = 0; k < 7; k++) {
            if (gender[k].equalsIgnoreCase("F")) {
                System.out.println(name[k] + " é uma mulher");
            }
        }
        scanner.close();
    }
}
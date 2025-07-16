package Condicoes;

import java.util.Scanner;

public class LacoRepeticao {
    public static void main(String[] args) {
        /*
        * Laços de Repetição: Vão repetir infinitamente ou até você atingir o parâmetro escolhido.
        * While | For
        * */

        // while (condição verdadeira) {o que vai acontecer}
        //for (var inicial; condição verdadeira; incremento) {o que vai acontecer}

        Scanner scanner = new Scanner(System.in);

        int cloneNumber = 0;

        System.out.println("Digite o nome do seu ninja: ");
        String name = scanner.nextLine();

        System.out.println("Digite o número máximo de clones: ");
        int cloneMax = scanner.nextInt();

        while (cloneNumber <= cloneMax) {
            System.out.println("Número de clones: " + cloneNumber);
            cloneNumber++;
        }

        System.out.println("---------------------------------");

        for (int i = 1; i <= cloneMax; i++) {
            System.out.println(name + " se clonou " + i + "x...");
        }

        System.out.println("---------------------------------");

        System.out.println(name + " desmaiou por falta de chakra");

        scanner.close();
    }
}

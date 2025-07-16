package Condicoes;

import java.util.Scanner;

public class CustoMana {
    public static void main(String[] args) {
        /*
        * Objetivo: Calcular quantos clones são feitos e dizer a quantia de mana gasta.
        * */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Mana: ");
        int mana = scanner.nextInt();

        System.out.println("Custo de Mana (Cada Clone): ");
        int custoMana = scanner.nextInt();

        int clonesInicial = 0;

        System.out.println("Total de Clones: ");
        int clonesFinal = scanner.nextInt();

        int maxClones = mana / custoMana;

        if (maxClones >= clonesFinal) {
            while (clonesInicial < clonesFinal) {
                System.out.println("🌀 Invocando clone nº " + (clonesInicial+1) + "...");
                clonesInicial++;

                mana = mana - custoMana;
                System.out.println("💧 Mana restante: " + mana);
                
                System.out.println("------------------------------------");

            /* for (clonesInicial = 0; clonesInicial <= clonesFinal; clonesInicial++) {
               System.out.println("Quantia de clones: " + clonesInicial);
               System.out.println("Quantia de mana: " + mana);
               System.out.println("------------------------------------");
               mana = mana - custoMana;
            }*/
            }
        } else {
            System.out.println("Você não tem mana pra isso!");
        }

        scanner.close();
    }
}

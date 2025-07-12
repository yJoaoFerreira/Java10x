package Condicoes;

import java.util.Scanner;

public class UserScanner {
    /*
    * Scanner = É um jeito de trazer o usuário para dentro da aplicação.
    * Objetivo: O usuário vai criar um herói e vamos validar os dados.
    * */

    public static void main(String[] args) {
        // Abrir o Scanner
        Scanner HeroInfos = new Scanner(System.in);

        // Receber uma String
        System.out.print("Digite o nome do seu herói: ");
        String HeroName = HeroInfos.nextLine();

        // Receber um Int
        System.out.print("Digite a idade do seu herói: ");
        int HeroAge = HeroInfos.nextInt();

        HeroInfos.nextLine(); // Limpar o Buffer

        System.out.print("Digite a quirk do seu herói: ");
        String HeroQuirk = HeroInfos.nextLine();

        // Tratamento de Dados
        if (HeroAge >= 18) {
            System.out.println("Esse herói já é maior de idade.");
        } else {
            System.out.println("Esse herói é muito novo ainda.");
        }

        System.out.println("--------------------");
        System.out.println("Nome: " + HeroName);
        System.out.println("Idade: " + HeroAge);
        System.out.println("Quirk: " + HeroQuirk);
        System.out.println("--------------------");

        // Fechar o Scanner
        HeroInfos.close();
    }
}

package Condicoes;

/*
* If & Else = Condições de verdade ou mentira apenas.
* Switch = Caso algo específico aconteça.
* Objetivo = Deixar o usuário escrever qual personagem
* ele quer escolher. Ex: Naruto, Sasuke, Sakura.
* */

import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {
        Scanner ChooseNNT = new Scanner(System.in);

        System.out.println("----- Seleção de Personagens ------");
        System.out.println("[0] Nenhum");
        System.out.println("[1] Meliodas");
        System.out.println("[2] Ban");
        System.out.println("[3] Diane");
        System.out.println("[4] King");
        System.out.println("[5] Gowther");
        System.out.println("[6] Merlin");
        System.out.println("[7] Escanor");
        System.out.println("[8] Elizabeth");
        System.out.println("[9] Hawk");
        System.out.println("-----------------------------------");

        System.out.println("Qual personagem você irá escolher?");
        int Personagem = ChooseNNT.nextInt();

        // Reação ao escolher um Personagem
        switch (Personagem) {
            case 0:
                System.out.println("Usuário escolheu nenhum personagem.");
                break;
            case 1:
                System.out.println("Usuário escolheu Demônio Meliodas.");
                break;
            case 2:
                System.out.println("Usuário escolheu Humano Ban.");
                break;
            case 3:
                System.out.println("Usuário escolheu Gigante Diane.");
                break;
            case 4:
                System.out.println("Usuário escolheu Fada King.");
                break;
            case 5:
                System.out.println("Usuário escolheu Boneco Gowther.");
                break;
            case 6:
                System.out.println("Usuário escolheu Humana Merlin.");
                break;
            case 7:
                System.out.println("Usuário escolheu Humano Escanor.");
                break;
            case 8:
                System.out.println("Usuário escolheu Deusa Elizabeth.");
                break;
            case 9:
                System.out.println("Usuário escolheu Porco Hawk.");
                break;
            default:
                System.out.println("Você não digitou uma resposta válida. Tente de novo!");
                break;
        }

        ChooseNNT.close();
    }
}

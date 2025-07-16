package Exercicios;

import java.util.Scanner;

public class JogoDaVelha2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] jogador = new String[3];
        System.out.println("Jogador X: "); jogador[0] = scanner.nextLine();
        System.out.println("Jogador O: "); jogador[1] = scanner.nextLine();
        jogador[2] = "Empate";

        int menu = 0;
        int[] placar = new int[2];
        String[] letra = new String[2];
        letra[0] = "X"; letra[1] = "O";
        int jogada = 0;

        while (menu != 3) {
            System.out.println(
                    """
                    ---------- Jogo da Velha ----------
                      [1] - Novo Jogo
                      [2] - Ver Placar
                      [3] - Sair
                    -----------------------------------
                    >> Opção Selecionada:
                    """
            ); menu = scanner.nextInt();

            switch (menu) {
                case 1: // Lógica do jogo
                    String[][] position = new String[3][3];
                    position[0][0] = "1"; position[0][1] = "2"; position[0][2] = "3";
                    position[1][0] = "4"; position[1][1] = "5"; position[1][2] = "6";
                    position[2][0] = "7"; position[2][1] = "8"; position[2][2] = "9";

                    String vencedor = null; int turno = 0;
                    System.out.println("Novo Jogo Iniciado!");

                    while (vencedor == null && turno <= 9) {
                        turno++;

                        System.out.println("Turno: " + turno);
                        show(position);

                        int selectJogador = turno % 2;

                        System.out.println("Vez do(a) jogador(a) " + jogador[selectJogador] + "! Onde você irá jogar?"); jogada = scanner.nextInt();
                        System.out.println("O(A) jogador(a) " + jogador[selectJogador] + " colocou o " + letra[selectJogador] + " na posição " + jogada);

                            switch (jogada) {
                                case 1:
                                    if ((position[0][0] == "1")) {
                                        position[0][0] = letra[selectJogador];
                                    } else {
                                        System.out.println("Já jogaram aí, vacilão!");
                                        turno--;
                                    }
                                    break;
                                case 2:
                                    if ((position[0][1] == "2")) {
                                        position[0][1] = letra[selectJogador];
                                    } else {
                                        System.out.println("Já jogaram aí, vacilão!");
                                        turno--;
                                    }
                                    break;
                                case 3:
                                    if ((position[0][2] == "3")) {
                                        position[0][2] = letra[selectJogador];
                                    } else {
                                        System.out.println("Já jogaram aí, vacilão!");
                                        turno--;
                                    }
                                    break;
                                case 4:
                                    if ((position[1][0] == "4")) {
                                        position[1][0] = letra[selectJogador];
                                    } else {
                                        System.out.println("Já jogaram aí, vacilão!");
                                        turno--;
                                    }
                                    break;
                                case 5:
                                    if ((position[1][1] == "5")) {
                                        position[1][1] = letra[selectJogador];
                                    } else {
                                        System.out.println("Já jogaram aí, vacilão!");
                                        turno--;
                                    }
                                    break;
                                case 6:
                                    if ((position[1][2] == "6")) {
                                        position[1][2] = letra[selectJogador];
                                    } else {
                                        System.out.println("Já jogaram aí, vacilão!");
                                        turno--;
                                    }
                                    break;
                                case 7:
                                    if ((position[2][0] == "7")) {
                                        position[2][0] = letra[selectJogador];
                                    } else {
                                        System.out.println("Já jogaram aí, vacilão!");
                                        turno--;
                                    }
                                    break;
                                case 8:
                                    if ((position[2][1] == "8")) {
                                        position[2][1] = letra[selectJogador];
                                    } else {
                                        System.out.println("Já jogaram aí, vacilão!");
                                        turno--;
                                    }
                                    break;
                                case 9:
                                    if ((position[2][2] == "9")) {
                                        position[2][2] = letra[selectJogador];
                                    } else {
                                        System.out.println("Já jogaram aí, vacilão!");
                                        turno--;
                                    }
                                    break;
                                default:
                                    System.out.println("Casa inválida!");
                                    break;
                            }

                        for (int i = 0; i < 3; i++) {
                            if (position[0][i] == letra[selectJogador] && position[1][i] == letra[selectJogador] && position[2][i] == letra[selectJogador]) {
                                vencedor = jogador[selectJogador];
                                placar[selectJogador]++;
                                System.out.println("Jogo Finalizado!");
                                System.out.println("O Vencedor Foi: " + jogador[selectJogador]);
                            }
                        }

                        for (int k = 0; k < 3; k++) {
                            if (position[k][0] == letra[selectJogador] && position[k][1] == letra[selectJogador] && position[k][2] == letra[selectJogador]) {
                                vencedor = jogador[selectJogador];
                                placar[selectJogador]++;
                                System.out.println("Jogo Finalizado!");
                                System.out.println("O Vencedor Foi: " + jogador[selectJogador]);
                            }
                        }
                        
                        if (position[0][0] == letra[selectJogador] && position[1][1] == letra[selectJogador] && position[2][2] == letra[selectJogador]) {
                            vencedor = jogador[selectJogador];
                            placar[selectJogador]++;
                            System.out.println("Jogo Finalizado!");
                            System.out.println("O Vencedor Foi: " + jogador[selectJogador]);
                        }

                        if (position[0][2] == letra[selectJogador] && position[1][1] == letra[selectJogador] && position[2][0] == letra[selectJogador]) {
                            vencedor = jogador[selectJogador];
                            placar[selectJogador]++;
                            System.out.println("Jogo Finalizado!");
                            System.out.println("O Vencedor Foi: " + jogador[selectJogador]);
                        }

                        if (turno == 9 && vencedor == null) {
                            System.out.println("Vocês empataram!");
                            vencedor = jogador[2];
                            break;
                        }
                    }
                    break;
                case 2: // Ver o placar do jogo
                    System.out.println("----------- Placar -----------");
                    System.out.println("Jogador(a) " + jogador[0] + ": " + placar[0]);
                    System.out.println("Jogador(a) " + jogador[1] + ": " + placar[1]);
                    break;
                case 3: // Sair do jogo
                    System.out.println("Finalizando Aplicação...");
                    break;
                default: // Tratamento de erro
                    System.out.println("Opção Inválida!");
                    break;
            }
        }
        scanner.close();
    }

    public static void show(String position[][]) {
        System.out.println(position[0][0] + " | " + position[0][1] + " | " + position[0][2]);
        System.out.println(position[1][0] + " | " + position[1][1] + " | " + position[1][2]);
        System.out.println(position[2][0] + " | " + position[2][1] + " | " + position[2][2]);
    }
}
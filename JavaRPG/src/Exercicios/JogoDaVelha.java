package Exercicios;

import java.util.Objects;
import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[][] pos = new String[3][3];

        pos[0][0] = "1";
        pos[0][1] = "2";
        pos[0][2] = "3";

        pos[1][0] = "4";
        pos[1][1] = "5";
        pos[1][2] = "6";

        pos[2][0] = "7";
        pos[2][1] = "8";
        pos[2][2] = "9";

        int menu = 0;
        int winnerX = 0;
        int winnerO = 0;

        String[] jogador = new String[2];

        System.out.println("Quem será o(a) jogador(a) X? ");
        jogador[0] = scanner.nextLine();
        System.out.println("O(A) jogador(a) X se chama: " + jogador[0]);

        System.out.println("Quem será o(a) jogador(a) O? ");
        jogador[1] = scanner.nextLine();
        System.out.println("O(A) jogador(a) O se chama: " + jogador[1]);

        while (menu != 3) {
            System.out.println(
                            """
                            ---------- Jogo da Velha ---------
                            [1] - Novo Jogo
                            [2] - Ver Placar
                            [3] - Sair
                            ----------------------------------
                            >> Opção Selecionada:
                            """
            );

            menu = scanner.nextInt();

            switch (menu) {
                case 1: // Jogo
                    int respostaX = 0;
                    int respostaO = 0;

                    int turno = 1;
                    String winnerName = null;


                    while (winnerName == null && turno < 9) {

                        System.out.println("Turno: " + turno);

                        System.out.println(pos[0][0] + " " + pos[0][1] + " " + pos[0][2]);
                        System.out.println(pos[1][0] + " " + pos[1][1] + " " + pos[1][2]);
                        System.out.println(pos[2][0] + " " + pos[2][1] + " " + pos[2][2]);

                        System.out.println("Vez do(a) Jogador(a): " + jogador[0]);
                        respostaX = scanner.nextInt();
                        turno++;

                        switch (respostaX) {
                            case 1:
                                pos[0][0] = "X";
                                break;
                            case 2:
                                pos[0][1] = "X";
                                break;
                            case 3:
                                pos[0][2] = "X";
                                break;
                            case 4:
                                pos[1][0] = "X";
                                break;
                            case 5:
                                pos[1][1] = "X";
                                break;
                            case 6:
                                pos[1][2] = "X";
                                break;
                            case 7:
                                pos[2][0] = "X";
                                break;
                            case 8:
                                pos[2][1] = "X";
                                break;
                            case 9:
                                pos[2][2] = "X";
                                break;
                            default:
                                break;
                        }

                        System.out.println("Turno: " + turno);

                        System.out.println(pos[0][0] + " " + pos[0][1] + " " + pos[0][2]);
                        System.out.println(pos[1][0] + " " + pos[1][1] + " " + pos[1][2]);
                        System.out.println(pos[2][0] + " " + pos[2][1] + " " + pos[2][2]);

                        System.out.println("Vez do(a) jogador(a): " + jogador[1]);
                        respostaO = scanner.nextInt();
                        turno++;

                        switch (respostaO) {
                            case 1:
                                pos[0][0] = "O";
                                break;
                            case 2:
                                pos[0][1] = "O";
                                break;
                            case 3:
                                pos[0][2] = "O";
                                break;
                            case 4:
                                pos[1][0] = "O";
                                break;
                            case 5:
                                pos[1][1] = "O";
                                break;
                            case 6:
                                pos[1][2] = "O";
                                break;
                            case 7:
                                pos[2][0] = "O";
                                break;
                            case 8:
                                pos[2][1] = "O";
                                break;
                            case 9:
                                pos[2][2] = "O";
                                break;
                            default:
                                break;
                        }

                        if (Objects.equals(pos[0][0], "X") && Objects.equals(pos[0][1], "X") && Objects.equals(pos[0][2], "X")) {
                            winnerName = jogador[0];
                            System.out.println("Vencedor: " + winnerName);
                            winnerX++;
                        } else if (Objects.equals(pos[1][0], "X") && Objects.equals(pos[1][1], "X") && Objects.equals(pos[1][2], "X")) {
                            winnerName = jogador[0];
                            System.out.println("Vencedor: " + winnerName);
                            winnerX++;
                        } else if (Objects.equals(pos[2][0], "X") && Objects.equals(pos[2][1], "X") && Objects.equals(pos[2][2], "X")) {
                            winnerName = jogador[0];
                            System.out.println("Vencedor: " + winnerName);
                            winnerX++;
                        } else if (Objects.equals(pos[0][0], "X") && Objects.equals(pos[1][0], "X") && Objects.equals(pos[2][0], "X")) {
                            winnerName = jogador[0];
                            System.out.println("Vencedor: " + winnerName);
                            winnerX++;
                        } else if (Objects.equals(pos[0][1], "X") && Objects.equals(pos[1][1], "X") && Objects.equals(pos[2][1], "X")) {
                            winnerName = jogador[0];
                            System.out.println("Vencedor: " + winnerName);
                            winnerX++;
                        } else if (Objects.equals(pos[0][2], "X") && Objects.equals(pos[1][2], "X") && Objects.equals(pos[2][2], "X")) {
                            winnerName = jogador[0];
                            System.out.println("Vencedor: " + winnerName);
                            winnerX++;
                        } else if (Objects.equals(pos[0][0], "X") && Objects.equals(pos[1][1], "X") && Objects.equals(pos[2][2], "X")) {
                            winnerName = jogador[0];
                            System.out.println("Vencedor: " + winnerName);
                            winnerX++;
                        } else if (Objects.equals(pos[0][2], "X") && Objects.equals(pos[1][1], "X") && Objects.equals(pos[2][0], "X")) {
                            winnerName = jogador[0];
                            System.out.println("Vencedor: " + winnerName);
                            winnerX++;
                        } else {
                            System.out.println("Empate!");
                            break;
                        }

                        if (Objects.equals(pos[0][0], "O") && Objects.equals(pos[0][1], "O") && Objects.equals(pos[0][2], "O")) {
                            winnerName = jogador[1];
                            System.out.println("Vencedor: " + winnerName);
                            winnerO++;
                        } else if (Objects.equals(pos[1][0], "O") && Objects.equals(pos[1][1], "O") && Objects.equals(pos[1][2], "O")) {
                            winnerName = jogador[1];
                            System.out.println("Vencedor: " + winnerName);
                            winnerO++;
                        } else if (Objects.equals(pos[2][0], "O") && Objects.equals(pos[2][1], "O") && Objects.equals(pos[2][2], "O")) {
                            winnerName = jogador[1];
                            System.out.println("Vencedor: " + winnerName);
                            winnerO++;
                        } else if (Objects.equals(pos[0][0], "O") && Objects.equals(pos[1][0], "O") && Objects.equals(pos[2][0], "O")) {
                            winnerName = jogador[1];
                            System.out.println("Vencedor: " + winnerName);
                            winnerO++;
                        } else if (Objects.equals(pos[0][1], "O") && Objects.equals(pos[1][1], "O") && Objects.equals(pos[2][1], "O")) {
                            winnerName = jogador[1];
                            System.out.println("Vencedor: " + winnerName);
                            winnerO++;
                        } else if (Objects.equals(pos[0][2], "O") && Objects.equals(pos[1][2], "O") && Objects.equals(pos[2][2], "O")) {
                            winnerName = jogador[1];
                            System.out.println("Vencedor: " + winnerName);
                            winnerO++;
                        } else if (Objects.equals(pos[0][0], "O") && Objects.equals(pos[1][1], "O") && Objects.equals(pos[2][2], "O")) {
                            winnerName = jogador[1];
                            System.out.println("Vencedor: " + winnerName);
                            winnerO++;
                        } else if (Objects.equals(pos[0][2], "O") && Objects.equals(pos[1][1], "O") && Objects.equals(pos[2][0], "O")) {
                            winnerName = jogador[1];
                            System.out.println("Vencedor: " + winnerName);
                            winnerO++;
                        } else {
                            System.out.println("Empate!");
                            break;
                        }
                    }

                    break;
                case 2: // Pontuação
                    System.out.println("O(A) jogador(a) "  + jogador[0] + " venceu um total de: " + winnerX + " vezes.");
                    System.out.println("O(A) jogador(a) "  + jogador[1] + " venceu um total de: " + winnerO + " vezes.");

                    break;
                case 3:
                    System.out.println("Fim do jogo: Até a próxima!");
                    break;
                default:
                    System.out.println("Opção Inválida: Escolha de 1 a 3!");
                    break;
            }
        }

        scanner.close();
    }
}

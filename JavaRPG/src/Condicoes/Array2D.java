package Condicoes;

public class Array2D {
    public static void main(String[] args) {

        String[][] ninjasAldeias = new String[3][3];

        ninjasAldeias[0][0] = "Konoha";
        ninjasAldeias[0][1] = "Naruto Uzumaki";
        ninjasAldeias[0][2] = "Sasuke Uchiha";

        ninjasAldeias[1][0] = "Névoa";
        ninjasAldeias[1][1] = "Zabuza";
        ninjasAldeias[1][2] = "Haku";

        ninjasAldeias[2][0] = "Deserto";
        ninjasAldeias[2][1] = "Gaara";
        ninjasAldeias[2][2] = "Temari";

        for (int i = 0; i < ninjasAldeias.length; i++) {
            System.out.println("Aldeia: " + ninjasAldeias[i][0]);

            for (int j = 1; j < ninjasAldeias[i].length; j++) {
                System.out.println("Ninja: " + ninjasAldeias[i][j]);
            }
        }
    }
}

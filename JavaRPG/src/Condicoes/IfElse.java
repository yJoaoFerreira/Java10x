package Condicoes;

public class IfElse {
    public static void main(String[] args) {
        /*
         * Objetivo: Passar um caçador de nível utilizando o número de missões.
         * Utilizando o IF e Else, com condições.
         * Else If (Meio Termo)
         * */

        // Caçador Sung
        String Nome = "Sung Jin Woo";
        String Rank = "Nulo";
        short Dungeons = 250;
        int Idade = 31;
        boolean Nacional;

        if (Dungeons > 0 && Dungeons < 5 && Idade >= 15){
            Rank = "Rank E";
            Nacional = false;
        } else if (Dungeons >= 5 && Dungeons < 10 && Idade >= 18) {
            Rank = "Rank D";
            Nacional = false;
        } else if (Dungeons >= 10 && Dungeons < 25 && Idade >= 20) {
            Rank = "Rank C";
            Nacional = false;
        } else if (Dungeons >= 25 && Dungeons < 50 && Idade >= 22) {
            Rank = "Rank B";
            Nacional = false;
        } else if (Dungeons >= 50 && Dungeons < 100 && Idade >= 24) {
            Rank = "Rank A";
            Nacional = false;
        } else if (Dungeons >= 100 && Dungeons < 250 && Idade >= 26) {
            Rank = "Rank S";
            Nacional = false;
        } else if (Dungeons >= 250 && Idade >= 28) {
            Rank = "Rank S Nacional";
            Nacional = true;
        } else {
            Rank = "Desconhecido";
            Nacional = false;
        }

        System.out.println(Nome + " está no " + Rank);
        System.out.println("Status Nacional: " + (Nacional ? "Sim" : "Não"));
    }
}
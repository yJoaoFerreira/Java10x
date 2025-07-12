package Condicoes;

public class Ternarios {

    /*
    * Ternários: uma forma de reduzir o código de um if & else convencionais.
    * Variável = (Condição) ? ValorVerdadeiro : ValorFalso;
    * ? = If | : = Else
    * */

    public static void main(String[] args) {
        short missionNumber = 11;
        String level = (missionNumber >= 10) ? "Esse ninja está com mais de dez missões" : "Esse ninja tem menos de dez missões";
        System.out.println(level);
    }
}

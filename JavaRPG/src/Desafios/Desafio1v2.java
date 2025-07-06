package Desafios;

public class Desafio1v2 {
    public static void main(String[] args) {
        Hunter SungJinWoo = new Hunter("Sung Jin Woo", 24, 'E', "Apagar o Fogo", 'S', true);
        SungJinWoo.molde();

        Hunter SungSuHo = new Hunter("Sung Su-Ho", 8, 'E', "Gatinho Perdido", 'S', true);
        SungSuHo.molde();

        Hunter ChaHaeIn = new Hunter("Cha Hae In", 23, 'S', "Acender o Fogo",  'S', true);
        ChaHaeIn.molde();

        Hunter ThomasAndre = new Hunter("Thomas André", 45, 'S', "Ser Rebocado", 'S', true);
        ThomasAndre.molde();

        Hunter GotoRyuji = new Hunter("Goto Ryuji", 35, 'S', "Ser Foda", 'S', false);
        GotoRyuji.molde();
    }
}

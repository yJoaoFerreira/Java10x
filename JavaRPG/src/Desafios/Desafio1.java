package Desafios;

public class Desafio1 {
    public static void main(String[] args) {
        String Nome1 = "Naruto Uzumaki";
        int Idade1 = 33;
        String NomeMissao1 = "Fugir do Selo";
        char RankMissao1 = 'A';
        boolean StatusMissao1;

        if (Idade1 < 15 && RankMissao1 != 'C' && RankMissao1 != 'D') {
            StatusMissao1 = false;
        } else {
            StatusMissao1 = true;
        }

        System.out.println("-=-=-=-=- NINJA 1 -=-=-=-=-");
        System.out.println("Nome: " + Nome1);
        System.out.println("Idade: " + Idade1);
        System.out.println("Missão: " + NomeMissao1);
        System.out.println("Rank: " + RankMissao1);
        System.out.println("Status: " + (StatusMissao1 ? "Concluído" : "Não Concluído"));

        String Nome2 = "Sasuke Uchiha";
        int Idade2 = 17;
        String NomeMissao2 = "Matar Danzou";
        char RankMissao2 = 'S';
        boolean StatusMissao2;

        if (Idade2 < 15 && RankMissao2 != 'C' && RankMissao2 != 'D') {
            StatusMissao2 = false;
        } else {
            StatusMissao2 = true;
        }

        System.out.println("-=-=-=-=- NINJA 2 -=-=-=-=-");
        System.out.println("Nome: " + Nome2);
        System.out.println("Idade: " + Idade2);
        System.out.println("Missão: " + NomeMissao2);
        System.out.println("Rank: " + RankMissao2);
        System.out.println("Status: " + (StatusMissao2 ? "Concluído" : "Não Concluído"));

        String Nome3 = "Sakura Haruno";
        int Idade3 = 13;
        String NomeMissao3 = "Gatinho Perdido";
        char RankMissao3 = 'B';
        boolean StatusMissao3;

        if (Idade3 < 15 && RankMissao3 != 'C' && RankMissao3 != 'D') {
            StatusMissao3 = false;
        } else {
            StatusMissao3 = true;
        }

        System.out.println("-=-=-=-=- NINJA 3 -=-=-=-=-");
        System.out.println("Nome: " + Nome3);
        System.out.println("Idade: " + Idade3);
        System.out.println("Missão: " + NomeMissao3);
        System.out.println("Rank: " + RankMissao3);
        System.out.println("Status: " + (StatusMissao3 ? "Concluído" : "Não Concluído"));
    }
}

/* Método Alternativo:

package Condicoes;

public class Desafio1 {
    public static void Ninja(String Nome, int Idade, String NomeMissao, char RankMissao) {
        boolean StatusMissao = !(Idade < 15 && RankMissao != 'C' && RankMissao != 'D');

        System.out.println("-=-=-=-=- NINJA -=-=-=-=-");
        System.out.println("Nome: " + Nome);
        System.out.println("Idade: " + Idade);
        System.out.println("Missão: " + NomeMissao);
        System.out.println("Rank: " + RankMissao);
        System.out.println("Status: " + (StatusMissao ? "Concluído" : "Não Concluído"));
    }

    public static void main(String[] args) {
        Ninja("Naruto Uzumaki", 33, "Fugir do Selo", 'A');
        Ninja("Sasuke Uchiha", 17, "Matar Danzou", 'S');
        Ninja("Sakura Haruno", 13, "Gatinho Perdido", 'B');
    }
}
*/

package Desafios;

public class Hunter {
    String Nome;
    int Idade;
    char Rank;
    String NomeDungeon;
    char RankDungeon;
    boolean StatusDungeon;

    private boolean VerificarStatus() {
        return this.Idade >= 15 || this.RankDungeon == 'C' || this.RankDungeon == 'D';
    }

    public Hunter(String Nome, int Idade, char Rank, String NomeDungeon, char RankDungeon, boolean StatusDungeon) {
        this.Nome = Nome;
        this.Idade = Idade;
        this.Rank = Rank;
        this.NomeDungeon = NomeDungeon;
        this.RankDungeon = RankDungeon;
        this.StatusDungeon = VerificarStatus();
    }

    public void molde() {
        System.out.println("=-=-=-=-= Caçador =-=-=-=-=");
        System.out.println("Nome: " + Nome);
        System.out.println("Idade: " + Idade);
        System.out.println("Rank: " + Rank);
        System.out.println("Missão: " + NomeDungeon + " | Rank " + RankDungeon);
        System.out.println("Status: " + (StatusDungeon ? "Concluído" : "Não Concluído"));
        System.out.println(" ");
    }
}
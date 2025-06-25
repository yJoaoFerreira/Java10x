package TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) { // psvm
        // Dados Não Primitivos: String, Array, Class, enum
        // Objetivo: Criar um personagem de RPG e atribuir métodos a ele

        String nome = "Seele Vollarei";
        String nomeUpperCase = nome.toUpperCase(); // Deixa tudo em CAPSLOCK

        System.out.println("Seu nome é: " + nome);
        System.out.println("SEU NOME É: " + nomeUpperCase);

        String local = "CoReia Do SuL";
        String localLowerCase = local.toLowerCase();

        System.out.println("Você nasceu na: " + local);
        System.out.println("você nasceu na: " + localLowerCase); // Deixa tudo em minúsculo
    }
}
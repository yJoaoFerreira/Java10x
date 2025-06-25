package TiposDeDados;

public class DadosPrimitivos {
    // Atalho: "psvm"
    public static void main(String[] args) {
        // Dados Primitivos: int, double, float, char, boolean, short
        // Objetivo da aula: Criar um personagem de RPG - Haisuu

        // Valor máximo do int: 2 147 483 647
        int idade = 20;
        double altura = 1.85;
        // No char é necessário usar aspas simples
        char inicial = 'H';
        boolean vivo = true;
        boolean morto = false;
        // Valor máximo do Long: 9 223 372 036 854 775 807
        Long saldo = 1000000L;

        // Atalho: "sout"
        // Atalho²: "soutv" ~> Pega a última variável para exibir
        // Exibir algo quebrando a linha para o usuário
        System.out.println("Sua idade é: " + idade);
        System.out.println("Sua altura é: " + altura);
        System.out.println("A inicial do seu nome é: " + inicial);
        System.out.println("Você está vivo? " + vivo);
        System.out.println("Você está morto? " + morto);
        // Exibir algo para o usuário
        System.out.print("Seu saldo bancário é de: " + saldo);
    }
}
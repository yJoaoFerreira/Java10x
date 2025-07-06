package Intensivo;

// Herança de Classes
public class Haruno extends Ninja implements Invocacao {
    public void inutil() {
        System.out.println(nome + ": Inútil Ativada!");
    }

    // Polimorfismo
    @Override
    public void shuriken() {
        System.out.println(nome + ": Shuriken de testa lançada!");
    }

    // Polimorfismo
    @Override
    public void kunai() {
        System.out.println(nome + ": Kunai de testa lançada!");
    }

    // Abstração
    @Override
    public void invocar() {
        System.out.println(nome + ": Invocando a lesma!");
    }
}

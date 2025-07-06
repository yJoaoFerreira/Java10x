package Intensivo;

// Herança de Classes
public class Uzumaki extends Ninja implements Invocacao {
    public void rasengan() {
        System.out.println(nome + ": Rasengan Ativado!");
    }

    public void rasenshuriken() {
        System.out.println(nome + ": Rasenshuriken Ativado!");
    }

    // Polimorfismo
    @Override
    public void shuriken() {
        System.out.println(nome + ": Shuriken de roteiro lançada!");
    }

    // Polimorfismo
    @Override
    public void kunai() {
        System.out.println(nome + ": Kunai de roteiro lançada!");
    }

    //  Abstração
    @Override
    public void invocar() {
        System.out.println(nome + ": Invocando o sapo!");
    }
}

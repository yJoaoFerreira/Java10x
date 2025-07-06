package Intensivo;

// Herança de Classes
public class Uchiha extends Ninja implements Invocacao {
    public void sharingan() {
        System.out.println(nome + ": Sharingan Ativado!");
    }

    // Polimorfismo
    @Override
    public void shuriken() {
        System.out.println(nome + ": Shuriken de amaterasu lançada!");
    }

    // Polimorfismo
    @Override
    public void kunai() {
        System.out.println(nome + ": Kunai de amaterasu lançada!");
    }

    // Abstração
    @Override
    public void invocar() {
        System.out.println(nome + ": Invocando a cobra!");
    }
}

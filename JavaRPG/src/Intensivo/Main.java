package Intensivo;

public class Main {
    public static void main(String[] args) {
        divisoria();

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 17;
        naruto.altura = 1.80;
        naruto.rasengan();
        naruto.rasenshuriken();
        naruto.invocar();

        divisoria();

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 17;
        sasuke.altura = 1.80;
        sasuke.sharingan();
        sasuke.kunai();
        sasuke.invocar();

        divisoria();

        Haruno sakura = new Haruno();
        sakura.nome = "Sakura Haruno";
        sakura.idade = 16;
        sakura.altura = 1.60;
        sakura.inutil();
        sakura.shuriken();
        sakura.invocar();

        divisoria();
    }
    public static void divisoria() {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
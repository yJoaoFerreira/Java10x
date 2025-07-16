package Condicoes;

public class Array {
    public static void main(String[] args) {
        /*
        * Array vs Lista
        *
        * Array: Sempre vai ter um tipo definido, precisando se extender manualmente.
        *
        * Lista: Tem tamanhos flexíveis, se extendendo automaticamente.
        *
        * */

        // Arrays são tipo referência!
        int[] pokemonNumber = new int[3];
        int[] pokemonLevel = new int[3];

        String[] pokemonName = new String[3];
        String[] pokemonType = new String[3];
        String[] pokemonNature = new String[3];

        pokemonName[0] = "Pikachu";
        pokemonName[1] = "Charizard";
        pokemonName[2] = "Greninja";

        pokemonLevel[0] = 5;
        pokemonLevel[1] = 36;
        pokemonLevel[2] = 37;

        for (int i = 0; i < 3; i++) {
            System.out.println(
                    "Pokedex Number: " + pokemonNumber[i] + "\n" +
                    "Pokemon Name: " + pokemonName[i] + "\n" +
                    "Pokemon Level: " + pokemonLevel[i] + "\n" +
                    "Pokemon Type: " + pokemonType[i] + "\n" +
                    "Pokemon Nature: " + pokemonNature[i] + "\n" +
                    "---------------------------------------------"
            );
        }
        
        // Redeclaração de Variável
        String ygor = "Ygorex";
        System.out.println("ygor = " + ygor);
        ygor = "Koushiro";
        System.out.println("ygor = " + ygor);

        // Redeclaração de Array
        pokemonName = new String[5];
        pokemonName[0] = "Raichu";
        System.out.println(pokemonName[0]);
    }
}
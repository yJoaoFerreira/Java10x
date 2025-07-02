# Variáveis e Tipagem de Dados em Java

O que é uma variável? Imagine que você está jogando um  RPG de mesa, onde o mestre precisa automatizar as fichas dos jogadores, criando um programa para cadastrar seus dados. O que iremos por nesse programa?

1. Precisamos guardar o nome do personagem do nosso jogador de algum modo:
```java
Nome = "Lux";
Sobrenome = "Fujiwara";
```
2. Precisamos guardar a idade do nosso jogador:
```java
Idade = 19;
```
3. Guardar a altura e o peso do nosso jogador também é importante:
```java
Altura = 1.95;
Peso = 85.2;
```
4. Seu local de nascimento é uma informação interessante:
```java
Local = "Japão"
```
5. Como é um RPG, precisamos saber se ele está vivo ou não:
```java
Vivo = True;
Morto = False;
```

Uma variável nada mais é que uma caixa onde iremos guardar os nossos dados, ou melhor, iremos utilizar como alocamento de memória para salvar eles no nosso programa. Variáveis podem ser booleanos (sim ou não), números (inteiros, reais, etc), palavras ou caracteres.

Se fossemos converter para java, que é uma linguagem fortemente tipada, precisariamos declarar o tipo da variável antes de declararmos as variáveis, ficando com o seguinte modelo: `<Tipo> <Variável> = <Valor>;`

Os tipos de variáveis que temos são:
- String: Serve para armazenar textos e caracteres.
  - Obs: Sempre que você for declarar uma string, ela deve ficar entre aspas duplas.
- Int: Serve para armazenar números inteiros.
- Double: Serve para armazenar números reais de forma precisa.
- Boolean: Um tipo de variável que só pode carregar verdadeiro ou falso.

Exemplificando na prática:
```java
String Nome = "Lux";
String Sobrenome = "Fujiwara";
Int Idade = 19;
Double Altura = 1.95;
Double Peso = 85.2;
String Local = "Japão";
Boolean Vivo = True;
Boolean Morto = False;
```

# Saída de Dados

`System.out.print()` ~> Exibe uma informação sem pular linha. <br>
**Exemplo básico:** Eu quero exibir a idade do personagem lux, o  que eu faço?
```java
public static void main(String[] args) {
  System.out.print("Sua idade é: " + idade);
}
```

`System.out.println()` ~> Exibe uma informação pulando linha. <br>
**Exemplo básico:** Eu quero exibir mais de uma informação por vez do personagem lux, o que eu faço agora?
```java
public static void main(String[] args) {
  System.out.println("Seu nome é: " + nome);
  System.out.println("Seu sobrenome é: " + sobrenome);
  System.out.print("Sua idade é: " + idade);
}
```

# Shortcuts

> psvm: escreve todo o cabeçalho do java pra você. <br>
> sout: escreve o println completo pra você.  <br>
> soutv: escreve o println completo puxando a última variável declarada.

# Dados Primitivos & Não Primitivos em Java

- **Dados Primitivos:** São tipos de dado que de maneira geral não recebem métodos de maneira padrão.
  - **int:** Números inteiros.
  - **float:** Números de ponto flutuante de precisão simples.
  - **double:** Números de ponto flutuante de precisão dupla.
  - **char:** Um único caractere.
  - **boolean:** Valores verdadeiros ou falsos.
  - **byte:** Números inteiros pequenos.
  - **short:** Números inteiros menores que um int.
  - **Long:** Números inteiros maiores que um int.

- **Dados Não Primitivos:** São tipos de dados em que pode-se colocar métodos para fazer alterações na variável sem que seja mudado seu escopo.
  -  **String:**
  - **Array:**
  - **Class:**
  - **enum:**

# Condições

Imagine que você é um caçador de solo leveling, você começaria sua história sendo um caçador de rank nacional? NÃO! Você primeiro seria um humano normal, depois despertaria como um Rank E, ganharia o sistema. Com o passar dos níveis viraria um Rank D, depois um Rank C, após isso um Rank B, depois de muita luta, um Rank A, e com sorte, viraria um Rank S, pra só no fim, se tornar um Rank Nacional. Tudo é feito por etapas e você não tem como pular nenhuma. Ou seja, condições são etapas que são criadas para que algo aconteça, o Sung só pode se tornar um Rank S após completar um número específico de dungeons.

```java
// exemplo:
if(idade >= 18){
  System.out.println("Você é maior de idade!");
}else if(idade < 18 && idade > 12){
  System.out.println("Você ainda é um adolescente!");
}else{
  System.out.println("Você ainda é uma criança!")
}
```
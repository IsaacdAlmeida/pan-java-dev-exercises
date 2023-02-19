public class MyClass {
  // se minha classe for uma classe executável precisa de um método main
  public static void main (String [] args) {

    String primeiroNome = "Isaac";
    String segundoNome = "Almeida";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

    System.out.println(nomeCompleto);

    // Declaração de variável tipo + nome = valor
    // int ano = 2021;
    // Declaração de constante adiciona a palavra final e coloca tudo em uppercase
    // final String BR = "Brasil";

  }

  public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Resultado: " + primeiroNome.concat(" ").concat(segundoNome);
  }
}

package Conta;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("insira uma conta por favor use espaços: ");
    String conta = scan.nextLine();

    List<String> numeros = new ArrayList<>();
    List<String> simbolos = new ArrayList<>();

    String[] elementos = conta.split("\\s+");

    for (String elemento : elementos) {
      if (elemento.matches("[0-9]+")) {
        numeros.add(elemento);
      } else {
        simbolos.add(elemento);
      }
    }

    // Exibir resultados
    // Criar a string de saída no formato desejado
    StringBuilder resultado = new StringBuilder();

    // Garantir que há números suficientes para ligar
    if (numeros.size() > 1) {
        for (int i = 0; i < simbolos.size() && i < numeros.size() - 1; i++) {
            resultado.append(simbolos.get(i)) // Adiciona o operador
                     .append(" liga ")
                     .append(numeros.get(i)) // Adiciona o primeiro número
                     .append(" a ")
                     .append(numeros.get(i + 1)) // Adiciona o próximo número
                     .append(" ");
        }
    }

    // Exibir o resultado formatado
    System.out.println(resultado.toString().trim());
    scan.close();
  }

}

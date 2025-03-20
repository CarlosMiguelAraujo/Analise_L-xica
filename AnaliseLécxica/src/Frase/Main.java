package Frase;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
    class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

      System.out.println("Insira um texto: ");
        String frase = scan.nextLine();

        List<String> palavras = new ArrayList<>();
        List<String> numeros = new ArrayList<>();
        List<String> simbolos = new ArrayList<>();

      String[] elementos = frase.split("\\s+");

      for (String elemento : elementos) {
              if (elemento.matches("[0-9]+")) {
                  numeros.add(elemento);
              } else if (elemento.matches("[a-zA-ZÀ-ÿ]+")) {
                  palavras.add(elemento);
              } else {
                  simbolos.add(elemento);
              }
          }

       
          System.out.println("Palavras: " + palavras);
          System.out.println("Números: " + numeros);
          System.out.println("Símbolos: " + simbolos);

          scan.close();
      }

      
    }
     
            
   
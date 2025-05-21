import java.util.Scanner;

public class ContadorDeVogais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase ou palavra: ");
        String texto = scanner.nextLine();

        int contador = 0;
        // Para cada caractere na string...
        for (int i = 0; i < texto.length(); i++) {
            char c = Character.toLowerCase(texto.charAt(i));
            // ...verifica se é uma das vogais
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }

        System.out.printf("Total de vogais encontradas: %d%n", contador);

        scanner.close();
    }
}

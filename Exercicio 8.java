//ex8
import java.util.Scanner;

public class ContadorVogais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase ou palavra: ");
        String texto = scanner.nextLine();

        int contador = 0;
        // Percorre cada caractere da string
        for (int i = 0; i < texto.length(); i++) {
            char c = Character.toLowerCase(texto.charAt(i));
            // Verifica se é uma vogal
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }

        System.out.printf("O número de vogais no texto informado é: %d%n", contador);

        scanner.close();
    }
}

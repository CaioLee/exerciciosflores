//ex3
import java.util.Scanner;

public class MediaTresNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        // Calcula a média das três notas
        double media = (nota1 + nota2 + nota3) / 3.0;

        System.out.printf("A média das três notas é: %.2f%n", media);

        scanner.close();
    }
}

import java.util.Random;
import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroSorteado = random.nextInt(100) + 1;
        int tentativa;

        System.out.println("Tente adivinhar o número entre 1 e 100!");

        do {
            System.out.print("Digite seu palpite: ");
            tentativa = scanner.nextInt();

            if (tentativa < numeroSorteado) {
                System.out.println("O número é maior.");
            } else if (tentativa > numeroSorteado) {
                System.out.println("O número é menor.");
            } else {
                System.out.println("Parabéns! Você acertou.");
            }

        } while (tentativa != numeroSorteado);

        scanner.close();
    }
}

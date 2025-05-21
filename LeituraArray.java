import java.util.Scanner;

public class LeituraArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int[] numeros = new int[5]; 

        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = input.nextInt(); 
        }

        System.out.println("\nNúmeros digitados:");
        
        for (int numero : numeros) {
            System.out.println(numero);
        }

        input.close(); 
    }
}

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("escolha a operação (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        double resultado;

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                System.out.println("resultado: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("resultado: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("resultado: " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("resultado: " + resultado);
                } else {
                    System.out.println("divisão por zero!");
                }
                break;
            default:
                System.out.println("operador inválido.");
                break;
        }

        scanner.close();
    }
}


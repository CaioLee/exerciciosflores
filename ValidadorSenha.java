import java.util.Scanner;

public class ValidadorSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma senha: ");
        String senha = scanner.nextLine();

        if (validarSenha(senha)) {
            System.out.println(" Senha válida!");
        } else {
            System.out.println("Senha inválida. Certifique-se de que ela tem:");
            System.out.println("- Pelo menos 8 caracteres");
            System.out.println("- Pelo menos uma letra maiúscula");
            System.out.println("- Pelo menos uma letra minúscula");
            System.out.println("- Pelo menos um número");
        }

        scanner.close();
    }

    public static boolean validarSenha(String senha) {
        if (senha.length() < 8) return false;

        boolean temMaiuscula = false;
        boolean temMinuscula = false;
        boolean temNumero = false;

        for (char c : senha.toCharArray()) {
            if (Character.isUpperCase(c)) temMaiuscula = true;
            else if (Character.isLowerCase(c)) temMinuscula = true;
            else if (Character.isDigit(c)) temNumero = true;
        }

        return temMaiuscula && temMinuscula && temNumero;
    }
}

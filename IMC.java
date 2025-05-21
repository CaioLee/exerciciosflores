public class IMC {
    public static void main(String[] args) {
        double peso = 70.0; // Peso em kg
        double altura = 1.75; // Altura em metros
        double imc = peso / (altura * altura); // Cálculo do IMC

        System.out.println("Seu IMC é: " + imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }
    }
}

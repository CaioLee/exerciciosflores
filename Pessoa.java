public class Pessoa {
 
    String nome;
    int idade;

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Ilza";
        pessoa1.idade = 25;
        pessoa1.exibirDados();
    }
}

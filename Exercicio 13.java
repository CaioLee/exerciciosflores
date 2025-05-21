// Carro.java
public class Carro implements Veiculo {
    private int velocidade;

    public Carro() {
        this.velocidade = 0;
    }

    @Override
    public void acelerar() {
        velocidade += 10;
        System.out.println("Acelerando... Velocidade atual: " + velocidade + " km/h");
    }

    @Override
    public void frear() {
        velocidade -= 10;
        if (velocidade < 0) {
            velocidade = 0;
        }
        System.out.println("Freiando... Velocidade atual: " + velocidade + " km/h");
    }

    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        // Testando aceleração e frenagem
        meuCarro.acelerar();  // deve ir para 10 km/h
        meuCarro.acelerar();  // 20 km/h
        meuCarro.frear();     // 10 km/h
        meuCarro.frear();     // 0 km/h
        meuCarro.frear();     // continua em 0 km/h, não fica negativo
    }
}

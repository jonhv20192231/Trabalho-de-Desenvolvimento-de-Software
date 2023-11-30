package classes;

public class CarroPolicial {
    private int velocidade;

    public CarroPolicial() {
        this.velocidade = 0;
    }

    public void acelerar(int quantidade) {
        this.velocidade += quantidade;
        System.out.println("O carro está agora a " + this.velocidade + " km/h.");
    }

    public void frear(int quantidade) {
        if (this.velocidade - quantidade < 0) {
            this.velocidade = 0;
        } else {
            this.velocidade -= quantidade;
        }
        System.out.println("O carro está agora a " + this.velocidade + " km/h.");
    }

    public static void main(String[] args) {
        CarroPolicial meuCarro = new CarroPolicial();
        meuCarro.acelerar(50); // O carro está agora a 50 km/h.
        meuCarro.frear(20);    // O carro está agora a 30 km/h.
        meuCarro.frear(40);    // O carro está agora a 0 km/h.
    }
}


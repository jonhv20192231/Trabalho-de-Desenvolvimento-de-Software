package classes;

public class Sirene {
    private boolean acesa;

    public Sirene() {
        this.acesa = false;
    }

    public void acender() {
        this.acesa = true;
        System.out.println("A sirene esta apitando");
    }

    public void apagar() {
        this.acesa = false;
        System.out.println("A sirene parou de apitar");
    }

    public static void main(String[] args) {
        Sirene minhaLampada = new Sirene();
        minhaLampada.acender(); // A sirene esta apitando.
        minhaLampada.apagar();  // A sirene parou de apitar.
    }
}


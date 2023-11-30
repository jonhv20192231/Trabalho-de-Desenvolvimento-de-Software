package classes;

public class ComputadorPolicial {
    // Atributos
    private String modelo;
    private String numeroSerie;
    private boolean ligado;
    private String sistemaOperacional;

    // Construtor
    public ComputadorPolicial(String modelo, String numeroSerie, String sistemaOperacional) {
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
        this.ligado = false;
        this.sistemaOperacional = sistemaOperacional;
    }

    // Métodos

    // Liga o computador
    public void ligar() {
        if (!ligado) {
            System.out.println("Ligando o computador policial...");
            ligado = true;
        } else {
            System.out.println("O computador já está ligado.");
        }
    }

    // Desliga o computador
    public void desligar() {
        if (ligado) {
            System.out.println("Desligando o computador policial...");
            ligado = false;
        } else {
            System.out.println("O computador já está desligado.");
        }
    }

    // Executa uma verificação de segurança
    public void verificarSeguranca() {
        if (ligado) {
            System.out.println("Realizando verificação de segurança...");
            // Lógica de verificação de segurança aqui
        } else {
            System.out.println("O computador precisa estar ligado para verificar a segurança.");
        }
    }

    // Getters e Setters

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        ComputadorPolicial computador = new ComputadorPolicial("PC Policial 2000", "123456", "Windows");
        
        // Testando os métodos
        System.out.println("Modelo: " + computador.getModelo());
        System.out.println("Número de Série: " + computador.getNumeroSerie());
        System.out.println("Sistema Operacional: " + computador.getSistemaOperacional());

        computador.ligar();
        computador.verificarSeguranca();
        computador.desligar();
    }
}


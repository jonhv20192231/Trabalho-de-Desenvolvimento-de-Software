package classes;

public class Camera {
    public void tirarFoto() {
        System.out.println("Foto tirada! Notificação enviada.");
        notificarFotoTirada();
    }

    private void notificarFotoTirada() {
        // Lógica para enviar notificação (pode ser implementada de acordo com a necessidade)
        System.out.println("Notificação: Foto tirada!");
    }

    public static void main(String[] args) {
        Camera minhaCamera = new Camera();
        minhaCamera.tirarFoto();
    }
}

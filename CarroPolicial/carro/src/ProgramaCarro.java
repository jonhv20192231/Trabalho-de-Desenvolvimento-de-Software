import classes.Camera;
import classes.CarroPolicial;
import classes.ComputadorPolicial;
import classes.Sirene;

public class ProgramaCarro {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        CarroPolicial meuCarro = new CarroPolicial();
        ComputadorPolicial meuComputador = new ComputadorPolicial("PC Policial 2000", "123456", "Windows");
        
        

        // Agora você pode usar os métodos dos objetos criados
        meuCarro.acelerar(50); // O carro está agora a 50 km/h.
        meuComputador.ligar();
        meuComputador.verificarSeguranca();
        meuComputador.desligar();
      
        Sirene minhaLampada = new Sirene();
        minhaLampada.acender(); // A sirene esta apitando.
        minhaLampada.apagar();  // A sirene parou de apitar.

        Camera minhaCamera = new Camera();
        minhaCamera.tirarFoto();
        
    }
}

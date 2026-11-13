import java.util.Random;

public class HiloJugador extends Thread {

    private NumeroOculto juego;

    public HiloJugador(NumeroOculto juego) {
        this.juego = juego;
    }

    @Override
    public void run() {

        Random random = new Random();

        while (true) {

            int numero = random.nextInt(101);

            int resultado = juego.propuestaNumero(numero);

            if (resultado == 1) {
                System.out.println(
                    getName() + " ha acertado el número: " + numero
                );
                return;
            }

            if (resultado == -1) {
                System.out.println(
                    getName() + " termina porque otro hilo ha ganado."
                );
                return;
            }

            System.out.println(
                getName() + " ha propuesto: " + numero
            );
        }
    }
}
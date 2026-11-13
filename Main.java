import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        // Generamos el número oculto entre 0 y 100
        int numero = random.nextInt(101);

        NumeroOculto juego = new NumeroOculto(numero);

        // Creamos los 10 hilos
        for (int i = 1; i <= 10; i++) {

            HiloJugador hilo = new HiloJugador(juego);

            hilo.setName("Jugador " + i);

            hilo.start();
        }
    }
}
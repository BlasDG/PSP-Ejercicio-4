public class NumeroOculto {
    private int numero;
    private boolean terminado = false;

    public NumeroOculto(int numero) {
        this.numero = numero;
    }

    public synchronized int propuestaNumero(int num) {

        // Si otro hilo ya ha acertado, devolvemos -1
        if (terminado) {
            return -1;
        }

        // Si el número propuesto es correcto
        if (num == numero) {
            terminado = true;
            return 1;
        }

        // Si no ha acertado
        return 0;
    }
}
public class Jugador {

    private String nombre;

    private int numero;

    public Jugador(String nombre, int numero) {

        this.nombre = nombre;
        this.numero = numero;

    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getNumero() { return numero; }

    public void setNumero(int numero) { this.numero = numero; }

    public String toString() { return "Nombre: " + this.nombre + " #: " + this.numero + " "; }

}
package pkg;

public class Equipo {
    private String nombre;
    private Jugador jugador1;
    private Jugador jugador2;

    public Equipo(String nombre, Jugador jugador1, Jugador jugador2) {
        this.nombre = nombre;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public void mostrarEquipo() {
        System.out.println("Equipo: " + nombre);
        System.out.println("Jugador 1: " + jugador1.mostrarInfo());
        System.out.println("Jugador 2: " + jugador2.mostrarInfo());
    }

    public int puntosTotales() {
        return jugador1.getPuntos() + jugador2.getPuntos();
    }

    public String getNombre() {
        return nombre;
    }
}

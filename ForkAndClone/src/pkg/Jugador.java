package pkg;

	
	public class Jugador {
	    private String nombre;
	    private int edad;
	    private int puntos;

	    public Jugador(String nombre, int edad) {
	        this.nombre = nombre;
	        this.edad = edad;
	        this.puntos = 0;
	    }

	    public void sumarPuntos(int cantidad) {
	        puntos += cantidad;
	    }

	    public String mostrarInfo() {
	        return nombre + " (" + edad + " años) - Puntos: " + puntos;
	    }

	    public int getPuntos() {
	        return puntos;
	    }

	    public String getNombre() {
	        return nombre;
	    }
	}



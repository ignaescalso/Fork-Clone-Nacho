package pkg;

public class Main {

	public static void main(String[] args) {
		// TODO: crear dos jugadores
		
		Jugador jugador1 = new Jugador("Nacho", 33);
		Jugador jugador2 = new Jugador("Pedro", 35);
		
        // TODO: crear un equipo con esos dos jugadores
		
		Equipo equipo1 = new Equipo ("Los koalas", jugador1, jugador2);
		
        // TODO: asignar puntos a los jugadores
		
		jugador1.sumarPuntos(15);
		jugador2.sumarPuntos(8);
		
        // TODO: mostrar información del equipo y puntos totales
		
		equipo1.mostrarEquipo();

	}

}

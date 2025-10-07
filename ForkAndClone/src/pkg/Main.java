package pkg;

public class Main {

	public static void main(String[] args) {
		// TODO: crear dos jugadores
		
		Jugador jugador1 = new Jugador("Nacho", 33);
		Jugador jugador2 = new Jugador("Pedro", 35);
		Jugador jugador3 = new Jugador("Samuel", 34);
		Jugador jugador4 = new Jugador("Alvaro", 36);
		
		
        // TODO: crear un equipo con esos dos jugadores
		
		Equipo equipo1 = new Equipo ("Los koalas", jugador1, jugador2);
		Equipo equipo2 = new Equipo ("Las Orcas", jugador3, jugador4);
		Equipo equipoLocal = null;
		equipoLocal = equipo1;
		Equipo equipoVisitante = null;
		equipoVisitante = equipo2;
		
        // TODO: asignar puntos a los jugadores
		
		jugador1.sumarPuntos(15);
		jugador2.sumarPuntos(8);
		jugador3.sumarPuntos(12);
		jugador4.sumarPuntos(9);
		
        // TODO: mostrar información del equipo y puntos totales
		
			
		Partido partidoTest = new Partido(equipo1, equipo2);
		
		partidoTest.jugar();

	}

}

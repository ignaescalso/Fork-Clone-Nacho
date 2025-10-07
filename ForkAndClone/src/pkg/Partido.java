package pkg;

public class Partido {


	public Equipo equipoLocal;
	public Equipo equipoVisitante;
	public int puntosLocal;
	public int puntosVisitante;
	

		
	public Partido(Equipo equipo1, Equipo equipo2) {
		this.equipoLocal = equipo1;
		this.equipoVisitante = equipo2;
	}

	public void jugar() {
		int puntosLocal = equipoLocal.puntosTotales();
		int puntosVisitante = equipoVisitante.puntosTotales();
		if (puntosLocal > puntosVisitante) {
			System.out.println("El equipo ganador es: ");
			equipoLocal.mostrarEquipo();
			System.out.println("Con un total de: " + equipoLocal.puntosTotales());
			
		} else {
			System.out.println("El equipo ganador es: ");
			equipoVisitante.mostrarEquipo();
			System.out.println("Con un total de: " + equipoVisitante.puntosTotales());
		}
	}

	
	
}

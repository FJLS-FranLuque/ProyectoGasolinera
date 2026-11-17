package Gasolinera;

public class Cliente {
	private String nombre;
	private String dni;
	private int puntosFidelizacion;
	private int operacionPuntos;
	
	public Cliente() {
		this.nombre = "";
		this.dni = "";
		this.puntosFidelizacion = 0;
	}
	
	public Cliente(String Nombre, String DNI) {
		this.nombre = Nombre;
		this.dni = DNI;
		this.puntosFidelizacion = 0;
		
	}
	
	public void sumarPuntos(int litros) {
		int puntosGanados = (int) (litros / 5);
        
        if (puntosGanados > 0) {
            this.puntosFidelizacion += puntosGanados;
            System.out.println("-> [Fidelización] " + nombre + " ha ganado " + puntosGanados + " puntos nuevos.");
        } else {
            System.out.println("-> [Fidelización] No alcanza para sumar puntos (menos de 5 litros).");
        }
    }
	
	public String getNombre() { return nombre; }
    public int getPuntosFidelizacion() { return puntosFidelizacion; }
	
	
}

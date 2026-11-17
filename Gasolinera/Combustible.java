package Gasolinera;

public class Combustible {
	private String nombre;
	private double PrecioLitro;
	private double stock;
	
	public Combustible() {
		this.nombre = "";
		this.PrecioLitro = 0;
		this.stock = 50000;
	
	}
	
	public Combustible(String Nombre, double PrecioLitro) {
		this.nombre = Nombre;
		this.PrecioLitro = PrecioLitro;
		this.stock = 50000;
	
	}
	
	public boolean repostar(double CantidadLitro) {
		if(stock >= CantidadLitro) {
			stock -= CantidadLitro;
			return true;
		}else {
			System.out.println("No hay mucho stocks de ese combustibles");
			return false;
		}
	}
	
	public String getNombre() { return nombre; }
    public double getPrecioPorLitro() { return PrecioLitro; }
    public double getStock() { return stock; }
    
}

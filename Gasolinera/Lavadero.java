package Gasolinera;

public class Lavadero {
	private String tipoPrograma;
	private double precio;
	
	public Lavadero(String TipoPrograma,double Precio) {
		this.tipoPrograma = TipoPrograma;
		this.precio = Precio;
	}
	
	public String calcularPrecioLavadero() {
		if (tipoPrograma.equals("Basico")) {
			precio = 2;
		}else if(tipoPrograma.equals("Plus")){
			precio = 5;
		}else if(tipoPrograma.equals("Premium")) {
			precio = 10;
		}
		return "Precio Lavado Seleccionado es: "+precio+" €";
	}

	public String getTipoPrograma() {
		return tipoPrograma;
	}

	public void setTipoPrograma(String tipoPrograma) {
		this.tipoPrograma = tipoPrograma;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}

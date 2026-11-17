package Gasolinera;

public class Comida {
	private String producto;
    private double precio;
    private int stock;

    public Comida(String producto, double precio, int stock) {
        this.producto = producto;
        this.precio = precio;
        this.stock = stock;
    }
    
    public void preciosComidas() {
    	if (producto.equals("PatatasFritas")) {
    		precio = 2;
    	}else if(producto.equals("Refresco")) {
    		precio = 2.5;
    	}else if(producto.equals("Agua")) {
    		precio = 2;
    	}else if (producto.equals("Chocolate")) {
    		precio = 2;
    	}else if (producto.equals("Bocadillos")) {
    		precio = 2.5;
    	}
    }
    
    public boolean vender(int cantidad) {
        if (stock >= cantidad) {
            stock -= cantidad;
            return true;
        }
        return false;
    }
    
   

    public String getProducto() { return producto; }
    public double getPrecio() { return precio; }
}

package Gasolinera;

public class Vehiculo {
    private String matricula;
    private String modelo;

    public Vehiculo(String matricula, String modelo) {
        this.matricula = matricula;
        this.modelo = modelo;
    }

    public String getMatricula() { return matricula; }
    public String getModelo() { return modelo; }
}

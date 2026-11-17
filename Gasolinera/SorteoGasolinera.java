package Gasolinera;

import java.util.Random;

public class SorteoGasolinera {
	public static boolean participarSorteo(double totalLitros) {
        if (totalLitros >= 10.0) {
            Random random = new Random();
            int numeroSuerte = random.nextInt(100) + 1; // Número entre 1 y 100
            // Si sale el 7, ¡gana un premio!
            return numeroSuerte == 7;
        }
        return false;
    }
}

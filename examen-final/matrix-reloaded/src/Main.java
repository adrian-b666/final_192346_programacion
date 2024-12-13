import management.*;
import utils.ConsoleUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a Matrix Reloaded: Salvando la Humanidad");
        System.out.println("Elige una píldora para continuar:");
        System.out.println("1. Píldora Roja: Agentes de la Resistencia");
        System.out.println("2. Píldora Azul: Control de Anomalías");
        System.out.println("3. Estadísticas del Sistema");

        int opcion = ConsoleUtils.leerEntero("Selecciona una opción (1, 2 o 3): ");

        if (opcion == 1) {
            AgenteManager agenteManager = new AgenteManager();
            agenteManager.mostrarMenu();
        } else if (opcion == 2) {
            AnomaliaManager anomaliaManager = new AnomaliaManager();
            anomaliaManager.mostrarMenu();
        } else if (opcion == 3) {
            mostrarEstadisticas();
        } else {
            System.out.println("Opción no válida. Adiós.");
        }
    }

    public static void mostrarEstadisticas() {
        AgenteManager agenteManager = new AgenteManager();
        AnomaliaManager anomaliaManager = new AnomaliaManager();

        int totalAgentes = agenteManager.obtenerTotalAgentes();
        int totalAnomalias = anomaliaManager.obtenerTotalAnomalias();

        System.out.println("Estadísticas del Sistema:");
        System.out.println("Total de Agentes: " + totalAgentes);
        System.out.println("Total de Anomalías: " + totalAnomalias);
    }
}

class AgenteManager {
    public void mostrarMenu() {

    }

    public int obtenerTotalAgentes() {
        return 5;
    }
}

class AnomaliaManager {
    public void mostrarMenu() {

    }

    public int obtenerTotalAnomalias() {
        return 3;
}
}

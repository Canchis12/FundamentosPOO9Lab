package Cine;

public class Sala {
    private int identificador;
    private String tipoSala;
    private int capacidad;
    private int asientosOcupados;

    public Sala(int identificador, String tipoSala, int capacidad) {
        this.identificador = identificador;
        this.tipoSala = tipoSala;
        this.capacidad = capacidad;
        this.asientosOcupados = 0;
    }

    public boolean ocuparAsiento() {
        if (asientosOcupados < capacidad) {
            asientosOcupados++;
            return true;
        } else {
            System.out.println("La sala está llena.");
            return false;
        }
    }

    public void mostrarEstado() {
        System.out.println("Sala ID: " + identificador);
        System.out.println("Tipo: " + tipoSala);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Asientos ocupados: " + asientosOcupados);
        System.out.println("-------------------------------------");
    }
}

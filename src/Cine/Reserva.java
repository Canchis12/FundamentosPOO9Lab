package Cine;

public class Reserva {
    private Pelicula pelicula;
    private Sala sala;
    private String cliente;

    public Reserva(Pelicula pelicula, Sala sala, String cliente) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.cliente = cliente;
    }

    public void procesarReserva() {
        boolean entradaVendida = pelicula.venderEntrada();
        boolean asientoOcupado = sala.ocuparAsiento();

        if (entradaVendida && asientoOcupado) {
            System.out.println("Reserva procesada exitosamente para " + cliente);
        } else {
            System.out.println("La reserva de " + cliente + " no pudo completarse.");
        }

        System.out.println("-------------------------------------");
    }

    public void mostrarDetalle() {
        System.out.println("Cliente: " + cliente);
        pelicula.mostrarInformacion();
        sala.mostrarEstado();
    }
}

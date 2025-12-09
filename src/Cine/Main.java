package Cine;

public class Main {
    public static void main(String[] args) {
        Pelicula p1 = new Pelicula("Inception", "Sci-Fi", 148, 5);
        Sala sala1 = new Sala(1, "IMAX", 5);

        Reserva r1 = new Reserva(p1, sala1, "Sebastián");
        Reserva r2 = new Reserva(p1, sala1, "Laura");
        Reserva r3 = new Reserva(p1, sala1, "Carlos");

        r1.procesarReserva();
        r2.procesarReserva();
        r3.procesarReserva();

        System.out.println(" Información Final ");
        p1.mostrarInformacion();
        sala1.mostrarEstado();
    }

}

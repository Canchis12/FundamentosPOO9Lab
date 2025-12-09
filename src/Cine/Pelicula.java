package Cine;

public class Pelicula {
    private String titulo;
    private String genero;
    private int duracion;
    private int entradasDisponibles;

    public Pelicula(String titulo, String genero, int duracion, int entradasDisponibles) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.entradasDisponibles = entradasDisponibles;
    }

    public boolean venderEntrada() {
        if (entradasDisponibles > 0) {
            entradasDisponibles--;
            return true;
        } else {
            System.out.println("No hay más entradas disponibles para la película.");
            return false;
        }
    }

    public void mostrarInformacion() {
        System.out.println("Película: " + titulo);
        System.out.println("Género: " + genero);
        System.out.println("Duración: " + duracion + " min");
        System.out.println("Entradas disponibles: " + entradasDisponibles);
        System.out.println("-------------------------------------");
    }
}

package Cafeteria;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidadVendida;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadVendida = 0;
    }

    public void registrarVenta() {
        cantidadVendida++;
    }

    public void mostrarInformacion() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Unidades vendidas: " + cantidadVendida);
        System.out.println("-------------------------------------");
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
}

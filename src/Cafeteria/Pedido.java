package Cafeteria;

public class Pedido {
    private int id;
    private Producto producto;
    private int cantidad;
    private boolean entregado;

    public Pedido(int id, Producto producto, int cantidad) {
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
        this.entregado = false;
    }

    public void entregar() {
        if (!entregado) {
            for (int i = 0; i < cantidad; i++) {
                producto.registrarVenta();
            }
            entregado = true;
            System.out.println("Pedido " + id + " ha sido entregado.");
        }
    }

    public double calcularTotal() {
        return cantidad * producto.getPrecio();
    }

    public void mostrarDetalle() {
        System.out.println("Pedido ID: " + id);
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Total: $" + calcularTotal());
        System.out.println("Entregado: " + (entregado ? "Sí" : "No"));
        System.out.println("-------------------------------------");
    }

    public boolean isEntregado() {
        return entregado;
    }
}

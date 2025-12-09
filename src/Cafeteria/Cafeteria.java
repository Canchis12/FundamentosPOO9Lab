package Cafeteria;

import java.util.ArrayList;

public class Cafeteria {
    private String nombre;
    private ArrayList<Pedido> pedidos;

    public Cafeteria(String nombre) {
        this.nombre = nombre;
        this.pedidos = new ArrayList<>();
    }

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void mostrarPedidos() {
        for (Pedido p : pedidos) {
            p.mostrarDetalle();
        }
    }

    public void mostrarVentasTotales() {
        double total = 0;

        for (Pedido p : pedidos) {
            if (p.isEntregado()) {
                total += p.calcularTotal();
            }
        }

        System.out.println("Ventas totales: $" + total);
    }
}

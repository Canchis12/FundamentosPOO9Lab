package Cafeteria;

public class Main {
    public static void main(String[] args) {
        Producto cafe = new Producto("Café", 4000);
        Producto te   = new Producto("Té", 3000);
        Producto pastel = new Producto("Pastel", 5500);

        Pedido p1 = new Pedido(1, cafe, 2);
        Pedido p2 = new Pedido(2, pastel, 1);
        Pedido p3 = new Pedido(3, te, 3);

        Cafeteria cafeX = new Cafeteria("Café Central");

        cafeX.agregarPedido(p1);
        cafeX.agregarPedido(p2);
        cafeX.agregarPedido(p3);

        p1.entregar();
        p3.entregar();

        cafeX.mostrarPedidos();
        cafeX.mostrarVentasTotales();

        System.out.println("\n=== Ventas por producto ===");
        cafe.mostrarInformacion();
        te.mostrarInformacion();
        pastel.mostrarInformacion();

    }
}

package CasoPractico1;


public class main {
    
    public static void main(String[] args) {
        
        Inventario inventario = new Inventario();
        
        Producto p1 = new Producto("01", "Yerba Mate", 1500, 20, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("02", "Notebook Lenovo", 250000, 5, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("03", "Remera", 8000, 15, CategoriaProducto.ROPA);
        Producto p4 = new Producto("04", "Smart TV Samsung", 400000, 3, CategoriaProducto.ELECTRONICA);
        Producto p5 = new Producto("05", "Silla de escritorio", 22000, 10, CategoriaProducto.HOGAR);
        
        
        
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);
        
        System.out.println("\n------------------------------------------");        
        inventario.listarProductos();
        
        System.out.println("\n------------------------------------------");        
        System.out.println("🔎 Buscando producto con ID 03...");
        Producto buscado = inventario.buscarProductoPorId("03");
        if (buscado != null) buscado.mostrarInfo();
        
        System.out.println("\n------------------------------------------");
        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);

        System.out.println("\n------------------------------------------");
        inventario.actualizarStock("01", 30);

        System.out.println("\n------------------------------------------");
        inventario.eliminarProducto("05");

        System.out.println("\n------------------------------------------");
        System.out.println("Total de unidades en stock: " + inventario.obtenerTotalStock());

        System.out.println("\n------------------------------------------");
        Producto mayor = inventario.obtenerProductoConMayorStock();
        System.out.println("Producto con mayor stock:");
        if (mayor != null) mayor.mostrarInfo();

        System.out.println("\n------------------------------------------");
        inventario.filtrarProductosPorPrecio(1000, 30000);

        System.out.println("\n------------------------------------------");
        inventario.mostrarCategoriasDisponibles();
        
    }
    
}

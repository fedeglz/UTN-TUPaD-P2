package CasoPractico1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Inventario {
    
    private List<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p){
        if(buscarProductoPorId(p.getId()) != null){
            System.out.println("Ya existe un producto con ID: " + p.getId());
        }else {
            productos.add(p);
            System.out.println("Producto agregado: " + p.getNombre());
        }
    }
    
    public void listarProductos(){
        if(productos.isEmpty()){
            System.out.println("No hay productos cargados.");
            return;
        }
        System.out.println("Listado de productos en Inventario: ");
        for (Producto p : productos) {
            p.mostrarInfo();            
        }
    }
    
    public Producto buscarProductoPorId(String id){
        for (Producto p : productos) {
            if(p.getId().equalsIgnoreCase(id)){
                return p;
            }
            
        }
        return null;
    }
    
    public void eliminarProducto(String id) {
        Producto encontrado = buscarProductoPorId(id);
        if (encontrado != null) {
            productos.remove(encontrado);
            System.out.println("Producto eliminado: " + encontrado.getNombre());
        } else {
            System.out.println("No se encontró el producto con ID: " + id);
        }
    }
    
    public void actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            System.out.println("🔄Stock actualizado para " + p.getNombre() + ": " + nuevaCantidad);
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
    
    public void filtrarPorCategoria(CategoriaProducto categoria) {
        System.out.println("Productos de la categoría: " + categoria);
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                p.mostrarInfo();
            }
        }
    }
    
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }
    
    public Producto obtenerProductoConMayorStock() {
        return productos.stream()
                .max(Comparator.comparingInt(Producto::getCantidad))
                .orElse(null);
    }
    
    public void filtrarProductosPorPrecio(double min, double max) {
        System.out.println("💰 Productos con precio entre $" + min + " y $" + max + ":");
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                p.mostrarInfo();
            }
        }
    }
    
    public void mostrarCategoriasDisponibles() {
        System.out.println("📂 Categorías disponibles:");
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println("- " + c + ": " + c.getDescripcion());
        }
    }
    
}

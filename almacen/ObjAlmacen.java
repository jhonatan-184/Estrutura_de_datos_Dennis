public class ObjAlmacen {
    private String Nombre;
    private Double Precio;
    private int Stock;

    public ObjAlmacen(String nombre, Double precio, int stock) {
        Nombre = nombre;
        Precio = precio;
        Stock = stock;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setPrecio(Double precio) {
        precio = Precio;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        Stock = Stock;
    }
}
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
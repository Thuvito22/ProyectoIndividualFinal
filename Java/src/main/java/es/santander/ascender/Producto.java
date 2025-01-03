package es.santander.ascender;

public class Producto {

    private int cantidad;
    private float precio;
    private String nombre;
    private int id;
    public Producto() {

    }

    public Producto(String nombre, int cantidad, float precio, int id) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.id = id;
    }

    public int getId() {
        return id;

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {

        return cantidad;
    }

    public int anadirCantidad(int gominola) {
        cantidad = cantidad + gominola;

        return cantidad;
    }

    public float getPrecio() {

        return precio;

    }

    public boolean comprar(int cantidadComprar) {
        Producto producto;

        if (cantidadComprar <= cantidad) {
            System.out.println("Compra realizada");

            cantidad -= cantidadComprar;
            float precioTotal = precio * cantidadComprar;
            System.out.println("Compra realizada con exito: " + precioTotal);
            return true;

        } else {
            System.out.println("Sin stock suficiente");
            return false;
        }

    }

    public float calcularPrecioCompra(int cantidad) {
        float precioTotal = (cantidad * precio);
        return precioTotal;

    }

}

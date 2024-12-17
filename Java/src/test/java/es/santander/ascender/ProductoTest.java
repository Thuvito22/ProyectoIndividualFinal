package es.santander.ascender;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ProductoTest {
    @Test
    public void testAnadirCantidad() {
       Producto producto = new Producto();
        int resultado =producto.anadirCantidad(5);

        assertEquals(5, resultado);
        resultado=producto.anadirCantidad(10);
        assertEquals(15, resultado);
        

    }

    @Test
    void testGetCantidad() {

    }
}

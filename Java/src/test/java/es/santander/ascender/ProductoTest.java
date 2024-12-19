package es.santander.ascender;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import javax.swing.plaf.TreeUI;

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
    public void testComprarFalso() {
        Producto producto = new Producto();
        
        boolean resultado =producto.comprar(10);
        assertFalse(resultado);
        
    }

    @Test
    public void testComprar() {
        Producto producto = new Producto();
        producto.anadirCantidad(10);
        boolean resultado =producto.comprar(5);
        assertTrue(resultado);
        
    }


    @Test
    public void testCalcularPrecioCompra() {

        Producto producto = new Producto("gominola",20,2.5f);
        float precioTotal = producto.calcularPrecioCompra(18);
  
     
        assertEquals(45.0, precioTotal, 001);
        



        
    } 



}

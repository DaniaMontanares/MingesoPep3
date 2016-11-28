/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dania
 */
public class ProductosTest {
    
    public ProductosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setCodigo method, of class Productos.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        String codigo = "abc";
        Productos instance = new Productos();
        instance.setCodigo(Integer.parseInt(codigo));
        
    }

    /**
     * Test of setNombre method, of class Productos.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Productos instance = new Productos();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripcion method, of class Productos.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        Productos instance = new Productos();
        instance.setDescripcion(descripcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecio method, of class Productos.
     */
    @Test
    public void testSetPrecio() {
        System.out.println("setPrecio");
        int precio = 0;
        Productos instance = new Productos();
        instance.setPrecio(precio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFoto method, of class Productos.
     */
    @Test
    public void testSetFoto() {
        System.out.println("setFoto");
        String foto = "";
        Productos instance = new Productos();
        instance.setFoto(foto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCiudad method, of class Productos.
     */
    @Test
    public void testSetCiudad() {
        System.out.println("setCiudad");
        String ciudad = "";
        Productos instance = new Productos();
        instance.setCiudad(ciudad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombreAnunciante method, of class Productos.
     */
    @Test
    public void testSetNombreAnunciante() {
        System.out.println("setNombreAnunciante");
        String nombreAnunciante = "";
        Productos instance = new Productos();
        instance.setNombreAnunciante(nombreAnunciante);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelefonoAnunciante method, of class Productos.
     */
    @Test
    public void testSetTelefonoAnunciante() {
        System.out.println("setTelefonoAnunciante");
        int telefonoAnunciante = 0;
        Productos instance = new Productos();
        instance.setTelefonoAnunciante(telefonoAnunciante);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Productos.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Productos instance = new Productos();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Productos.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Productos instance = new Productos();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Productos.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Productos instance = new Productos();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_pyp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Pancho
 */
public class PicoyPlacaTest {
    
    public PicoyPlacaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of setPlacaparte1 method, of class PicoyPlaca.
     */
    @Test
    public void testSetPlacaparte1() {
        System.out.println("setPlacaparte1");
        String placaparte1 = "pcm";
        PicoyPlaca instance = new PicoyPlaca();
        instance.setPlacaparte1(placaparte1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlacaparte2 method, of class PicoyPlaca.
     */
    @Test
    public void testSetPlacaparte2() {
        System.out.println("setPlacaparte2");
        String placaparte2 = "3452";
        PicoyPlaca instance = new PicoyPlaca();
        instance.setPlacaparte2(placaparte2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class PicoyPlaca.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        String Fecha = "23/06/2003";
        PicoyPlaca instance = new PicoyPlaca();
        instance.setFecha(Fecha);
      
            
        
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHora method, of class PicoyPlaca.
     */
    @Test
    public void testSetHora() {
        System.out.println("setHora");
        String Hora = "06";
        PicoyPlaca instance = new PicoyPlaca();
        instance.setHora(Hora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMinutos method, of class PicoyPlaca.
     */
    @Test
    public void testSetMinutos() {
        System.out.println("setMinutos");
        String Minutos = "54";
        PicoyPlaca instance = new PicoyPlaca();
        instance.setMinutos(Minutos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarplacaletras method, of class PicoyPlaca.
     */
    @Test
    public void testValidarplacaletras() {
        System.out.println("validarplacaletras");
        PicoyPlaca instance = new PicoyPlaca();
        boolean expResult = false;
        boolean result = instance.validarplacaletras();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarFecha method, of class PicoyPlaca.
     */
    @Test
    public void testValidarFecha() {
        System.out.println("validarFecha");
        PicoyPlaca instance = new PicoyPlaca();
        boolean expResult = false;
        boolean result = instance.validarFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validarSiPuedeSalir method, of class PicoyPlaca.
     */
    @Test
    public void testValidarSiPuedeSalir() throws Exception {
        System.out.println("validarSiPuedeSalir");
        PicoyPlaca instance = new PicoyPlaca();
        String expResult = "<html>Puede circular sin ningún problema<html>";
        String result = instance.validarSiPuedeSalir();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!result.equals(expResult)){
            fail("The test case is a prototype.");
        }
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Sistema;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CRISTHIAN
 */
public class CarritoTest {
    
    public CarritoTest() {
    }

    @Test
    public void testHallarD() {
        Carrito c=new Carrito();
        assertEquals(20, c.hallarD(false, false, true), 20); 
    }

    @Test
    public void testMain() {
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Sistema;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProductosTest {
    
    public ProductosTest() {
    }

    @Test
    public void testHallarTotal() {
        Productos p=new Productos();
        assertEquals(400, p.hallarTotal(0, false, false, true, 0, 0, 2),400);
    }
}

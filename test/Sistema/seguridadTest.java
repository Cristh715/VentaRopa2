/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Sistema;

import org.junit.Test;
import static org.junit.Assert.*;

public class seguridadTest {
    
    public seguridadTest() {
    }

    @Test
    public void testComprobar() {
        seguridad s=new seguridad();
        assertEquals(true, s.comprobar("usuario1", "2022"));
    }
    
}

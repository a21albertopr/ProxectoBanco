
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package proxecto.proxectobanco;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Alberto
 */
public class ContaTest {
    
    public ContaTest() {
    }

    @org.junit.jupiter.api.Test
    public void testRetirar1() {
        System.out.println("Proba ao método retirar para o valor 100");
        float valor = 100;
        Conta instance = new Conta();
        boolean expResult = true;
        boolean result = instance.retirar(valor);
        assertEquals(expResult, result);
       
    }

    
        @org.junit.jupiter.api.Test
    public void testRetirar2() {
        System.out.println("Proba ao método retirar para o valor 2000");
        float valor = 2000;
        Conta instance = new Conta();
        boolean expResult = false;
        boolean result = instance.retirar(valor);
        assertEquals(expResult, result);
       
    }
    
    
    
    
    
    
    
    
    
}

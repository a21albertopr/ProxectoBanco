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

  

    @Test
    public void testIngresar() {
        System.out.println("ingresar funciona co valor 300");
        float valor = 300;
        Conta instance = new Conta();
        instance.ingresar(valor);
        
    }
    
    
    
    
    
    
    
    
    
}

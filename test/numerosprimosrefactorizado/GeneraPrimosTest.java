/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package numerosprimosrefactorizado;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alumno Tarde
 */
public class GeneraPrimosTest {
    
    public GeneraPrimosTest() {
    }

    @Test
    public void generarPrimos1() {
        int[] esperado = new int[0];
        int[] centArray = GeneraPrimos.generarPrimos(0);
        assertArrayEquals(esperado, centArray);
        }

    @Test
    public void generarPrimos2() {
        int[] esperado = new int[]{2};
        int[] centArray = GeneraPrimos.generarPrimos(2);
        assertArrayEquals(esperado, centArray);
        }

    @Test
    public void generarPrimos3() {
        int[] esperado = new int[]{2,3};
        int[] centArray = GeneraPrimos.generarPrimos(3);
        assertArrayEquals(esperado, centArray);
        }

    @Test
    public void generarPrimos4() {
        int[] esperado = new int[]{2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};
        int[] centArray = GeneraPrimos.generarPrimos(100);
        assertArrayEquals(esperado, centArray);
        }
    
}

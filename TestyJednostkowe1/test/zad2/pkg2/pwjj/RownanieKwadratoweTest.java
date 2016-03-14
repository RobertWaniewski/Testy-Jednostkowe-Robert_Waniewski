/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad2.pkg2.pwjj;

import TestyJednostkowe1.RownanieKwadratowe;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Seweryn
 */
public class RownanieKwadratoweTest {
    
    public RownanieKwadratoweTest() {
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
     * Test of oblicz method, of class RownanieKwadratowe.
     */
    @Test
    public void testOblicz() {
        System.out.println("oblicz");
        int a = 3;
        int b = 4;
        int c = 5;
        int x = 2;
        RownanieKwadratowe instance = new RownanieKwadratowe();
        int expResult = 25;
        int result = instance.oblicz(a, b, c, x);
        assertEquals("Blad przy wartosciach plusowych",expResult, result);
        
        
        
        
        expResult = -9;
        result = instance.oblicz(-a, -b, -c, -x);
        assertEquals("Blad przy wartosciach minusowych",expResult, result);
        
        
        expResult = -c;
        result = instance.oblicz(-a, -b, -c, 0);
        assertEquals("Blad przy x = 0",expResult, result);
        
        expResult = 0;
        result = instance.oblicz(0, 0, 0, 0);
        assertEquals("Blad przy zerowych wartosciach",expResult, result);
        
        
    }
    
}

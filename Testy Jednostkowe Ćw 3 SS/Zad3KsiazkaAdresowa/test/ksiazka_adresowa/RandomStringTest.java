/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ksiazka_adresowa;

import KsiazkaAdresowa.RandomString;
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
public class RandomStringTest {
    
    public RandomStringTest() {
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
     * Test of LosowyWyraz method, of class RandomString.
     */
    @Test
    public void testLosowyWyraz() {
        System.out.println("LosowyWyraz");
        int dlugosc = 5;
        
        String result = RandomString.LosowyWyraz(dlugosc);
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of LosoweImie method, of class RandomString.
     */
    @Test
    public void testLosoweImie() {
        System.out.println("LosoweImie");
        
        String result = RandomString.LosoweImie();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of LosoweNazwisko method, of class RandomString.
     */
    @Test
    public void testLosoweNazwisko() {
        System.out.println("LosoweNazwisko");
        
        String result = RandomString.LosoweNazwisko();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of LosowyTelefon method, of class RandomString.
     */
    @Test
    public void testLosowyTelefon() {
        System.out.println("LosowyTelefon");
        
        String result = RandomString.LosowyTelefon();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of LosowaUlica method, of class RandomString.
     */
    @Test
    public void testLosowaUlica() {
        System.out.println("LosowaUlica");
        
        String result = RandomString.LosowaUlica();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of LosowyNrDomu method, of class RandomString.
     */
    @Test
    public void testLosowyNrDomu() {
        System.out.println("LosowyNrDomu");
        
        String result = RandomString.LosowyNrDomu();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of LosowyKodPocztowy method, of class RandomString.
     */
    @Test
    public void testLosowyKodPocztowy() {
        System.out.println("LosowyKodPocztowy");
        
        String result = RandomString.LosowyKodPocztowy();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of LosowaMiejscowosc method, of class RandomString.
     */
    @Test
    public void testLosowaMiejscowosc() {
        System.out.println("LosowaMiejscowosc");
        
        String result = RandomString.LosowaMiejscowosc();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

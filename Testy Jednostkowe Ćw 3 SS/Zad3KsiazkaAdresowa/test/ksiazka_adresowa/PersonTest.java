/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ksiazka_adresowa;

import KsiazkaAdresowa.Person;
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
public class PersonTest {
    
    public PersonTest() {
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
     * Test of toString method, of class Person.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Person instance = new Person("Seweryn","Siedlecki","Bajana","3","Sosnowiec","41-200","609609609");
        String expResult = "Nazwisko: Siedlecki Imie: Seweryn, Adres: Bajana 3, 41-200 Sosnowiec, Tel: 609609609";
    
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Person.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Person o = new Person("Seweryn2","Siedlecki2","Bajana2","32","Sosnowiec2","41-2002","6096096092");
        Person instance = new Person("Seweryn","Siedlecki","Bajana","3","Sosnowiec","41-200","609609609");
        int expResult = -1;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

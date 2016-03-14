/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testy_jednostkowe.v.pkg2;

import TestyJednostkowe2.Testy_jednostkoweV2;
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
public class Testy_jednostkoweV2Test {
    
    public Testy_jednostkoweV2Test() {
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
     * Test of main method, of class Testy_jednostkoweV2.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        long start_array = System.currentTimeMillis();
        String[] args = null;
        Testy_jednostkoweV2.main(args);
        long stop_array = System.currentTimeMillis();
       
        System.out.println("Czas wykonania aplikacji: "+(stop_array-start_array)+" ms");
        
    }
    
}

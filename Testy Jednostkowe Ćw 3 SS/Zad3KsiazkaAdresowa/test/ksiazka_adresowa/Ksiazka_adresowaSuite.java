/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ksiazka_adresowa;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Seweryn
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ksiazka_adresowa.PersonTest.class, ksiazka_adresowa.Ksiazka_AdresowaTest.class, ksiazka_adresowa.RandomStringTest.class})
public class Ksiazka_adresowaSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}

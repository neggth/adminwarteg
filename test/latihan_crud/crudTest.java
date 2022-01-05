/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_crud;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import latihan_crud.crud;
import latihan_crud.Login;
import latihan_crud.Menu;
import latihan_crud.tabel;

/**
 *
 * @author bryan
 */
public class crudTest {
    
    public crudTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of TestTambah method, of class crud.
     */
    @Test
    public void testTestTambah() {
        crud c = new crud();
        assertTrue(c.TestTambah());
    }

    @Test
    public void testTestCari() {
        crud c = new crud();
        assertTrue(c.TestCari());
    }
    
    @Test
    public void testTestUpdate() {
        crud c = new crud();
        assertTrue(c.TestUpdate());
    }

    @Test
    public void testTestDelete() {
        crud c = new crud();
        assertTrue(c.TestDelete());
    }
    
    @Test
    public void testLogin() {
        Login l = new Login();
        assertNotNull(l);
    }
    
    @Test
    public void testMenu() {
        Menu m = new Menu();
        assertNotNull(m);
    }
    @Test
    public void testtabel() {
        tabel t = new tabel();
        assertNotNull(t);
    }
    /**
     * Test of main method, of class crud.
     */
}

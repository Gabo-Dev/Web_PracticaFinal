/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jhony
 */
public class UsuariosTest {
    
    public UsuariosTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Usuarios.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Usuarios instance = new Usuarios();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Usuarios.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Usuarios instance = new Usuarios();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPass method, of class Usuarios.
     */
    @Test
    public void testGetPass() {
        System.out.println("getPass");
        Usuarios instance = new Usuarios();
        String expResult = "";
        String result = instance.getPass();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPass method, of class Usuarios.
     */
    @Test
    public void testSetPass() {
        System.out.println("setPass");
        String pass = "";
        Usuarios instance = new Usuarios();
        instance.setPass(pass);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Usuarios.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Usuarios instance = new Usuarios();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Usuarios.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Usuarios instance = new Usuarios();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Usuarios.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Usuarios instance = new Usuarios();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Usuarios.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        Usuarios instance = new Usuarios();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Usuarios.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Usuarios instance = new Usuarios();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Usuarios.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Usuarios instance = new Usuarios();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Usuarios.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Usuarios instance = new Usuarios();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

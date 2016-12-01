/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuitinfojenkinstest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author TSXN4236
 */
public class ChienTest {
    
    public ChienTest() {
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
     * Test of cri method, of class Chien.
     */
    @Test
    public void testCri() {
        System.out.println("cri");
        Chien instance = new Chien();
        String expResult = "wouf";
        String result = instance.cri();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of cri method, of class Chien.
     */
    @Test
    public void testCri_faux() {
        System.out.println("cri doiit etre faux");
        Chien instance = new Chien();
        String expResult = "machin";
        String result = instance.cri();
        assertEquals(expResult, result);
    }
    
}

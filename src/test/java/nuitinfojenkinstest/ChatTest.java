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
public class ChatTest {
    
    public ChatTest() {
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
     * Test of cri method, of class Chat.
     */
    @Test
    public void testCri() {
        System.out.println("cri");
        Chat instance = new Chat();
        String expResult = "miaule";
        String result = instance.cri();
        assertEquals(expResult, result);
    }
    
}

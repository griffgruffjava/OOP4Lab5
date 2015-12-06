/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Finbar
 */
public class MyPowTest
{
    
    public MyPowTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of myPow method, of class MyPow.
     */
    @Test
    public void testMyPow()
    {
        System.out.println("myPow");
        int x = 5;
        int y = 2;
        int expResult = 25;
        int result = MyPow.myPow(x, y);
        assertEquals(expResult, result);
        
        System.out.println("myPow2");
         x = 6;
        y = 6;
        expResult = 46656;
        result = MyPow.myPow(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        System.out.println("myPow2");
         x = 6;
        y = 0;
        expResult = 1;
        result = MyPow.myPow(x, y);
        assertEquals(expResult, result);
    }
    
}

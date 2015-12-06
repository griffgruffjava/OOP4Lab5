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
public class FibonacciTest
{
    
    public FibonacciTest()
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
     * Test of fib_iter method, of class Fibonacci.
     */
    @Test
    public void testFib_iter()
    {
        System.out.println("fib_iter");
        int n = 4;
        int expResult = 3;
        int result = Fibonacci.fib_iter(n);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of fib_recur method, of class Fibonacci.
     */
    @Test
    public void testFib_recur()
    {
        System.out.println("fib_recur");
        int n = 4;
        int expResult = 3;
        int result = Fibonacci.fib_recur(n);
        assertEquals(expResult, result);
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author Finbar
 */
public class Fibonacci
{
    public static int fib_iter(int n)
    {
        int[] fib =  new int[n+1];
        
        if(n==0)
                fib[n] = 0;
        else if(n==1)
                fib[n] = 1;
        else
        {
            fib[0]=0;
            fib[1]=1;
        }
        
        for(int i = 2; i<=n; i++)
        {
            fib[i] = fib[i-1]+fib[i-2];       
        }
        return fib[n];
    }
    
    public static int fib_recur(int n)
    {
        
        if(n==0)
                return 0;
        else if(n==1)
                return 1;
        else
        {
            return fib_recur(n-1) + fib_recur(n-2);
        }
        
    }
}

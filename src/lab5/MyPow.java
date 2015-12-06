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
public class MyPow
{

    public static int myPow(int x, int y)
    {

        if (y == 0)
        {
            return 1;
        } else
        {
            return x * myPow(x, (y - 1));
        }
    }

}

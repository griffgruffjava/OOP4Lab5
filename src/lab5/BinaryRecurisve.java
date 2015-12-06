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
public class BinaryRecurisve
{
    public static int binaryRecursive( int array[], int key )
    {
          int low = 0;
          int high = array.length-1;
          return binarySearchRecursive(array, key, high, low);
    
    }
    
     private static int binarySearchRecursive(int array[],int key, int high, int low)
    {
        int middle = (high-low)/2;
    
        if(array[key] == array[middle])
            return middle;
        else if(low>high)
            return -1;
        else if (key < array[middle])
            return binarySearchRecursive(array, key, middle-1, low);
        else
            return binarySearchRecursive(array, key, high, middle+1);    
    }
}


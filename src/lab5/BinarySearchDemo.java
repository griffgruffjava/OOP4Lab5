package lab5;

public class BinarySearchDemo
{
   public static void main(String[] args)
   {
        int[] list = {4, 6, 7, 10, 12, 13};

        int index = binarySearch(list, 2);
        int index2 = binSearchRec(list, 2);
        System.out.println("6 was found at position " + index);
        System.out.println("6 was found at position " + index2);
        
        index = binarySearch(list, 4);
        index2 = binSearchRec(list, 4);
        System.out.println("6 was found at position " + index);
        System.out.println("6 was found at position " + index2);
        
        index = binarySearch(list, 12);
        index2 = binSearchRec(list, 12);
        System.out.println("6 was found at position " + index);
        System.out.println("6 was found at position " + index2);
        
        index = binarySearch(list, 13);
        index2 = binSearchRec(list, 13);
        System.out.println("6 was found at position " + index);
        System.out.println("6 was found at position " + index2);
        
        index = binarySearch(list, 18);
        index2 = binSearchRec(list, 18);
        System.out.println("6 was found at position " + index);
        System.out.println("6 was found at position " + index2);
    }	

   // Binary search
   public static int binarySearch( int array[], int key ) 
   {
      int low = 0;                  // low subscript
      int high = array.length - 1;  // high subscript
      int middle;                   // middle subscript

      while ( low <= high ) {
         middle = ( low + high ) / 2;

         if ( key == array[ middle ] )  // match
            return middle;
         else if ( key < array[ middle ] )
            high = middle - 1;  // search low end of array
         else
            low = middle + 1;   // search high end of array
      }

      return -1;   // searchKey not found
   }
   
   public static int binSearchRec(int array[], int key)
   { 
       return subBinSearch(0,array.length - 1,key, array);
   }
   
   private static int subBinSearch(int low, int high, int key, int array[])
   {
       if(low<=high)
       {
       int middle = (low + high) / 2;
       
       if(key == array[middle])
           return middle;
       else if( key < array[ middle ] )
           return subBinSearch(low, middle-1, key, array);
       else if( key > array[ middle ] )
           return subBinSearch(middle+1, high, key, array);
       }
       return -1;
       
   }
}
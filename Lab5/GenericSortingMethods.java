package sortingsearching;

/**
 * Implement the generic versions of sorting algorithms
 * Selection Sort, Insertion Sort and Bubblesort
 * Using the Comparable Interface
 * 
 * @author T.M. Rao
 * @version September 2018
 * 
 */

public class GenericSortingMethods
{
    //-----------------------------------------------------------------
    private static int numComps = 0;
    /**
     * swap procedure
     * @param Comparable[] a -- the array in which the swapping is done
     * @param i
     * @param j  -- the two locations in the array that will be swapped
     */
    public static void swap(Comparable[] a, int i, int j)
    {
       Comparable temp = a[i];
       a[i] = a[j];
       a[j] = temp;
    }
    
     //-----------------------------------------------------------------
    /**
     * findSmallestLoc -- Locates the smallest element in the array between 
     * array positions start and end
     * @param int[] a -- the array in which the locating is to be done
     * @param start -- starting location 
     * @param end -- end location
     * This is called by the selectionSort method
     */
    
    public int select(Comparable[] a, int k)
    { 
        //find the location of the smallest element in the array
        //between position k and the end of the array
        int smallestPos = k;
        for (int j = k; j < a.length; j++)
        {
            numComps++; 
            if (a[j].compareTo(a[smallestPos]) < 0)
                smallestPos = j;
        }
        return smallestPos;
    }
    
     //-----------------------------------------------------------------
    /**
     * The selection sort method: sorts the given unsorted array a
     * @param Comparable[] a -- the array to be sorted
     * calls: findSmallestLoc and swap methods
     * Time Complexity: O(N ** 2)
     */
    public void selectionSort(Comparable[] a)
    {
        int pos;     //position of the smallest elelemt
        int temp;    //temp variable for swap
        numComps = 0;
        
        for (int k = 0; k < a.length-1; k++)
        {
            pos = select(a, k); //find the smallest element
            swap(a, k, pos);    
        }
        System.out.println("NumComps = "+numComps); 
    }
    
    //-----------------------------------------------------------------  
    /**
     * The insertion sort method: Sorts the given array a
     * 
     * @param Comparable[] a -- the array to be sorted
     * calls: insert and swap methods
     * Time Complexity: O(N ** 2)
     */
    public void insertionSort(Comparable a[])
    {
        numComps = 0;
        for (int k = 1; k < a.length; k++)
        {
           insert(a, a[k], k-1);   
        }
         System.out.println("NumComps = "+numComps); 
    }
    
    //-----------------------------------------------------------------
    /**
     * The insert method. It is assumed that the part of the array between 
     * position 0 and position end is sorted. It inserts a new element x into 
     * the array, by moving other elements down and making space for the new 
     * element. It maintains the increasing order of the array.
     * @param Comparable[] a - the sorted array into which insertion is made
     * @param x -- the integer that is to be inserted
     * @param end -- array is assumed to be sorted from 0 to end
     * 
     * Called by: the insertionSort method
     */
    
    public void insert(Comparable a[], Comparable x, int end)
    {
        int k = end; 
        boolean done = false;
        
        while ((k >= 0) && (! done))
        {
           // As long as the element in the array is > x, keep moving
           // it one position down.
           numComps++;
           if (a[k].compareTo(x)>0)
           {
              a[k+1] = a[k];
              k--;
           }
           // Stop moving elements down as soon as you find an element >= x
           else
           {
              done = true;
           }
        }
        // Insert the new element at position k+1
        a[k+1] = x;
    }
    
    //-----------------------------------------------------------------
    /**
     * pass: It makes one "pass" over the data, starting at position 0 up to
     * position end. It compares a[0] with a[1], a[1] with a[2] ... and
     * a[end-1] with a[end], and makes a swap if necessary. In case it swaps
     * it will record that fact by setting didSwap to true. This is what is 
     * returned by the method.
     * @param Comparable[] a -- the array to be sorted
     * @param end -- 0 to end is the part of the array to focus on. 
     * The elements at positions end+1 ... will be sorted.
     */
    
    public static boolean pass(Comparable[] a, int end)
    {
        boolean didSwap = false;
        for (int k = 0; k < end; k++)
        {
            numComps++;
            if (a[k].compareTo(a[k+1]) > 0)
            {
               swap(a, k, k+1);
               didSwap = true;
            }
        }
        return didSwap;
    }
    
    //-----------------------------------------------------------------
    /**
     * The bubblesort method.  It makes as many "pass"es as needed over the
     * array until it is sorted. 
     * @param Comparable[] a -- the array to be sorted
     * Time Complexity: O(N ** 2)
     */
    
    public static void bubbleSort(Comparable[] a)
    {
        numComps = 0;
        boolean swapped = true; 
   	  // Keep track of whether we made a swap in this pass
        // Initially set to true, because we have to make at
        // least one pass
        int passCount = 0;      
  // Counts the number of passes. We need no more than
        // n-1 passes, where n is the length of the array
        int end = a.length-1;   
  // 0 to end is the part of the array to focus on
        // Loop as long as passCount < n-1 and we have made a swap
        while ((passCount < a.length-1) && (swapped))
        {
           swapped = pass(a, end);
           passCount++;
           end--;
        }
         System.out.println("NumComps = "+numComps); 
    }

    public static int getNumComps()
    {
		return numComps;
    }
}

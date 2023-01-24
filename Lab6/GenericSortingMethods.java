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
     * The insert method. It is assimed that the part of the array between 
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

//-----------------------------------------------------------------
    /**
     * This is the main quicksort method. It just sets the parameters
     * properly and calls another quicksort method to sort it
     */
    public static void quickSort(Comparable[] a)
    {
        numComps = 0;
        quickSort(a, 0, a.length-1);  
        System.out.println("NumComps = "+numComps); 
    }
    
    //-----------------------------------------------------------------
    /**
     * This is the recursive quicksort method. It first partitions the
     * array into two parts such that all elements in the first part
     * are less than all elements in the second part. It then recursively
     * calls itself on both.
     * @param Comparable[] a -- the array to be sorted
     * Worst Case Time Complexity: O(N ** 2)
     * Average case: O(N log N)
     */
    public static void quickSort(Comparable[] a, int first, int last)
    {
        if (first < last)
        {
            int pivotIndex = partition(a, first, last);
            //System.out.println("first = "+first+ " last = "+last
                //+ " pivot = "+pivotIndex);
            quickSort(a, first, pivotIndex-1);
            quickSort(a, pivotIndex+1, last);
        }
    }
    
    //-----------------------------------------------------------------
    /**
     * This is a private supporting method for quicksort. It just does
     * the partitionaing of the array.
     * @param first: the start index of the sub-array
     * @param last: the end index of the sub-array
     */
    private static int partition(Comparable[] a, int first, int last)
    {
        Comparable pivot = a[first];
        int up = first;
        int down = last;
        
        do
        {         
            while ( (up < last) && (pivot.compareTo(a[up]) >= 0))
            {          
                numComps++;
                //System.out.println("Numcomps = "+numComps);
                up++;
            }
            while ( pivot.compareTo(a[down]) < 0)
            {
                numComps++;
                //System.out.println("Numcomps = "+numComps);
                down--;
            }
            if (up < down)
                swap(a, up, down);
        } while (up < down);
        swap(a, first, down);
        return down;
    }
    
    
    //-----------------------------------------------------------------
    /**
     * The linear search (sequential search method. If the array is not
     * sorted, this is the only way you can search.
     * @param Comparable[] a -- the array in which we are searching
     * @param x -- The value that we are searching for
     * Time Complexity: O(N)
     */
    public int linSearch(Comparable[] a, Comparable x)
    {
        numComps = 0;
        for (int i = 0; i < a.length; i++)
        {
          if (a[i].compareTo(x) == 0) return i;
          numComps++;
        }
        return -1;
    }
    
    //-----------------------------------------------------------------
    /**
     * binary search method. This will work only if the array is sorted.
     * @param Comparable[] a -- the array in which we are searching
     * @param x -- The value that we are searching for
     * Time complexity O(log N)
     */
    public int binSearch(Comparable[] a, Comparable x)
    {
        
        int h = a.length-1;
        int l = 0;
        int mid = 0;
        numComps = 0;
        while (l <= h)
        {
            mid = (l+h)/2;
            numComps++;
            if (x.compareTo(a[mid]) == 0) return mid;
            else if (x.compareTo(a[mid]) > 0) l = mid+1;
            else h = mid-1;
        }
        return -1;
    }
    
    /**
     * It is assumed that:
     * Two parts of the array a: a[start1] to a[start2-1] and 
     * a[start2] to a[end2] are sorted. end2 >= start2 >= start1
     * This will merge those two parts to make one long
     * sorted part between a[start1] to a[end2]
     */
    public void merge(Comparable[] a, int start1, int start2, int end2)
    {
        
        int c1 = start1; //Counter for the first  half of the sorted array
        int c2 = start2; //Counter for the second half of the sorted array
        int sortedCounter = 0; //Counter for the sorted array
        
        //Temporary array for the merged elements
        Object [] b = new Object[end2 - start1 +1];
        
        //Scan the sorted array a and keep filling b by elements from a or
        //b, depending on which is smaller
        while (c1 < start2 && c2 <= end2)
        {
            //If a[c1] < a[c2], move a[c1] into b and increment c1
            if (a[c1].compareTo(a[c2]) < 0)
            {
                b[sortedCounter] = a[c1];
                sortedCounter++;
                c1++;
                numComps++;
            }
            //If a[c1] > a[c2], move a[c2] into b and increment c2
            else if (a[c1].compareTo(a[c2]) > 0)
            {
                b[sortedCounter] = a[c2];
                sortedCounter++;
                c2++;
                numComps++;
            }
            //If a[c1] == a[c2], move both a[c1] and a[c2] into b and 
            //increment both c1 and c2
            else
            {
                b[sortedCounter] = a[c1];
                sortedCounter++;
                b[sortedCounter] = a[c2];
                sortedCounter++;
                c1++;
                c2++;
            }
        }
        //Copy the rest of the elements from first half
        while (c1 < start2)
        {
            b[sortedCounter] = a[c1];
            sortedCounter++;
            c1++;
        }
        //Copy the rest of the elements from second half
        while (c2 <= end2)
        {
            b[sortedCounter] = a[c2];
            sortedCounter++;
            c2++;
        }
        //Finally copy all the elements from b to a.
        for (int k = start1; k <= end2; k++)
        {
            a[k] = (Comparable)b[k-start1];
        }       
    }
    

    /**
     * This is the top-level call to the merge sort algorithm
     * @param a: the array to be sorted
     */
    public void mergeSort(Comparable[] a)
    {
        numComps = 0;
        mergeSort(a, 0, a.length-1);   
        System.out.println("NumComps = "+numComps);
    }
    
    /**
     * This is the recursive method that actually sorts
     */
    public void mergeSort(Comparable[] a, int start, int end)
    {
        int len = end - start + 1;
        int half = len/2;
        if (len > 1)
        {
            mergeSort(a, start, start+half-1); //sort first half
            mergeSort(a, start+half, end);//sort second half
            merge(a, start, start+half, end);
        }
    }
    public static int getNumComps()
    {
		return numComps;
    }
}

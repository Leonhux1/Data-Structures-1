// package sortingsearching
package sortingsearching;

// imports
import java.util.*;
import java.lang.*;

// class SortComparator
class SortComparator {
   public static void main(String[] args) {
   
      // three Integer tyoe arrays
      Integer[] a = new Integer[128];
      Integer[] b = new Integer[128];
      Integer[] c = new Integer[128];
      
      // integer that will hold the random value;
      int no = 0;
      
      // for loop to fill in three arrays with the same numbers
      // at same positions
      for(int k = 0; k < 128; k++) {
         no = (int) (Math.random() * 100000);
         a[k] = no;
         b[k] = no;
         c[k] = no;
      }
      
      // objects of the GenericSortingMethods created and appropriate 
      // different searching methods are called on the three arrays 
      // accordingly. Results printed by default.
      GenericSortingMethods obj1 = new GenericSortingMethods();
      obj1.selectionSort(a);
      GenericSortingMethods obj2 = new GenericSortingMethods();
      obj2.insertionSort(b);
      GenericSortingMethods obj3 = new GenericSortingMethods();
      obj3.bubbleSort(c);
      
      

   }
}
   
  
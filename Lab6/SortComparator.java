package sortingsearching;

import java.util.*;
import java.text.*;
import java.lang.*;

class SortComparator {
   public static void main(String[] args) {
  
      final int SIZE = 8192;
      Integer[] a = new Integer[SIZE];
      Integer[] b = new Integer[SIZE];
      for( int k = 0; k < SIZE; k++) {
         a[k] = (int) (Math.random() * 100000);
         b[k] = a[k];
      }
      
      GenericSortingMethods obj1 = new GenericSortingMethods();
      obj1.quickSort(a);
      GenericSortingMethods obj2 = new GenericSortingMethods();
      obj2.mergeSort(a);

   }
}
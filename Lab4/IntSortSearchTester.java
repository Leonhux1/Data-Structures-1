// package to organize all files
package TestingAndComplexity;
import java.util.*;

// class that tests the IntSortSearch class
public class IntSortSearchTester {

   // method for testing the linearSearch algorithm
   public static void linearSearchTester() {
      
      // arrays declared and filled according to test cases
      // one element, element in array
      int searchVal = 3;
      int expectedValue = 3;
      int[] array1 = {3};
      System.out.println("Array:" + Arrays.toString(array1));
      System.out.println("Search Value: " + searchVal);
      int answer = IntSortSearch.linearSearch(array1, searchVal);
      System.out.println("Expected Result: " + (expectedValue == searchVal));
      if(answer != -1) {
         System.out.println("Result: true");
      }
      else {
         System.out.println("Result: false");
      }
      System.out.println();
      
      
      // one element, element being searched for not in array
      searchVal = 5;
      expectedValue = 4;
      int[] array2 = {4};
      System.out.println("Array:" + Arrays.toString(array2));
      System.out.println("Search Value: " + searchVal);
      answer = IntSortSearch.linearSearch(array2, searchVal);
      System.out.println("Expected Result: " + (expectedValue == searchVal));
      if(answer != -1) {
         System.out.println("Result: true");
      }
      else {
         System.out.println("Result: false");
      }
      System.out.println();
      
      
      
      // two unequal elements, value in array
      int[] array3 = {1, 3};
      searchVal = 3;
      expectedValue = 3;
      System.out.println("Array:" + Arrays.toString(array3));
      System.out.println("Search Value: " + searchVal);
      answer = IntSortSearch.linearSearch(array3, searchVal);
      System.out.println("Expected Result: " + (expectedValue == searchVal));
      if(answer != -1) {
         System.out.println("Result: true");
      }
      else {
         System.out.println("Result: false");
      }
      System.out.println();
      
      
     
      // two elements, value is not any of the elements
      int[] array4  = {1, 5};
      searchVal = 6;
      expectedValue = 5;
      System.out.println("Array:" + Arrays.toString(array4));
      System.out.println("Search Value: " + searchVal);
      answer = IntSortSearch.linearSearch(array4, searchVal);
      System.out.println("Expected Result: " + (expectedValue == searchVal));
      if(answer != -1) {
         System.out.println("Result: true");
      }
      else {
         System.out.println("Result: false");
      }
      System.out.println();
      
      
      // three elements, value is very first element
      int[] array5 = {3, 5, 6};
      searchVal = 3;
      expectedValue = 3;
      System.out.println("Array:" + Arrays.toString(array5));
      System.out.println("Search Value: " + searchVal);
      answer = IntSortSearch.linearSearch(array5, searchVal);
      System.out.println("Expected Result: " + (expectedValue == searchVal));
      if(answer != -1) {
         System.out.println("Result: true");
      }
      else {
         System.out.println("Result: false");
      }
      System.out.println();
      
      
      // three elements, value is in middle
      int[] array6 = {5, 3, 6};
      searchVal = 3;
      expectedValue = 3;
      System.out.println("Array:" + Arrays.toString(array6));
      System.out.println("Search Value: " + searchVal);
      answer = IntSortSearch.linearSearch(array6, searchVal);
      System.out.println("Expected Result: " + (expectedValue == searchVal));
      if(answer != -1) {
         System.out.println("Result: true");
      }
      else {
         System.out.println("Result: false");
      }
      System.out.println();
      
      
      // three elements, value is in very last
      int[] array7 = {5, 6, 3};
      searchVal = 3;
      expectedValue = 3;
      System.out.println("Array:" + Arrays.toString(array7));
      System.out.println("Search Value: " + searchVal);
      answer = IntSortSearch.linearSearch(array7, searchVal);
      System.out.println("Expected Result: " + (expectedValue == searchVal));
      if(answer != -1) {
         System.out.println("Result: true");
      }
      else {
         System.out.println("Result: false");
      }
      System.out.println();
      
      
      // three elements, value not in array
      int[] array8 = {5, 6, 8};
      searchVal = 3;
      expectedValue = 8;
      System.out.println("Array:" + Arrays.toString(array8));
      System.out.println("Search Value: " + searchVal);
      answer = IntSortSearch.linearSearch(array8, searchVal);
      System.out.println("Expected Result: " + (expectedValue == searchVal));
      if(answer != -1) {
         System.out.println("Result: true");
      }
      else {
         System.out.println("Result: false");
      }
      System.out.println();
      
   }
   
   // method for testing the binarySearch algorithm
   public static void binarySearchTester() {
   
      // arrays declared and filled according to test cases
      // one element, element in array
      int searchVal = 3;
      int expectedValue = 3;
      int[] array1 = {3};
      System.out.println("Array:" + Arrays.toString(array1));
      System.out.println("Search Value: " + searchVal);
      int answer = IntSortSearch.linearSearch(array1, searchVal);
      System.out.println("Expected Result: " + (expectedValue == searchVal));
      if(answer != -1) {
         System.out.println("Result: true");
      }
      else {
         System.out.println("Result: false");
      }
      System.out.println();
      
      
      // one element, element being searched for not in array
      searchVal = 5;
      expectedValue = 4;
      int[] array2 = {4};
      System.out.println("Array:" + Arrays.toString(array2));
      System.out.println("Search Value: " + searchVal);
      answer = IntSortSearch.linearSearch(array2, searchVal);
      System.out.println("Expected Result: " + (expectedValue == searchVal));
      if(answer != -1) {
         System.out.println("Result: true");
      }
      else {
         System.out.println("Result: false");
      }
      System.out.println();
      
      
      
      // two unequal elements, value in array
      int[] array3 = {1, 3};
      searchVal = 3;
      expectedValue = 3;
      System.out.println("Array:" + Arrays.toString(array3));
      System.out.println("Search Value: " + searchVal);
      answer = IntSortSearch.linearSearch(array3, searchVal);
      System.out.println("Expected Result: " + (expectedValue == searchVal));
      if(answer != -1) {
         System.out.println("Result: true");
      }
      else {
         System.out.println("Result: false");
      }
      System.out.println();
      
      
     
      // two elements, value is not any of the elements
      int[] array4  = {1, 5};
      searchVal = 6;
      expectedValue = 5;
      System.out.println("Array:" + Arrays.toString(array4));
      System.out.println("Search Value: " + searchVal);
      answer = IntSortSearch.linearSearch(array4, searchVal);
      System.out.println("Expected Result: " + (expectedValue == searchVal));
      if(answer != -1) {
         System.out.println("Result: true");
      }
      else {
         System.out.println("Result: false");
      }
      System.out.println();
      
      
      // three elements, value is very first element
      int[] array5 = {3, 5, 6};
      searchVal = 3;
      expectedValue = 3;
      System.out.println("Array:" + Arrays.toString(array5));
      System.out.println("Search Value: " + searchVal);
      answer = IntSortSearch.linearSearch(array5, searchVal);
      System.out.println("Expected Result: " + (expectedValue == searchVal));
      if(answer != -1) {
         System.out.println("Result: true");
      }
      else {
         System.out.println("Result: false");
      }
      System.out.println();
      
      
      // three elements, value is in middle
      int[] array6 = {5, 3, 6};
      searchVal = 3;
      expectedValue = 3;
      System.out.println("Array:" + Arrays.toString(array6));
      System.out.println("Search Value: " + searchVal);
      answer = IntSortSearch.linearSearch(array6, searchVal);
      System.out.println("Expected Result: " + (expectedValue == searchVal));
      if(answer != -1) {
         System.out.println("Result: true");
      }
      else {
         System.out.println("Result: false");
      }
      System.out.println();
      
      
      // three elements, value is in very last
      int[] array7 = {5, 6, 3};
      searchVal = 3;
      expectedValue = 3;
      System.out.println("Array:" + Arrays.toString(array7));
      System.out.println("Search Value: " + searchVal);
      answer = IntSortSearch.linearSearch(array7, searchVal);
      System.out.println("Expected Result: " + (expectedValue == searchVal));
      if(answer != -1) {
         System.out.println("Result: true");
      }
      else {
         System.out.println("Result: false");
      }
      System.out.println();
      
      
      // three elements, value not in array
      int[] array8 = {5, 6, 8};
      searchVal = 3;
      expectedValue = 8;
      System.out.println("Array:" + Arrays.toString(array8));
      System.out.println("Search Value: " + searchVal);
      answer = IntSortSearch.linearSearch(array8, searchVal);
      System.out.println("Expected Result: " + (expectedValue == searchVal));
      if(answer != -1) {
         System.out.println("Result: true");
      }
      else {
         System.out.println("Result: false");
      }
      System.out.println();   
   }
   
   // method that tests the SelectionSort method
   public static void sortTester() {
   
      // arrays declared and filled according to test cases
      // only one element
      int[] array1 = {2};
      int[] expectedArray1 = {2};
      System.out.println("Orignal Array: " + Arrays.toString(array1));
      IntSortSearch.selectionSort(array1);
      System.out.println("Expected Sorted Array: " + Arrays.toString(expectedArray1));
      boolean compare = IntSortSearch.compareIntArrays(array1, expectedArray1);
      System.out.println("Expected Result: true");
      System.out.println("Result: " + compare);
      System.out.println();
      
      
      // two unequal elements
      int[] array2 = {1, 2};
      int[] expectedArray2 = {1,2};
      System.out.println("Orignal Array: " + Arrays.toString(array2));
      IntSortSearch.selectionSort(array2);
      System.out.println("Expected Sorted Array: " + Arrays.toString(expectedArray2));
      compare = IntSortSearch.compareIntArrays(array2, expectedArray2);
      System.out.println("Expected Result: true");
      System.out.println("Result: " + compare);
      System.out.println();
      
      
      // sorted
      int[] array3 = {1, 2, 3};
      int[] expectedArray3 = {1, 2, 3};
      System.out.println("Orignal Array: " + Arrays.toString(array3));
      IntSortSearch.selectionSort(array3);
      System.out.println("Expected Sorted Array: " + Arrays.toString(expectedArray3));
      compare = IntSortSearch.compareIntArrays(array3, expectedArray3);
      System.out.println("Expected Result: true");
      System.out.println("Result: " + compare);
      System.out.println();
      
      
      // sorted in reverse order
      int[] array4 = {3, 2, 1};
      int[] expectedArray4 = {1, 2, 3};
      System.out.println("Orignal Array: " + Arrays.toString(array4));
      IntSortSearch.selectionSort(array4);
      System.out.println("Expected Sorted Array: " + Arrays.toString(expectedArray4));
      compare = IntSortSearch.compareIntArrays(array4, expectedArray4);
      System.out.println("Expected Result: true");
      System.out.println("Result: " + compare);
      System.out.println();
      
      
      // all negative
      int[] array5 = {-1, -2, -3};
      int[] expectedArray5 = {-3, -2, -1};
      System.out.println("Orignal Array: " + Arrays.toString(array5));
      IntSortSearch.selectionSort(array5);
      System.out.println("Expected Sorted Array: " + Arrays.toString(expectedArray5));
      compare = IntSortSearch.compareIntArrays(array5, expectedArray5);
      System.out.println("Expected Result: true");
      System.out.println("Result: " + compare);
      System.out.println();
      
      
      // one negative, one zero, one five
      int[] array6 = {-1, 0, 5};
      int[] expectedArray6 = {-1, -0, 5};
      System.out.println("Orignal Array: " + Arrays.toString(array6));
      IntSortSearch.selectionSort(array6);
      System.out.println("Expected Sorted Array: " + Arrays.toString(expectedArray6));
      compare = IntSortSearch.compareIntArrays(array6, expectedArray6);
      System.out.println("Expected Result: true");
      System.out.println("Result: " + compare);
      System.out.println();
      
      
      // same elements
      int[] array7 = {5, 5, 5};
      int[] expectedArray7 = {5, 5, 5};
      System.out.println("Orignal Array: " + Arrays.toString(array7));
      IntSortSearch.selectionSort(array7);
      System.out.println("Expected Sorted Array: " + Arrays.toString(expectedArray7));
      compare = IntSortSearch.compareIntArrays(array7, expectedArray7);
      System.out.println("Expected Result: true");
      System.out.println("Result: " + compare);
      System.out.println();
   }
   
   // Main method that tests all the methods declared in this class.
   public static void main(String[] args) {
   
      // calling linearSearchTester
      System.out.println("Linear Search Test Results:");
      System.out.println("***************************");
      linearSearchTester();
      
      // calling binarySearchTester
      System.out.println("Binary Search Test Results:");
      System.out.println("***************************");
      binarySearchTester();
      
      // calling sortTester
      System.out.println("Selection Sort Test Results:");
      System.out.println("***************************");
      sortTester();
      
      
   }
      
}
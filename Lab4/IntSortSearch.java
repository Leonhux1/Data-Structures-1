// a package to oraganize all files
package TestingAndComplexity;

public class IntSortSearch {

   private static int numComps = 0;
   
   //--------------------------------------------------
   
   public static int getNumComps() {
      return numComps;
   }
   
   //--------------------------------------------------
   
   public static int linearSearch(int[] a, int x) {
      numComps = 0;
      for (int k = 0; k < a.length; k++)//------Line 1
      {
         numComps++;
         if (a[k] == x)//-----------------------Line 2
         {  
            System.out.println("Num Comps = "+numComps);
            return k;//-------------------------Line 3
         }
      }
      System.out.println("Num Comps = "+numComps);
      
      return -1;//------------------------------Line 4
   }
   
   //--------------------------------------------------
   
   private static int select(int[] a, int k) {
   
      //find the location of the smallest element in the array 
      //between position k and the end of the array
      int smallestPos = k; //-------------------Line 5
      for (int j = k; j < a.length; j++) {
         numComps++;
         if (a[j] < a[smallestPos])//----------Line 6
          smallestPos = j;//-----------------Line 7
      }
      return smallestPos;//--------------------Line 8
   }
   
 //--------------------------------------------------
 
   public static void selectionSort(int[] a){
      int pos; //position of the smallest element
      int temp; //temp variable for swap
      numComps = 0;
      
      // array to copy elements from array "a"
      int[] b = new int[a.length];
      
      for (int k = 0; k < a.length-1; k++)//---Line 9
      {
         //find the smallest element
         pos = select(a, k);//-----------------Line 10
         //swap it with k-th element
         temp = a[k];
         a[k] = a[pos];
         a[pos] = temp;
      }
      
      System.out.println("Num Comps = "+numComps);//Line 11
   }
   
   //--------------------------------------------------
   
   public static int binarySearch(int[] a, int x) {
      int lowerLimit = 0;
      int upperLimit = a.length-1;
      int middle = 0;
      numComps = 0;
      while (lowerLimit <= upperLimit)//-------------Line 12
      {
         numComps++;
         middle = (lowerLimit+upperLimit) / 2;
         if (a[middle] == x){//---------------------Line 13
            System.out.println("Num Comps = "+numComps);
            return middle;//------------------------Line 14
         }
         if (a[middle] < x) {//----------------------Line 15
            lowerLimit = middle+1;//----------------Line 16
         } else {
            upperLimit = middle-1;//----------------Line 17
         }
      }
      System.out.println("Num Comps = "+numComps);
      return -1;//-----------------------------------Line 18
    }
    
    //--------------------------------------------------
     
    // method to compare whether two arrays are equal in all means 
    public static boolean compareIntArrays(int a[], int b[]) {
      
      // essential variables
      int lenA, lenB, track = 0;
      lenA = a.length;
      lenB = b.length;
      
      // block executes only if the two arrays are equal in length
      if(lenA == lenB) {
         for(int i = 0; i < lenA; i++) {
            if(a[i] == b[i]) {
               track++; // gets incremented each time a true is encountered
            }
         }
      }
      
      // if the counter equal the lengths of the two arrays a true is returned
      if((track == lenA) && (track == lenB)) {
         return true;
      }
      
      // a false is returned
      return false;
    }
     
     
}

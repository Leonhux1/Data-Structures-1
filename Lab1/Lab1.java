import java.util.*;
import java.text.*;
import java.lang.*;

class EncodeDecode {

   String[] originalList;
   String[] encodedList;
   String[] decodedList;
   
   public String[] getEncodedList() {
      return encodedList;
   }
   
   public String[] getDecodedList() {
      return decodedList;
   }
   
   public EncodeDecode(String[] oL) {
      this.originalList = oL;
      String word = "";
      for(int i = 0; i < originalList.length; i++) {
         word = originalList[i];
         encodedList[i] = encode(word);
      }
      
      // for(int m = 0; m < encodedList.length; m++) {
//          word = encodedList[m];
//          decodedList[m] = decode(word);
//       }
      
   }
   
   public String encode(String originalWord) {
      char[] letter = new char[originalWord.length()];
      
      String key = "abcdefghijklmnopqrstuvwxyz".toUpperCase();
      String value = "cdefghijklmnopqrstuvwxyzab".toUpperCase();
      char[] word = originalWord.toCharArray();
      for(int i = 0; i < originalWord.length(); i++) {
         if(Character.isUpperCase(word[i])) {
            int index = key.indexOf(word[i]);
            letter[i] = value.charAt(index);
            
         }
         
         if(Character.isLowerCase(word[i])) {
            Character.toUpperCase(word[i]);
            int index = key.indexOf(word[i]);
            letter[i] = Character.toLowerCase(value.charAt(index));
         }
      }
      
      String toReturn = new String(letter);
      return toReturn;
   }
}
  
class Test {
   public static void main(String args[]) {
      String[] array = {"home", "HOME"};
      EncodeDecode obj = new EncodeDecode(array);
      String[] array2 = obj.getEncodedList();
      for(int i = 0; i < array2.length; i ++) {
         System.out.println(array2[i]);
      }
   }
} 

   // public String decode(String codedWord) {
//    }
//    
//    public char forwardMap(char ch) {
//    }
//    
//    public char backMap(char ch) {
//    }
//    
   
   
   
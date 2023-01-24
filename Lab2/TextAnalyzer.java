/* Name: Faizan Rafieuddin
   Program Name: TextAnalyzer
   Description: "This program analyzes all the occurences of the
   English alphabet in a text file and prints those to the console
   along with the number of words and lines in the text file". */
   
// Imports for proper functionality
import java.io.*;
import java.util.*;
import java.text.*;
import java.lang.*;

/** This class provides its object with all the
    functionalities that are required to analyze
    text in a file.
*/
class TextAnalyzer {

   /**
   * lineCount: are the number of lines counted so far in the
   * file being analyzed.
   */
   private int lineCount;
   
   /**
   * wordCount: are the number of words counted so far in the 
   * file being analyzed.
   */
   private int wordCount;
   
   /**
   * frequences: are the number of occurences of each word counted
   * so far in a file. Stored as an array with index 0 corresponding
   * to A, index 1 corresponding to B and so on.
   */
   private int[] frequencies = new int[26];
   
   /**
   * Gets the number of lines counted so far in a file.
   * @return the number of lines counted so far in a file.
   */
   public int getLineCount() {
      return lineCount;
   }
   
   //---------------------------------------
   
   /**
   * Default constructor. Initializing all the values to 0;
   */
   public TextAnalyzer() {
      this.lineCount = 0;
      this.wordCount = 0;
      Arrays.fill(this.frequencies, 0, 25, 0);
   }
   
   //---------------------------------------
   
   
   /**
   * Gets the number of words counted so far in a file.
   * @return the number of words counted so far in a file.
   */
   public int getWordCount() {
      return wordCount;
   }
   
   //---------------------------------------
   
   /**
   * Gets the number of occurences of each word in a file.
   * @return the number of occurences of each word in a file.
   */
   public int[] getFrequencies() {
      return frequencies;
   }
   
   //---------------------------------------
   
   /**
   * Analyzes all the text in a file couting and
   * incrementing all the instance variables accordingly.
   * @param fileName This is the name of the file
   *                 that is to be analyzed. The user
   *                 must enter this.
   */
   public void analyzeText(String fileName) {
      
      // Declaring and initializing all necessary variables
      // a String storing all the letters of the English Alphabet
      String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String line = " ";
      String[] words;
      int index = 0;
      
      // Try-Catch block to filter out files that do not exist
      try {
      
      // Creating a File object. Passing it the file's name and 
      // opening the file for input
      File file = new File(fileName);
      Scanner toOpen = new Scanner(file);
      
      // This loop runs until the end of the file is reached
      while((toOpen.hasNextLine())) {
      
         // Reading the text in the files line by line and 
         // incrementing lineCount accordingly
         line = toOpen.nextLine();
         this.lineCount++;
         
         // Splitting, and capitalizing all the words in a line and
         // being stored in a String array
         words = line.toUpperCase().split("\\s+");
         
         // This chunk of code examines each letter in each word
         // present in the "word" array. If the word does not belong
         // to the English alphabet, it is ignored. Otherwise, its
         // corresponding index in the "frequencies" array is updated.
         for(int i = 0; i < words.length; i++) {
            for(int n = 0; n < words[i].length(); n++) {
               if((letters.indexOf(words[i].charAt(n)) != -1)) {
                  index = letters.indexOf(words[i].charAt(n));
                  this.frequencies[index]++;
               }
            }
         }
         
         // Incrementing wordCount regularly
         this.wordCount += words.length;
         
      }
      
      // Closing the file
      toOpen.close();
      
      // If the file is not found, the following message is printed
      } catch(FileNotFoundException e) {
         System.out.println("Oops! the file you specified was not found.");
      }    
   }   
}  



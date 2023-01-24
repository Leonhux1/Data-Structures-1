/* Name: Faizan Rafieuddin
   Program Name: TextAnalyzerTester
   Description: "Acts as a driver for the TextAnalyzer class".
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.lang.*;

public class TextAnalyzerTester
{
    public static void main(String[] args)
    {
     TextAnalyzer ta = new TextAnalyzer();
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the name of the file: ");
	  String filename = sc.next();

        ta.analyzeText(filename);
        
  System.out.println("Number of Lines: " + ta.getLineCount());
        System.out.println("Number of Words: " + ta.getWordCount());
        System.out.println("Letter Counts");
        int[] frequencies = ta.getFrequencies();
        for (int k = 0; k < frequencies.length; k++)
            System.out.println("Frequency of " + (char)('A'+ k) + 
            ": "+frequencies[k] + " ");
        System.out.println();
    }
}

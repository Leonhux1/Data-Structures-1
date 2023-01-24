import java.io.*;
import java.util.*;
import java.text.*;

public class StringExercise
{
    public static void main(String[] args)
    {
        String collegeName = "The College at Brockport, State University of New York";
        String name1 = "John Smith";
        String name2 = "Jack Smith";
        String name3 = "JoHN SMiTH";
        
        System.out.println("DATA: ");
        System.out.println(collegeName);
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        
        
        System.out.println(collegeName.charAt(10));

        System.out.println(collegeName.length());
        
        System.out.println(name1.compareTo(name2));

        System.out.println(name2.compareTo(name1));

        System.out.println(name1.compareTo(name1));
        
        System.out.println(name1.concat(name2));

        System.out.println(name1 + " " + name2);
        
         System.out.println(collegeName.endsWith("York"));  
  
System.out.println(collegeName.startsWith("The C"));
         
        System.out.println(name1.equals(name2));

        System.out.println(name2.equals(name3));
        System.out.println(name1.equalsIgnoreCase(name3));
        
        int intNum = 10; 
        double realNum = 23.4567;
        String formattedString = String.format("intNum = %3d, realNum = %3.2f", intNum, realNum);
        System.out.println(formattedString);
        
        System.out.println(collegeName.indexOf('o'));
       
        System.out.println(name1.replace('h', 'H'));

        System.out.println(name1);
        
        System.out.println(name1.substring(2, 7));
        
        char[] letters = name1.toCharArray();
        for (char c : letters)
            System.out.print(c + "  ");
        System.out.println();
        
        System.out.println(name1.toLowerCase());

        System.out.println(name1.toUpperCase());
        
        String test = "     abcd efgh      ";
        System.out.println(test.length());

        System.out.println(test.trim() + 
        " trimmed length = " + test.trim().length());
    }
}

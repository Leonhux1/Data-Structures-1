package lab01;

/**
 * Converts a list of mixed letter-digit telephone numbers
 * into pure telephone numbers using the standard mapping.
 * 
 * @author T.M. Rao 
 * @version May 2017
 */
public class TelephoneListConverter
{
    //-----------------------------------------------------
    //Input list of mixed numbers
    private String[] mixedTelNumList;   
    
    //-----------------------------------------------------
    //Resulting list of pure numbers
    private String[] pureTelNumList;

    //-----------------------------------------------------
    public TelephoneListConverter(String[] mixedList)
    {
        //Assign parameter to instance variable
        mixedTelNumList = mixedList;
        
        //Create another string array of the same size
        pureTelNumList = new String[mixedTelNumList.length];
        
        //Do the mapping
        for (int index = 0; index < mixedTelNumList.length; index++)
        {
            pureTelNumList[index] = mapString(mixedTelNumList[index]);   
        }
    }
    
    //-----------------------------------------------------
    /**
     * @param mixedNumber: A string object
     * @return String: result of the mapping
     */
    private String mapString(String mixedNumber)
    {
        //Start with empty result string
        String result = "";
        
        //for each character in the mixedNumber
        for (int index = 0; index < mixedNumber.length(); index++)
        {
            //map it to number and concat it to the result
            result = result + mapChar(mixedNumber.charAt(index));
        }
        
        //return result string
        return result;
    }
    
    
    //-----------------------------------------------------
    /**
     * This maps one character to one number using the standard
     * mapping. Any chars other than numbers, uppercase or lowercase
     * letters, will be flagged as errors and left unchanged
     */
    private char mapChar(char ch)
    {
    	//map the ch to upper case
    	char thisChar = Character.toUpperCase(ch);
    	
        if (thisChar >= 'A' && thisChar <= 'C')         
            return '2';
        if (thisChar >= 'D' && thisChar <= 'F')   
            return '3';
        if (thisChar >= 'G' && thisChar <= 'I')   
            return '4';
        if (thisChar >= 'J' && thisChar <= 'L')   
            return '5';
        if (thisChar >= 'M' && thisChar <= 'O')
            return '6';
        if (thisChar >= 'P' && thisChar <= 'S')
            return '7';
        if (thisChar >= 'T' && thisChar <= 'V')           
            return '8';
        if (thisChar >= 'W' && thisChar <= 'Z')
            return '9';
        if (thisChar >= '0' && thisChar <= '9')
            return thisChar;
        if (thisChar == '-') 
        	return thisChar;
        
        //Any other character is invalid. We return $
        return '$';
    }

    //-----------------------------------------------------
    String[] getPureTelNumList()
    {
        return pureTelNumList;
    }
}

package lab01;

/**
 * A Tester class for the TelephoneListConverter
 * @author TMR 
 * @version May 2017
 */
public class TelephoneListConverterTester
{
    //--------------------------------------------------------------
    public static void main(String[] args)
    {
        //Create test data
        String[] mixedNumbers = {
                "777-HOME", "777-home", "777-SAVE",
                "777-save", "1-800-TALK-LAW", "1-800-talk-law",
                "123-4567", "123#4567", "12$$%%&&",
                "ABC DEF GHHH", "IJK-LMN-OPQR", "STU-VWX-YZZZ",
                "abc def ghhh", "ijk-lmn-opqr", "stu-vwx-yzzz"
        };
        
        String[] expectedAnswers = {
        		"777-4663", "777-4663", "777-7283",
        		"777-7283", "1-800-8255-529", "1-800-8255-529",
        		"123-4567", "123$4567", "12$$$$$$",
        		"222$333$4444", "455-566-6777", "788-899-9999",
        		"222$333$4444", "455-566-6777", "788-899-9999"
        };
        //Create the converter object
        TelephoneListConverter tlc = new TelephoneListConverter(mixedNumbers);
        
        //Get the mapped list
        String[] pureTelNumList = tlc.getPureTelNumList();
        
        //Print the table
        System.out.println("Table of Test Results: "+
        	"\n------------------------------------------------" + 
            "\nInput Value \tExpected Result \tComputed Result ");
        for (int index = 0; index < pureTelNumList.length; index++)
        {
            System.out.println(mixedNumbers[index] + "\t" +
            		expectedAnswers[index] + "\t" + 
				pureTelNumList[index]); 
        }
    }
}

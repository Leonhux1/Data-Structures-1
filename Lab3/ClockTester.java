// pre-defined package
package clocks;

// tester class for the Clock class
public class ClockTester {
   public static void main(String args[]) {
   
      // Clock object
      Clock clk= new Clock(); 
      
      // print current time
      System.out.println("Current Time is "+clk.getHour()+" hours "+clk.getMinute()+" minutes "+clk.getSecond()+" seconds ");

      // increment by 1 and print current time
      clk.tick(); 
      System.out.println("Current Time is "+clk.getHour()+" hours "+clk.getMinute()+" minutes "+clk.getSecond()+" seconds ");
      
      // increment by 1 and print current time
      clk.tick(); 
      System.out.println("Current Time is "+clk.getHour()+" hours "+clk.getMinute()+" minutes "+clk.getSecond()+" seconds ");
      
      // increment by 1 and print current time
      clk.tickAhead(1); 
      System.out.println("Current Time is "+clk.getHour()+" hours "+clk.getMinute()+" minutes "+clk.getSecond()+" seconds ");
      
      // increment by 5 and print current time
      clk.tickAhead(5); 
      System.out.println("Current Time is "+clk.getHour()+" hours "+clk.getMinute()+" minutes "+clk.getSecond()+" seconds ");
      
      // increment by 1 minute and print current time
      clk.tickAhead(60); 
      System.out.println("Current Time is "+clk.getHour()+" hours "+clk.getMinute()+" minutes "+clk.getSecond()+" seconds ");
      
      // increment by 1 hour and print current time
      clk.tickAhead(3600); 
      System.out.println("Current Time is "+clk.getHour()+" hours "+clk.getMinute()+" minutes "+clk.getSecond()+" seconds ");
      
      // increment by 24 hours and print current time
      clk.tickAhead(86400); 
      System.out.println("Current Time is "+clk.getHour()+" hours "+clk.getMinute()+" minutes "+clk.getSecond()+" seconds ");
   } 
}
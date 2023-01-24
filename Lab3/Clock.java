// pre-defined package
package clocks;

// imports
import java.util.*;
import java.text.*;

// class Clock that implements the IClock interface
public class Clock implements IClock {

   // variables to hold time parameters
   private int second;
   private int minute;
   private int hour;
  
   // default constructor
   public Clock()  {
   
      // The clock gets current time from Java’s Calendar class
      Calendar rightNow = Calendar.getInstance();
      second = rightNow.get(Calendar.SECOND);
      minute = rightNow.get(Calendar.MINUTE);
      hour = rightNow .get(Calendar.HOUR_OF_DAY); 
   }
   
   // accessor methods for the instance variables
   public int getSecond() {
      return second; 
   }
   
   public int getMinute() {
      return minute; 
   }
   
   public int getHour() {
      return hour;
   }
   
   // method that increments the time accordingly
   public void tick() { 
      
      // add 1 second every time tick method called
      second+=1; 
      
      // if seconds are already 59 then this block is executed
      if(second>=60) {
         second-=60; //make seconds 0 or subtract from 60
         minute+=1; //and make minute increase
      }
      
      // by increasing minutes if minute crossed 60 than minute will be zero and hour will increment
      if(minute>=60) {
         minute-=60;
         hour+=1; 
      }
      
      // by increasing hour if hour crossed 24 than make it zero
      if(hour>23) {  
         hour=0; 
      }
   }
   
   // ticks the clock ahead by "numSecs" time provided by the user
   public void tickAhead(int numSecs) { 
      for(int i=0;i<numSecs;i++) {
         tick(); 
      }
   }
}
  
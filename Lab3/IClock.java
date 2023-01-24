/* Partner 1 Name: Christopher Coonan
   Partner 2 Name: Faizan Rafieuddin
*/

// pre-defined package
package clocks; 

// imports
import java.util.*; // to use the Calendar class 
import java.text.*;

// interface called IClock having appropriate methods
interface IClock { 
   public int getSecond();
   public int getMinute();
   public int getHour();
   public void tick();
   public void tickAhead(int numSecs);
}
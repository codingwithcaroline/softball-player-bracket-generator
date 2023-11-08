import java.util.Comparator;
/**
*This project is Part 2 of 
*three that will involve the 
*rating and reporting for 
*softball players. 
*@author Caroline Kirkconnell
*@version 04/18/19
*This program implements the
*Comparator interface for
*SoftballPlayer objects in relation
*to player name.
*/
public class NameComparator implements Comparator<SoftballPlayer> {
/**
*Compares two softball players based on their ratings.
*@return 1 or 0.
*@param p1 is player one.
*@param p2 is player two.
*/
   public int compare(SoftballPlayer p1, SoftballPlayer p2) {
      String name1 = p1.getName();
      String name2 = p2.getName();
      name1.trim();
      name2.trim();
      String lastName = "";
      String firstName = "";
      String lastName2 = "";
      String firstName2 = "";
      int i = name1.indexOf(" ");
      lastName = name1.substring(i + 1);
      firstName = name1.substring(0, i);
   
      i = name2.indexOf(" ");
   
      lastName2 = name2.substring(i + 1);
      firstName2 = name2.substring(0, i);
        
      lastName.toLowerCase();
      firstName.toLowerCase();
      lastName2.toLowerCase();
      firstName2.toLowerCase();
      return (lastName + firstName).compareTo(lastName2 + firstName2);
      
   }
}
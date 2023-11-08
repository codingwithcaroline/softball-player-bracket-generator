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
*to player rating.
*/
public class RatingComparator implements Comparator<SoftballPlayer>
{
/**
* Compares two softball players by ratings.
* @return an int, 1 if greater, -1, if less, 0 if equal.
* @param p1 player1
* @param p2 player2
*/
   public int compare(SoftballPlayer p1, SoftballPlayer p2)
   {
      if (p1.rating() > p2.rating())
      {
         return -1;
      }
      else if (p1.rating() < p2.rating())
      {
         return 1;
      }
      else
      {
         return 0;
      }
   }
}
import org.junit.Assert;
import org.junit.Test;
/**
*This is a test for
*RatingComparator.
*@author Caroline Kirkconnell
*@version 04/10/19
*/
public class RatingComparatorTest {
   
   /**
   * Tests the different ways ratings can be compared.
   */
   @Test public void ratingCompTest()
   {
      Outfielder p1 = new Outfielder("32", "Jackie Lee", "RF", 1.0,
                           .892, 1.32);
      Outfielder p2 = new Outfielder("32", "Jackie Lee", "RF", 2.0,
                           .892, 1.32);
      Outfielder p3 = new Outfielder("32", "Jackie Lee", "RF", 1.0,
                           .892, 1.32); 
      RatingComparator rcomp = new RatingComparator();                       
      Assert.assertEquals(1, rcomp.compare(p1, p2), 0);
      Assert.assertEquals(-1, rcomp.compare(p2, p1), 0);
      Assert.assertEquals(0, rcomp.compare(p1, p3), 0);   
   }   
}
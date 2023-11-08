import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
*This is a test for
*Infielder.
*@author Caroline Kirkconnell
*@version 04/03/19
*/
public class InfielderTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
      *
      */
   @Test public void getToStringTest() {
      Infielder p2 = new Infielder("23", "Jackie Smith", "3B",
         1.25, .275, .850);
      Assert.assertTrue(p2.toString().contains("Specialization"));
   }
   
      /**
      *
      */
   @Test public void getInfielderFieldingAvgTest() {
      Infielder p2 = new Infielder("23", "Jackie Smith", "3B",
         1.25, .275, .850);
      p2.setInfielderFieldingAvg(1);
      Assert.assertEquals(1, p2.getInfielderFieldingAvg(), 0.0001);
   }
   
      /**
      *
      */
   @Test public void ratingTest() {
      Infielder p2 = new Infielder("23", "Jackie Smith", "3B",
         1.25, .275, .850);
      Assert.assertEquals(2.9218750000000004, p2.rating(), 0.0001);
   }
}

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
*This is a test for
*ReliefPitcher.
*@author Caroline Kirkconnell
*@version 04/03/19
*/
public class ReliefPitcherTest {


 /** Fixture initialization (common initialization
   *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. **/
   @Test public void getSavesTest() {
      ReliefPitcher p4 = new ReliefPitcher("34", "Sammi James", "LHP", 
         2.0, .125, 5, 4, 3.85, 17);         
      p4.setSaves(1);
      Assert.assertEquals(1, p4.getSaves(), 0.0001);
   }
   
   /**
   *
   */
   @Test public void ratingTest() {
      ReliefPitcher p4 = new ReliefPitcher("34", "Sammi James", "LHP", 
         2.0, .125, 5, 4, 3.85, 17);       
      Assert.assertEquals(2.4742268041237114, p4.rating(), 0.0001);
   }
   
   /**
   *
   */
   @Test public void getStatsTest() { 
      ReliefPitcher p4 = new ReliefPitcher("34", "Sammi James", "LHP", 
         2.0, .125, 5, 4, 3.85, 17);  
      Assert.assertTrue(p4.stats().contains("wins"));
   }
}

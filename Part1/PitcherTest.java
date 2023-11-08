import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
*This is a test for
*Pitcher.
*@author Caroline Kirkconnell
*@version 04/03/19
*/
public class PitcherTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }



      /** A test that always fails. **/
   @Test public void getWinsTest() {
      Pitcher p3 = new Pitcher("43", "Jo Williams", "RHP", 
         2.0, .125, 22, 4, 2.85);
      p3.setWins(1);
      Assert.assertEquals(1, p3.getWins(), 0.0001);
   }
   
      /** A test that always fails. **/
   @Test public void getLossesTest() {
      Pitcher p3 = new Pitcher("43", "Jo Williams", "RHP", 
         2.0, .125, 22, 4, 2.85);
      p3.setLosses(1);
      Assert.assertEquals(1, p3.getLosses(), 0.0001);
   }
   
     /** A test that always fails. **/
   @Test public void getEraTest() {
      Pitcher p3 = new Pitcher("43", "Jo Williams", "RHP", 
         2.0, .125, 22, 4, 2.85);
      p3.setEra(1.0);
      Assert.assertEquals(1.0, p3.getEra(), 0.0001);
   }
   
   /**
      *
      */
   @Test public void ratingTest() {
      Pitcher p3 = new Pitcher("43", "Jo Williams", "RHP", 
         2.0, .125, 22, 4, 2.85);
      Assert.assertEquals(3.74025974025974, p3.rating(), 0.0001);
   }
   
   /**
      *
      */
   @Test public void getStatsTest() {
      Pitcher p3 = new Pitcher("43", "Jo Williams", "RHP", 
         2.0, .125, 22, 4, 2.85);
      Assert.assertTrue(p3.stats().contains("wins"));
   }
}

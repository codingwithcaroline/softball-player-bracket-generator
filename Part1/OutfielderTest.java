import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
*This is a test for
*Outfielder.
*@author Caroline Kirkconnell
*@version 04/03/19
*/
public class OutfielderTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. **/
   @Test public void getNumberTest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 1.0, .375, .950);
      p1.setNumber("40");
      Assert.assertEquals("40", p1.getNumber());
   }
   
         /** A test that always fails. **/
   @Test public void getNameTest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 1.0, .375, .950);
      p1.setName("Pat");
      Assert.assertEquals("Pat", p1.getName());
   }
   
   /**
      *
      */
   @Test public void getPositionTest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 
         1.0, .375, .950);
      p1.setPosition("Reciever");
      Assert.assertEquals("Reciever", p1.getPosition());
   }
   
   /**
      *
      */
   @Test public void getBattingAvgTest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 
         1.0, .375, .950);
      p1.setBattingAvg(2.0);
      Assert.assertEquals(2.0, p1.getBattingAvg(), 0.0001);
   }
   
   /**
      *
      */
   @Test public void getSpecializationFactorTest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 
         1.0, .375, .950);
      p1.setSpecializationFactor(.475);
      Assert.assertEquals(.475, p1.getSpecializationFactor(), 0.0001);
   }
   
   /**
      *
      */
   @Test public void getCountest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 
         1.0, .375, .950);
      p1.resetCount();
      Assert.assertEquals(0, p1.getCount(), 0.0001);
   }
   
   /**
      *
      */
   @Test public void getStatsTest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 
         1.0, .375, .950);
      Assert.assertTrue(p1.stats().contains(".375"));
   }
   
   /**
      *
      */
   @Test public void getToStringTest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 
         1.0, .375, .950);
      Assert.assertTrue(p1.toString().contains("Specialization"));
   }
   
   /**
      *
      */
   @Test public void getOutfielderFieldingAvgTest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 
         1.0, .375, .950);
      p1.setOutfielderFieldingAvg(1);
      Assert.assertEquals(1, p1.getOutfielderFieldingAvg(), 0.0001);
   }
   
   /**
      *
      */
   @Test public void ratingTest() {
      Outfielder p1 = new Outfielder("32", "Pat Jones", "RF", 
         1.0, .375, .950);
      Assert.assertEquals(3.5625, p1.rating(), 0.0001);
   }
}

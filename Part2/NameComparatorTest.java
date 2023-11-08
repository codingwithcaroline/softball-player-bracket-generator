import org.junit.Assert;
import org.junit.Test;
/**
*This is a test for
*NameComparator.
*@author Caroline Kirkconnell
*@version 04/10/19
*/
public class NameComparatorTest {
   /**
   * Tests all 4 ways names can be compared.
   */
   @Test public void nameCompTest()
   {
      Outfielder p1 = new Outfielder("32", "Susan Johnson", "RF", 1.0,
                           .892, 1.32);
      Outfielder p2 = new Outfielder("32", "Joe Smith", "RF", 1.0,
                           .892, 1.32);                     
      Outfielder p3 = new Outfielder("32", "Susan Johnson", "RF", 1.0,
                           .892, 1.32);
      Outfielder p4 = new Outfielder("32", "Joe Smith", "RF", 1.0,
                           .892, 1.32);
      Outfielder p5 = new Outfielder("32", "Michael Scott", "RF", 1.0,
                           .892, 1.32);
      NameComparator ncomp = new NameComparator();
      Assert.assertEquals(-9, ncomp.compare(p1, p2), 0);
      Assert.assertEquals(0, ncomp.compare(p1, p3), 0);
      Assert.assertEquals(9, ncomp.compare(p4, p1), 0);
      Assert.assertEquals(-9, ncomp.compare(p1, p5), 0);                 
   }
}

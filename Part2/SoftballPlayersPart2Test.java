import org.junit.Assert;
import org.junit.Test;
import java.io.IOException;
/**
*This is a test for
*SoftballPlayersPart2.
*@author Caroline Kirkconnell
*@version 04/10/19
*/
public class SoftballPlayersPart2Test {

   /** A test that always fails. **/
   /**
   *@throws IOException - used
   */
   @Test public void softballPlayersPart2Test() throws IOException {
   // If you are checking for args.length == 0
   // in SoftballPlayersPart2, the following should exercise
   // the code for true.
      String[] args1 = {}; // an empty String[]
      SoftballPlayersPart2.main(args1);
      Assert.assertEquals("Team count should be 0. ",
                           0, SoftballTeam.getTeamCount());
                           
      String[] args2 = {"softball_player_data1.csv"};
   // element args2[0] is the file name
      SoftballPlayersPart2.main(args2);
      Assert.assertEquals("Team count should be 1. ",
         1, SoftballTeam.getTeamCount());
   // to exercise the default constructor
      SoftballPlayersPart2 app = new SoftballPlayersPart2();
   
      String[] args3 = {"softball_player_data2.csv"};
      // element args2[0] is the file name
      SoftballPlayersPart2.main(args3);
      Assert.assertEquals("Team count should be 1. ",
         2, SoftballTeam.getTeamCount());
      
      String[] args4 = {"softball_player_data3.large_team_file.csv"};
      // element args2[0] is the file name
      SoftballPlayersPart2.main(args4);
      Assert.assertEquals("Team count should be 1. ",
         3, SoftballTeam.getTeamCount());
   
   }
}

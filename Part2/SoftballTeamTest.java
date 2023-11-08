import org.junit.Assert;
import org.junit.Test;
import java.io.IOException;
/**
*This is a test for
*SoftballTeam.
*@author Caroline Kirkconnell
*@version 04/10/19
*/
public class SoftballTeamTest {

   /** A test that always fails. **/
   @Test public void softballTeamTest() {
      SoftballTeam st = new SoftballTeam();
      st.setTeamName("Coders");
      Assert.assertEquals("Coders", st.getTeamName());
   }
   
   /**
   *This is a test for readPlayerFile(String fileName).
   *@throws IOException - used.
   */
   @Test public void readPlayerFileTest() throws IOException {
      SoftballTeam st = new SoftballTeam();
      st.readPlayerFile("softball_player_data3.large_team_file.csv");
      Assert.assertEquals(24, st.getPlayerCount());
      st.setPlayerCount(0);
      Assert.assertEquals(0, st.getPlayerCount());
   }
   
   /**
   *This is a test for roster.
   */
   @Test public void rosterTest() {
      SoftballTeam st = new SoftballTeam();
      SoftballPlayer[] roster = new SoftballPlayer[24];
      roster[0] = new ReliefPitcher("34", "Sammi James", "LHP", 
         2.0, .125, 5, 4, 3.85, 17); 
      st.setRoster(roster);
      Assert.assertArrayEquals(roster, st.getRoster());
   }
   
   /**
   *This is a test for excludedRecords and other methods of similar type.
   */
   @Test public void excludedRecordsTest() {
      SoftballTeam st = new SoftballTeam();
      String[] excludedRecords = new String[30];
      st.setExcludedRecords(excludedRecords);
      Assert.assertArrayEquals(excludedRecords, st.getExcludedRecords());
      //playerCount test
      st.setPlayerCount(1);
      Assert.assertEquals(1, st.getPlayerCount());
      //excludedCount test
      st.setExcludedCount(1);
      Assert.assertEquals(1, st.getExcludedCount());
      //ignoredCount test
      st.setIgnoredCount(1);
      Assert.assertEquals(1, st.getIgnoredCount());
      //resetTeamCount test
      st.resetTeamCount();
      Assert.assertEquals(0, st.getTeamCount());
   }
}
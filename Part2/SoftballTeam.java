import java.util.Scanner;
import java.io.IOException;
import java.util.Arrays;
import java.io.File;
import java.text.DecimalFormat;
/**
*This project is Part 2 of 
*three that will involve the 
*rating and reporting for 
*softball players. 
*@author Caroline Kirkconnell
*@version 04/18/19
*This program represents a team
*of softball players and includes
*several specialized methods.
*/
public class SoftballTeam {

//Instance variables
   private String teamName;
   private SoftballPlayer[] roster;
   private int playerCount;
   private String[] excludedRecords;
   private int excludedCount;
   private int ignoredCount;

//Class variable
   private static int teamCount;

//Constants
/**
*
*/
   public static final int MAX_PLAYERS = 24;
/**
*
*/
   public static final int MAX_EXCLUDED = 30;

//Constructor
/**
*
*/
   public SoftballTeam() {
      teamName = "";
      roster = new SoftballPlayer[MAX_PLAYERS];
      playerCount = 0;
      excludedRecords = new String[MAX_EXCLUDED];
      excludedCount = 0;
      ignoredCount = 0;
      teamCount++;
   }

//Methods begin.
/**
*Gets the team name.
*@return a string reprsenting the team name.
*/
   public String getTeamName() {
      return teamName;
   }

/**
*Sets the team name.
*@param teamNameIn team name.
*/
   public void setTeamName(String teamNameIn) {
      teamName = teamNameIn;
   }

/**
*Gets the softball player roster.
*@return array of the softball player roster.
*/
   public SoftballPlayer[] getRoster() {
      return roster;
   }

/**
*Sets the softball player roster.
*@param rosterIn is the roster.
*/
   public void setRoster(SoftballPlayer[] rosterIn) {
      roster = rosterIn;
   }

/**
*Gets the player count.
*@return an int representing the player count.
*/
   public int getPlayerCount() {
      return playerCount;
   }

/**
*Sets the player count.
*@param playerCountIn is the playerCount.
*/
   public void setPlayerCount(int playerCountIn) {
      playerCount = playerCountIn;
   }

/**
*Gets the excluded records.
*@return a String array with the excluded records.
*/
   public String[] getExcludedRecords() {
      return excludedRecords;
   }

/**
*Sets the excluded records.
*@param excludedRecordsIn is the excludedRecords.
*/
   public void setExcludedRecords(String[] excludedRecordsIn) {
      excludedRecords = excludedRecordsIn;
   }

/**
*Gets the excluded count.
*@return an int representing excluded count.
*/
   public int getExcludedCount() {
      return excludedCount;
   }

/**
*Sets the excluded count.
*@param excludedCountIn is the excludedCount.
*/
   public void setExcludedCount(int excludedCountIn) {
      excludedCount = excludedCountIn;
   }

/**
*Gets the ignored Count.
*@return an int representing ignored count.
*/
   public int getIgnoredCount() {
      return ignoredCount;
   }

/**
*Sets the ignored count.
*@param ignoredCountIn is the ignoredCount.
*/
   public void setIgnoredCount(int ignoredCountIn) {
      ignoredCount = ignoredCountIn;
   }

/**
*Gets the team count.
*@return an int representing team count.
*/
   public static int getTeamCount() {
      return teamCount;
   }

/**
*Resets the team count.
*
*/
   public static void resetTeamCount() {
      teamCount = 0;
   }

/**
*Reads the player file.
*@param fileName is the name of the file.
*@throws IOException used if there is no file. 
*/
   public void readPlayerFile(String fileName) throws IOException {
      Scanner scanFile = new Scanner(new File(fileName));
      Scanner scanRows;
      teamName = scanFile.nextLine();
   
      while (scanFile.hasNext()) {
         String line = scanFile.nextLine();
         scanRows = new Scanner(line);
         scanRows.useDelimiter(",");
         String type = scanRows.next();
         char chartype = type.charAt(0);
         String number = scanRows.next();
         String name = scanRows.next();
         String position = scanRows.next();
         double specializationFactor = Double.parseDouble(scanRows.next());
         double battingAvg = Double.parseDouble(scanRows.next());
         if (playerCount < MAX_PLAYERS) {
            switch (chartype) {
               case 'O':
                  double outfielderFieldingAvg = Double.parseDouble(
                                             scanRows.next());
                  Outfielder player = new Outfielder(number, name, position,
                     specializationFactor, battingAvg, outfielderFieldingAvg);
                  roster[playerCount] = player;
                  playerCount++;  
                  break;
               
               case 'I': 
               
                  double infielderFieldingAvg 
                     = Double.parseDouble(scanRows.next());
                  Infielder player2 = new Infielder(number, name, position,
                     specializationFactor, battingAvg, infielderFieldingAvg);
                  roster[playerCount] = player2;
                  playerCount++;
                  break;
               
               case 'P':
                  int wins = Integer.parseInt(scanRows.next());
                  int losses = Integer.parseInt(scanRows.next());
                  double era = Double.parseDouble(scanRows.next());
                  Pitcher player3 
                     = new Pitcher(number, name, position, specializationFactor,
                                      battingAvg, wins, losses, era);
                  roster[playerCount] = player3;
                  playerCount++; 
                  break; 
                                     
               case 'R':
                  int wins2 = Integer.parseInt(scanRows.next());
                  int losses2 = Integer.parseInt(scanRows.next());
                  double era2 = Double.parseDouble(scanRows.next());
                  int saves = Integer.parseInt(scanRows.next());
                  ReliefPitcher player4 
                     = new ReliefPitcher(number, name, position,
                     specializationFactor, battingAvg, wins2, 
                     losses2, era2, saves);
                  roster[playerCount] = player4;
                  playerCount++;
                  break;
               
               default: 
                  excludedRecords[excludedCount] 
                     = "*** invalid category *** " + line;
                  excludedCount++;
                  break;
            }
         }
         else if (excludedCount < MAX_EXCLUDED) {
            excludedRecords[excludedCount] = "Maximum player count of"
                                         + " 24 exceeded for: " + line;
            excludedCount++;
         }
         else {
            ignoredCount++;
         }
      }
   }

/**
*Generates a report in the order players are registered.
*@return a string of players.
*/
   public String generateReport() {
      String output = "\n---------------------------------------\n";
      output += "Team Report for " + teamName;
      output += "\n---------------------------------------\n";
      for (int i = 0; i < playerCount; i++)
      {
         output += "\n" + roster[i] + "\n";
      }
      return output;
   }

/**
*Generates a report by player number.
*@return a string of players by number.
*/
   public String generateReportByNumber() {
      String output = "\n---------------------------------------\n";
      output += "Team Report for " + teamName + " (by Number)";
      output += "\n---------------------------------------";
      SoftballPlayer[] temp = Arrays.copyOf(roster, playerCount);
      Arrays.sort(temp);
      for (int i = 0; i < playerCount; i++)
      {
         output += "\n" + temp[i].getNumber();
         output += " " + temp[i].getName();
         output += " " + temp[i].getPosition();
         output += " " + temp[i].stats();
      }
      return output;
   }
/**
*Generates a report by player name.
*@return a string of players by name.
*/
   public String generateReportByName() {
      String output = "\n---------------------------------------\n";
      output += "Team Report for " + teamName + " (by Name)";
      output += "\n---------------------------------------";
      SoftballPlayer[] bp = Arrays.copyOf(roster, playerCount);
      Arrays.sort(bp, new NameComparator());
      for (int i = 0; i < playerCount; i++)
      {
         output += "\n" + bp[i].getNumber();
         output += " " + bp[i].getName();
         output += " " + bp[i].getPosition();
         output += " " + bp[i].stats();
      }
      return output;
   }
/**
*Generates a report by player rating.
*@return a string of player by rating.
*/
   public String generateReportByRating() {
      String output = "\n---------------------------------------\n";
      output += "Team Report for " + teamName + " (by Rating)";
      output += "\n---------------------------------------";
      RatingComparator rcomp = new RatingComparator();
      SoftballPlayer[] bp = Arrays.copyOf(roster, playerCount);
   
      Arrays.sort(bp, rcomp);
      for (int i = 0; i < playerCount; i++)
      { 
         DecimalFormat df = new DecimalFormat("0.000");
         output += "\n" + df.format(bp[i].rating());
         output += " " + bp[i].getNumber();
         output += " " + bp[i].getName();
         output += " " + bp[i].getPosition();
         output += " " + bp[i].stats() + "\n";
      }
      return output;
   }
/**
*Generates an excluded record report by excluded players.
*@return a string of excluded players.
*/
   public String generateExcludedRecordsReport() {
      String output = "\n---------------------------------------";
      output += "Excluded Records Report\n";
      output += "---------------------------------------";
      for (int i = 0; i < excludedCount; i++)
      {
         output += "\n" + excludedRecords[i];
      }
      return output;
   }
}

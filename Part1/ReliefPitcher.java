import java.text.DecimalFormat;
/**
*This project is the first
*of three that will involve
*the rating and reporting
*for softball players.
*@author Caroline Kirkconnell
*@version 04/03/19
*This project contains contains a class
*that derives from SoftballPlayer.
*/
public class ReliefPitcher extends Pitcher {

//instance variables
   private int saves;

//constructor
/**
*@param playerNumberIn - used
*@param playerNameIn - used
*@param playerPositionIn - used
*@param playerSpecializationIn - used
*@param playerBattingAverageIn - used
*@param winsIn - used
*@param lossesIn - used
*@param eraIn - used
*@param savesIn - used
*/
   public ReliefPitcher(String playerNumberIn, String playerNameIn, 
      String playerPositionIn, double playerSpecializationIn, 
      double playerBattingAverageIn, int winsIn, int lossesIn, 
      double eraIn, int savesIn) {
      super(playerNumberIn, playerNameIn, playerPositionIn, 
         playerSpecializationIn, playerBattingAverageIn, 
         winsIn, lossesIn, eraIn);
      saves = savesIn;
   }
//methods begin
/**
*@return - used
*/
   public int getSaves() {
      return saves;
   }

/**
*@param savesIn - used
*/
   public void setSaves(int savesIn) {
      saves = savesIn;
   }

/**
*@return - used
*/
   public double rating() {
      return BASE_RATING * playerSpecialization 
         * (1 / (1 + era)) * ((wins - losses + saves) / 30.0);
   }

/**
*@return - used
*/
   public String stats() {
      DecimalFormat df = 
         new DecimalFormat(".000");
      return wins + " wins, " + losses + " losses, " 
         + saves + " saves, " + era + " ERA";
   }
}
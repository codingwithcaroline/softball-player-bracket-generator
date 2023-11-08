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

public class Pitcher extends SoftballPlayer {

//instance variables
   protected int wins;
   protected int losses;
   protected double era;

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
*/
   public Pitcher(String playerNumberIn, String playerNameIn, 
      String playerPositionIn, double playerSpecializationIn, 
      double playerBattingAverageIn, int winsIn, 
      int lossesIn, double eraIn) {
      super(playerNumberIn, playerNameIn, playerPositionIn, 
         playerSpecializationIn, playerBattingAverageIn);
      wins = winsIn;
      losses = lossesIn;
      era = eraIn;
   }

//methods begin
/**
*@return - used
*/
   public int getWins() {
      return wins;
   }

/**
*@param winsIn - used
*/
   public void setWins(int winsIn) {
      wins = winsIn;
   }

/**
*@return - used
*/
   public int getLosses() {
      return losses;
   }

/**
*@param lossesIn - used
*/
   public void setLosses(int lossesIn) {
      losses = lossesIn;
   }

/**
*@return - used
*/
   public double getEra() {
      return era;
   }

/**
*@param eraIn - used
*/
   public void setEra(double eraIn) {
      era = eraIn;
   }

/**
*@return - used
*/
   public double rating() {
      return BASE_RATING * playerSpecialization 
         * (1 / (1 + era)) * ((wins - losses) / 25.0);
   }

/**
*@return - used
*/
   public String stats() {
      return wins + " wins, " + losses + " losses, " + era + " ERA";
   }
}

